package controllers.User;

import controllers.Application.AppTags;
import controllers.Application.AppTags.Session;
import libs.Mailer;
import models.CRUD;
import models.Finance.PaymentItemBasic;
import models.Order.OrderItemBasic;
import models.User.*;
import org.jetbrains.annotations.NotNull;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.RequireCSRFCheck;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.mailer.MailerClient;
import play.mvc.*;
import views.html.User.Customer.*;
import views.html.User.Customer.editProfile;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.buildCookie;
import static controllers.Application.AppTags.AppCookie.buildExpiredCookie;

/**
 * Created by cybex on 2017/07/21.
 */

//@With(HttpsRequired.class)
public class CustomerController extends Controller implements CRUD {

    @Inject
    FormFactory formFactory;
    @Inject
    play.Environment environment;
    @Inject
    MailerClient mailerClient;
    @Inject
    HttpExecutionContext httpExecutionContext;

    @Inject
    public CustomerController(HttpExecutionContext ec) {
        this.httpExecutionContext = ec;
    }

    public CompletionStage<Result> viewPayment(String paymentId) {
        return CompletableFuture.completedFuture(Results.TODO);
    }

    public CompletionStage<Result> viewOrder(String ordersId) {
        return CompletableFuture.completedFuture(Results.TODO);
    }

    /**
     * <b>This should never be routed to</b>
     * <p>
     * Index method renders the customers homepage, this includes showing information about the customer
     * <ul>
     * <li>Funds available</li>
     * <li>Orders pending</li>
     * <li>etc</li>
     * </ul>
     * <p>
     * This depends on whether they have a saved session, if not, then redirect to login page
     *
     * @return
     */
//    @With(SessionVerifier.Load.class)
//    @Security.Authenticated(SessionVerifier.Verifier.class)
    public Result index() {
        if (!Session.checkExistingSession(session())) {
            Result result = Session.loadSessionfromCookies(request(), session());
            if (result == null) {
//                flash(FlashCodes.warning.toString(), "An error occured while logging in, please try again");
                return redirect(controllers.Application.routes.HomeController.index());
            }
            return result;
        }
        try {
            String cookieUserId = Session.User.Customer.extract(session(), Session.User.id.toString());
            if (cookieUserId == null)
                throw new NullPointerException("Session.extract \'ID\' for user id = " + cookieUserId + " is null");
            UserInfo fill = UserInfo.fill(cookieUserId);
            return ok(customerHome.render(fill));
        } catch (Exception x) {
            Http.Session session = session();
            session.clear();
            flash().put(FlashCodes.info.toString(), "Session expired, please log in again");
            response().setCookie(buildExpiredCookie(AppCookie.Org.toString()));
            response().setCookie(buildExpiredCookie(AppCookie.user_id.toString()));
            response().setCookie(buildExpiredCookie(AppCookie.RememberMe.toString()));
            return redirect(controllers.Application.routes.HomeController.index()).withCookies(new Http.Cookie("cookieName", "cookieValue", 1, "", null, false, false, Http.Cookie.SameSite.LAX));
        }
    }

    /**
     * Returns with and renders the register page
     *
     * @return
     */
    public Result register() {
        Form<UserRegisterInfo> userForm = formFactory.form(UserRegisterInfo.class);
        return ok(register.render(userForm));
    }

