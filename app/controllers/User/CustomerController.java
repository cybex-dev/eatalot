package controllers.User;

import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import controllers.Application.AppTags.Session;
import libs.Mailer;
import models.CRUD;
import models.Finance.Payment;
import models.Finance.PaymentItemBasic;
import models.Order.ActiveOrder;
import models.Order.MealOrderItem;
import models.Order.OrderItemBasic;
import models.User.*;
import models.User.Customer.Customer;
import models.User.Customer.CustomerInfo;
import models.User.Customer.UserRegisterDetails;
import models.User.Customer.UserRegisterInfo;
import models.ordering.CustomerOrder;
import models.ordering.Meal;
import models.ordering.MealOrder;
import org.jetbrains.annotations.NotNull;
import play.Logger;
import play.api.Configuration;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.mailer.MailerClient;
import play.mvc.*;
import utility.DashboardButton;
import utility.Utility;
import views.html.User.Customer.*;
import views.html.User.Customer.editProfile;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.buildCookie;

/**
 * Created by cybex on 2017/07/21.
 */

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
    Configuration configuration;

    @Inject
    public CustomerController(HttpExecutionContext ec) {
        this.httpExecutionContext = ec;
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
    @With(LoadOrRedirect.class)
    @CustomersOnly
    public Result index() {
        List<DashboardButton> arrayList = new ArrayList<>();
        CustomerInfo customerInfo = CustomerInfo.GetCustomerInfo(session().get(AppCookie.user_id.toString()));
        if (customerInfo != null) {
            arrayList.add(
                    new DashboardButton(
                            AppTags.Locale.Currency.ZAR.toString().concat(customerInfo.getBalance()),
                            "Balance",
                            controllers.User.routes.CustomerController.paymentHistory()));
            arrayList.add(
                    new DashboardButton(
                            String.valueOf(customerInfo.getActiveOrderCount()),
                            "Active Orders",
                            controllers.User.routes.CustomerController.activeOrders()));
            arrayList.add(
                    new DashboardButton(
                            customerInfo.isScheduleActive() ? "Active" : "  Inactive",
                            "Schedule",
                            controllers.User.routes.CustomerController.paymentHistory()));
            arrayList.add(
                    new DashboardButton(
                            "?",
                            "???",
                            controllers.Application.routes.HomeController.unknown()));
        }
        return ok(customerHome.render(arrayList, customerInfo));
    }

    /**
     * Returns with and renders the register page
     *
     * @return
     */
    @With(annotations.CheckCSRF.class)
    public Result register() {
        Form<UserRegisterInfo> userForm = formFactory.form(UserRegisterInfo.class);
        return ok(register.render(userForm));
    }

    /**
     * Registers a user in the database
     *
     * @return
     */
    @Override
    @With(annotations.CheckCSRF.class)
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
        String userEmail = userRegisterInfo.getLoginId();

        if (Customer.find.query().where().eq("email", userRegisterInfo.getLoginId().toLowerCase()).findCount() != 0)
            return CompletableFuture.completedFuture(returnRegisterRequest("Email exists, please login with this email address or use another", userForm, userEmail, csrfToken));

        Customer c = new Customer();
        String regexNMMUCheck = "([s]{0,1}[0-9]{8,9}|[a-zA-Z0-9\\. ]+)([@]{1})(live\\.|LIVE\\.){0,1}(nm|NM){0,1}[mM]{0,1}(u|U){0,1}(\\.){0,1}(ac|AC){0,1}(\\.){0,1}(za|ZA){0,1}";
        c.setEmail(userEmail);
        c.setPassword(userRegisterInfo.getPassword());
        c.setToken(csrfToken);
        c.setStudent(userEmail.matches(regexNMMUCheck));
        c.save();

        String finalCsrfToken = csrfToken;
        return sendVerificationEmail(userEmail, csrfToken).thenApplyAsync(integer -> {
            Result r = null;
            switch (integer) {
                case 0: {
                    ctx().flash().put(FlashCodes.success.toString(), "Verification email has been sent");
                    r = ok(verify.render());
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

    @With(annotations.CheckCSRF.class)
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

    @Override
    public CompletionStage<Result> delete() {
        return null;
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> edit() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class);
        UserProfile profile = new UserProfile(AppCookie.extract(request(), AppCookie.user_id));
        formUserProfile = formUserProfile.fill(profile);
        return CompletableFuture.completedFuture(ok(editProfile.render(formUserProfile)));
    }

    //    @RequireCSRFCheck
//    @Security.Authenticated(annotations.SessionVerifier.SessionVerifier.class)
    @Override
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> update() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class).bindFromRequest();
        UserProfile userProfile = formUserProfile.get();
        if (formUserProfile.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check entered information");
            return CompletableFuture.completedFuture(badRequest(editProfile.render(formUserProfile)));
        }
        if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
            flash(FlashCodes.warning.toString(), "Please check passwords match and are valid");
            return CompletableFuture.completedFuture(badRequest(editProfile.render(formUserProfile)));
        }
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
        List<Customer> userList = Customer.find.query().where().eq("token", token).findList();
        if (userList.size() == 0 ||
                userList.size() > 1)
            return badRequest(invalid.render("Invalid verification URL, please login to have a new verification link set"));
        Customer c = userList.get(0);
        if (c.getToken().isEmpty())
            return notFound(invalid.render("Verification URL has expired, please request a new email verification link"));
        if (c.getEmailVerified())
            return badRequest(invalid.render("Your email has already been verified"));
        c.setEmailVerified(true);
        c.save();
        return ok(verified.render());

    }

    @With(annotations.CheckCSRF.class)
    public Result reverify() {
        Form userForm = formFactory.form().bindFromRequest();

        if (userForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return badRequest(register.render(userForm));
        }

        String userEmail = userForm.field("edtEmail").getValue().get(),
                CRSFToken = userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().get();

        List<Customer> list = Customer.find.query().where().eq("email", userEmail.toLowerCase()).findList();
        if (list.size() == 1) {
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
        } else {
            return returnRegisterRequest("Invalid Email", userForm, userEmail, CRSFToken);
        }

    }

    /**
     * Sends email to customer's email address. The token used for the session is saved to the database, and this token is matched against the email sent. If the token matches (as a field of the URL) then the email is authenticated.
     */
    private boolean generateVerificationEmail(String email, String token) {

        // TODO: 2017/09/19 get hostname and port running on, add this to a file, which is used to create an email
//        String verificationUrl = General.SITEURL_TEST.toString() + "User/Verify/" + token;
        String verificationUrl = "http://localhost  :8080/User/Verify/" + token;
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

    @With(RequiresActive.class)
    @CustomersOnly
    public Result completeRegistration() {
        if (!session().containsKey(AppCookie.new_user.toString())) {
            flash().put(FlashCodes.info.toString(), "Your account is already verified");
            return redirect(controllers.User.routes.CustomerController.index());
        }
        String uId = AppCookie.extract(request(), AppCookie.user_id);
        if (uId == null)
            return redirect(controllers.User.routes.UserController.login());
        Customer customer = Customer.find.byId(uId);
        if (customer == null) {
            flash().put(FlashCodes.warning.toString(), "An internal server error has occured!");
            return redirect(controllers.User.routes.UserController.login());
        }
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
    @With(RequiresActive.class)
    @CustomersOnly
    public Result doCompleteRegistration() {
        if (session().get(AppCookie.new_user.toString()) == null)
            return redirect(controllers.User.routes.UserController.login());

        Form<UserRegisterDetails> registerForm = formFactory.form(UserRegisterDetails.class).bindFromRequest();
        String cookieToken = session().get(AppCookie.user_token.toString());

        String uId = session().get(AppCookie.user_id.toString());

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
            flash().put(FlashCodes.danger.toString(), "Token mismatch, your session may be compromised");
            flash().put(FlashCodes.danger.toString(), "Please close your browser and restart");
            Utility.logout(Http.Context.current(), session());
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
        c.setAddress(address);
        c.setCellNumber(userRegisterDetails.getCellNumber());
        c.setName(userRegisterDetails.getName());
        c.setSurname(userRegisterDetails.getSurname());
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

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> orderHistory() {
        return getOrders().thenApplyAsync(orderItems -> {
            ctx().flash().put(FlashCodes.success.toString(), "Order History Results");
            return ok(views.html.User.Customer.orderHistory.render(orderItems));
        }, httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @CustomersOnly
    private CompletableFuture<List<OrderItemBasic>> getOrders() {
        //find all orders of user
        //match all info of each order
        //add to list
        List<OrderItemBasic> paymentList = new ArrayList<>();
        return CompletableFuture.completedFuture(paymentList);

    }

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> paymentHistory() {
        return getPayments().thenApplyAsync(paymentItems -> {
            ctx().flash().put(FlashCodes.success.toString(), "Payment History Results");
            return ok(views.html.User.Customer.paymentHistory.render(paymentItems));
        }, httpExecutionContext.current());
    }

//    @RequireCSRFCheck
//    @Security.Authenticated(annotations.SessionVerifier.SessionVerifier.class)

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletableFuture<List<PaymentItemBasic>> getPayments() {
        List<PaymentItemBasic> paymentList = new ArrayList<>();
        return CompletableFuture.completedFuture(paymentList);
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> activeOrders() {
        return getActiveOrders(session().get(AppCookie.user_id.toString())).thenApplyAsync(activeOrders -> ok(viewActiveOrders.render(activeOrders)), httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @CustomersOnly
    private CompletionStage<List<ActiveOrder>> getActiveOrders(String userId) {
        List<CustomerOrder> list = CustomerOrder.find.query().where().ilike("userId", userId).and().ilike("statusId", "pending").findList();
        List<ActiveOrder> activeOrders = new ArrayList<>();
        list.forEach(customerOrder -> {
            List<MealOrder> mealOrderList = MealOrder.find.query().where().ilike("orderId", String.valueOf(customerOrder.getOrderId())).findList();
            List<MealOrderItem> orderItemList = new ArrayList<>();
            mealOrderList.forEach(mealOrder -> {
                Meal meal = Meal.find.byId(mealOrder.getMealId());
                orderItemList.add(new MealOrderItem(String.valueOf(mealOrder.getMealOrderId()), new Double("0.00"), "", meal.getDescription(), mealOrder.getOrderQty(), meal.getCost()));
            });
            ActiveOrder activeOrder = new ActiveOrder(String.valueOf(customerOrder.getOrderId()), String.valueOf(Payment.find.byId(customerOrder.getPaymentId()).getAmount()), new Date(), customerOrder.getStatusId(), orderItemList);
            activeOrders.add(activeOrder);
        });
        return CompletableFuture.completedFuture(activeOrders);
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> viewPayment(String paymentId) {
        return CompletableFuture.completedFuture(Results.TODO);
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> viewOrder(String ordersId) {
        return CompletableFuture.completedFuture(Results.TODO);
    }
}