    /**
     * Registers a user in the database
     *
     * @return
     */
//    @With(CheckCSRF.class)
    @Override
    public CompletionStage<Result> create() {
        Form<UserRegisterInfo> userForm = formFactory.form(UserRegisterInfo.class).bindFromRequest();

        if (userForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return CompletableFuture.completedFuture(badRequest(register.render(userForm)));
        }
        UserRegisterInfo userRegisterInfo = userForm.get();
        String csrfToken = "";
        if (userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().isPresent())
            csrfToken = userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().get();
        String userEmail = userRegisterInfo.getEmail();

        if (Customer.find.query().where().eq(Database.User.email, userRegisterInfo.getEmail().toLowerCase()).findCount() != 0)
            return CompletableFuture.completedFuture(returnRegisterRequest("Email exists, please login with this email address or use another", userForm, userEmail, csrfToken));

        Customer c = new Customer();
        String regexNMMUCheck = "([s]{0,1}[0-9]{8,9}|[a-zA-Z0-9\\. ]+)([@]{1})(live\\.|LIVE\\.){0,1}(nm|NM){0,1}[mM]{0,1}(u|U){0,1}(\\.){0,1}(ac|AC){0,1}(\\.){0,1}(za|ZA){0,1}";
        c.setEmail(userEmail);
        c.setPassword(userRegisterInfo.getPassword());
        c.setToken(csrfToken);
        c.setStudent(userEmail.matches(regexNMMUCheck));
        c.insert();
        c.save();

        String finalCsrfToken = csrfToken;
        return sendVerificationEmail(userEmail, csrfToken).thenApplyAsync(integer -> {
            Result r = null;
            switch (integer) {
                case 0: {
                    ctx().flash().put(FlashCodes.success.toString(), "Verification email has been sent");
                    r = ok();
                    break;
                }

                case 1: {
                    ctx().flash().put(FlashCodes.warning.toString(), "Verification email could not be sent, but you can still login");
                    r = redirect(controllers.User.routes.UserController.login());
                    break;
                }

                case 2: {
                    flash(FlashCodes.warning.toString(), "Unable to process request, please try again later!");
                    r = returnRegisterRequest("Error sending verification email", userForm, userEmail, finalCsrfToken);
                    break;
                }
            }
            return r;
        }, httpExecutionContext.current());

    }

    private CompletionStage<Integer> sendVerificationEmail(String userEmail, String csrfToken) {
        Integer result = 0;
        try {
            if (!generateVerificationEmail(userEmail, csrfToken)) {
                Logger.debug("Unable to send verification email to user : " + userEmail + "\nEmail EXCEPTION: generateVerificationEmail returned false!");
                session().clear();
                result = 1;
            }
        } catch (Exception x) {
            Logger.debug("Unable to send verification email:\nREASON: " + x.toString());
            result = 2;
        }
        return CompletableFuture.completedFuture(result);
    }

    //    @RequireCSRFCheck
//    @Security.Authenticated(SessionVerifier.class)
    @Override
    public CompletionStage<Result> delete() {
        return null;
    }

    public CompletionStage<Result> edit() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class);
        UserProfile profile = new UserProfile(AppCookie.extract(request(), AppCookie.user_id));
        formUserProfile = formUserProfile.fill(profile);
        return CompletableFuture.completedFuture(ok(editProfile.render(formUserProfile)));
    }

    //    @RequireCSRFCheck
//    @Security.Authenticated(SessionVerifier.class)
    @Override
    public CompletionStage<Result> update() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class).bindFromRequest();
        UserProfile userProfile = formUserProfile.get();
        if (formUserProfile.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check entered information");
            return CompletableFuture.completedFuture(badRequest(editProfile.render(formUserProfile)));
        }
//        if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
//            flash(FlashCodes.warning.toString(), "Please check passwords match and are valid");
//            return badRequest(editProfile.render(formUserProfile));
//        }
        userProfile.setUserId(session(Session.User.id.toString()));
        userProfile.save();
        flash(FlashCodes.success.toString(), "Profile has been updated!");
        return CompletableFuture.completedFuture(redirect(routes.CustomerController.index()));
    }

    @Override
    public CompletionStage<Result> read() {
        return null;
    }


    /**
     * Verifies a user's email address, if succcessful, sets flag in database for the user and
     * 1. Should automatically redirect to login page
     * 2. Show option to login
     * <p>
     * Ideally needs to render page contiaing text "Please wait while your account is being verified",
     * and Async operation, possibly using AKKA streams
     * followed by an updated text "Account verified" and an option mentioned above
     *
     * @param token
     * @return
     */
    // TODO: 2017/07/18 Dev
    public Result verifyCustomer(String token) {
        List<Customer> userList = Customer.find.query().where().eq(Database.Customer.token, token).findList();
        if (userList.size() > 1)
            return badRequest(invalid.render("Invalid verification URL, please request a new email verification link"));
        Customer c = userList.get(0);
        if (c.getToken().isEmpty())
            return notFound(invalid.render("Verification URL has expired, please request a new email verification link"));
        if (c.getEmailVerified())
            return badRequest(invalid.render("Your email has already been verified"));
        c.setEmailVerified(true);
        c.save();
        return ok(verified.render());

    }

    //    @Security.Authenticated(SessionVerifier.class)
    @RequireCSRFCheck
    public Result reverify() {
        Form userForm = formFactory.form().bindFromRequest();

        if (userForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return badRequest(register.render(userForm));
        }

        String userEmail = userForm.field("edtEmail").getValue().get(),
                CRSFToken = userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().get();

        List<Customer> list = Customer.find.query().where().eq(Database.User.email, userEmail.toLowerCase()).findList();
        if (list.size() == 1)
            try {
                if (generateVerificationEmail(userEmail, CRSFToken)) {
                    flash(FlashCodes.success.toString(), "Verification email has been sent");
//                    flash(User.ENABLETIME.toString(), "  5");
                    return ok(verify.render());
                } else {
                    throw new Exception("EmailException: Verification email could not be sent");
                }

            } catch (Exception x) {
                Logger.debug("Unable to send verification email:\nREASON: " + x.toString());
                flash(FlashCodes.warning.toString(), "Error sending verification email");
                return badRequest(verify.render());
            }
        else {
            return returnRegisterRequest("Invalid Email", userForm, userEmail, CRSFToken);
        }

    }

    /**
     * Sends email to customer's email address. The token used for the session is saved to the database, and this token is matched against the email sent. If the token matches (as a field of the URL) then the email is authenticated.
     */
    private boolean generateVerificationEmail(String email, String token) {

        // TODO: 2017/09/19 get hostname and port running on, add this to a file, which is used to create an email
//        String verificationUrl = General.SITEURL_TEST.toString() + "User/Verify/" + token;
        String verificationUrl = "http://cxbase.ddns.net:443/User/Verify/" + token;
        try {
            Mailer mailer = new Mailer(mailerClient);
            mailer.sendVerification(email, verificationUrl, environment.getFile("public/images/logo.png"));
            return true;
        } catch (Exception x) {
            Logger.warn("UserController: generateVerificationEmail:\nException sending verification email\n\n" + x.toString());
            return false;
        }
    }

    /**
     * Returns the register request filling in information the user entered, with an appropriate error message
     *
     * @param message
     * @param userForm
     * @param email
     * @param token
     * @return
     */
    @NotNull
    private Result returnRegisterRequest(String message, Form userForm, String email, String token) {
        flash(FlashCodes.warning.toString(), message);
        Map<String, String> m = new HashMap<>();
        m.put("E-Mail", email);
        m.put(Session.SessionTags.csrfTokenString.toString(), token);
        m.put("Password", "");
        m.put("Confirm Password", "");
        userForm.bind(m);
        return badRequest(register.render(userForm));
    }

    //    @Security.Authenticated(SessionVerifier.class)
    public Result registerComplete() {
        String uId = AppCookie.extract(request(), AppCookie.user_id);
        if (uId.isEmpty() || uId == null)
            return AppTags.renderDefaultPage();
        Customer customer = Customer.find.byId(uId);
        Address address = customer.getAddress();
        Form<UserRegisterDetails> registerCompleteForm = formFactory.form(UserRegisterDetails.class).bind(UserRegisterDetails.buildMap(customer, address));
        return ok(views.html.User.Customer.registerDetails.render(registerCompleteForm));
    }

    /**
     * Assume userId is contained in session
     * <p>
     * Cookies will always be present, the user logins in, this is where cookies are added.
     *
     * @return
     */
//    @RequireCSRFCheck
//    @Security.Authenticated(SessionVerifier.class)
    public Result completeRegistration() {
        Http.Request request = request();
        Http.Cookie cookie = request.cookies().get(AppCookie.newUser.toString());
        if (cookie == null)
            return redirect(controllers.User.routes.UserController.login());

        Form<UserRegisterDetails> registerForm = formFactory.form(UserRegisterDetails.class).bindFromRequest();
        String cookieToken = AppCookie.extract(request(), AppCookie.user_token);

        String uId = AppCookie.extract(request(), AppCookie.user_id);

        if (uId == null)
            return internalServerError(invalid.render("Something went wrong, please try again!"));


        if (registerForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return badRequest(registerDetails.render(registerForm));
        }

        Customer c = Customer.find.byId(uId);

        if (c == null) {
            return internalServerError(invalid.render("Something went wrong, please try again!"));
        }

        c.setToken(cookieToken); // TODO: 2017/09/19 see if this is right, it is used to solve the issue of token mismatch
        if (!c.getToken().equals(cookieToken)) {
            AppCookie.clear(response(), AppCookie.RememberMe, AppCookie.user_id, AppCookie.user_type, AppCookie.user_token, AppCookie.Org);
            flash().put(FlashCodes.danger.toString(), "Token mismatch, close your browser and restart");
            session().clear();
            return badRequest(invalid.render("Something went horribly wrong, please log in again!"));
        }
        // TODO: 2017/09/19 solve issue of 'login time' token not being saved as cookie

        UserRegisterDetails userRegisterDetails = registerForm.get();

        // set address
        Address address = new Address();
        if (userRegisterDetails.getIsCommunity()) {
            address.setIsCommunity(true);
            address.setCommunityName(userRegisterDetails.getCommunityName());
        }
        address.setStreetName(userRegisterDetails.getStreetName());
        address.setUnitNumber(userRegisterDetails.getUnitNumber());
        address.save();

        //set customer
        c.setAddressId(address.getAddressId());
        c.setCellNumber(userRegisterDetails.getCellNumber());
        c.setName(userRegisterDetails.getName());
        c.setSurname(userRegisterDetails.getSurname());
        c.setUserId(AppCookie.extract(request(), AppCookie.user_id));
        c.save();
        if (c.completeCheck())
            c.setComplete(true);
        else {
            if (!c.isVerified()) {
                generateVerificationEmail(c.getEmail(), c.getToken());
                flash().put(FlashCodes.info.toString(), "Please verify for your email address, we will be sending you another email verification link");
            } else {
                flash().put(FlashCodes.info.toString(), "You profile is incomplete, please correct this before placing an order");
            }
        }

        Result result = redirect(routes.CustomerController.index());
        session().put(Session.User.id.toString(), String.valueOf(c.getUserId()));
        session().put(Session.User.token.toString(), String.valueOf(c.getToken()));
        session().put(Session.User.name.toString(), String.valueOf(c.getName()));
        session().put(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString());

        result = result.withCookies(
                buildCookie(AppCookie.user_id.toString(), String.valueOf(c.getUserId())),
                buildCookie(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString()),
                buildCookie(AppCookie.user_token.toString(), c.getToken()));
        return result;
    }

    //    @AddCSRFToken
//    @Security.Authenticated(SessionVerifier.class)
    public CompletionStage<Result> orderHistory() {
        return getOrders().thenApplyAsync(orderItems -> {
            ctx().flash().put(FlashCodes.success.toString(), "Order History Results");
            return ok(views.html.User.Customer.orderHistory.render(" :: Order History", orderItems));
        }, httpExecutionContext.current());
    }

    private CompletableFuture<List<OrderItemBasic>> getOrders() {
        //find all orders of user
        //match all info of each order
        //add to list
        return null;

    }

    //    @AddCSRFToken
//    @Security.Authenticated(SessionVerifier.class)
    public CompletionStage<Result> paymentHistory() {
        return getPayments().thenApplyAsync(paymentItems -> {
            ctx().flash().put(FlashCodes.success.toString(), "Payment History Results");
            return ok(views.html.User.Customer.paymentHistory.render(" :: Payment History", paymentItems));
        }, httpExecutionContext.current());
    }

//    @RequireCSRFCheck
//    @Security.Authenticated(SessionVerifier.class)

//    @RequireCSRFCheck
//    @Security.Authenticated(SessionVerifier.class)
    public CompletableFuture<List<PaymentItemBasic>> getPayments() {
        return null;
    }
}