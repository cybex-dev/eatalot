package controllers.User;

import controllers.Application.AppTags;
import libs.Mailer;
import models.CRUD;
import models.User.*;
import org.jetbrains.annotations.NotNull;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.User.Customer.*;
import views.html.User.Customer.editProfile;

import javax.inject.Inject;
import java.util.*;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.buildCookie;

/**
 * Created by cybex on 2017/07/21.
 */
public class CustomerController extends Controller implements CRUD {

    @Inject
    FormFactory formFactory;
    @Inject
    MailerClient mailerClient;
    @Inject
    play.Environment environment;

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
    public Result index() {
        if (!Session.checkExistingSession(session())) {
            Result result = Session.loadSessionfromCookies(request(), session());
            if (result == null){
//                flash(FlashCodes.warning.toString(), "An error occured while logging in, please try again");
                return redirect(controllers.Application.routes.HomeController.index());
            }
            return result;
        }
        Long uId = Long.parseLong(Session.User.Customer.extract(session(), Session.User.id.toString()));
        return ok(customerHome.render(UserInfo.fill(uId)));
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
    @Override
    public Result create() {
        Form<UserRegisterInfo> userForm = formFactory.form(UserRegisterInfo.class).bindFromRequest();

        if (userForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return badRequest(register.render(userForm));
        }
        UserRegisterInfo userRegisterInfo = userForm.get();
        String csrfToken = "";
        if (userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().isPresent())
            csrfToken = userForm.field(Session.SessionTags.csrfTokenString.toString()).getValue().get();
        String userEmail = userRegisterInfo.getEmail();

        if (Customer.find.query().where().eq(Database.User.email, userRegisterInfo.getEmail().toLowerCase()).findCount() != 0)
            return returnRegisterRequest("Email exists, please login with this email address or use another", userForm, userEmail, csrfToken);

        Customer c = new Customer();
        String regexNMMUCheck = "([s]{0,1}[0-9]{8,9}|[a-zA-Z0-9\\. ]+)([@]{1})(live\\.|LIVE\\.){0,1}(nm|NM){0,1}[mM]{0,1}(u|U){0,1}(\\.){0,1}(ac|AC){0,1}(\\.){0,1}(za|ZA){0,1}";
        c.setEmail(userEmail);
        c.setPassword(userRegisterInfo.getPassword());
        c.setToken(csrfToken);
        c.setStudent(userEmail.matches(regexNMMUCheck));
        c.save();

        try {
            if (!generateVerificationEmail(userEmail, csrfToken))
                throw new Exception("EmailException: Verification email could not be sent");
        } catch (Exception x) {
            Logger.debug("Unable to send verification email:\nREASON: " + x.toString());
            flash(FlashCodes.warning.toString(), "Unable to process request, please try again later!");
            return returnRegisterRequest("Error sending verification email", userForm, userEmail, csrfToken);
        }
        flash(FlashCodes.success.toString(), "Verification email has been sent");
        return ok(verify.render());
    }

    @Override
    public Result delete() {
        return null;
    }

    public Result edit() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class);
        Long userId = AppCookie.extractUserId(request());
        UserProfile profile = new UserProfile(userId);
        formUserProfile = formUserProfile.fill(profile);
        return ok(editProfile.render(formUserProfile));
    }

    @Override
    public Result update() {
        Form<UserProfile> formUserProfile = formFactory.form(UserProfile.class).bindFromRequest();
        UserProfile userProfile = formUserProfile.get();
        if (formUserProfile.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check entered information");
            return badRequest(editProfile.render(formUserProfile));
        }
//        if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
//            flash(FlashCodes.warning.toString(), "Please check passwords match and are valid");
//            return badRequest(editProfile.render(formUserProfile));
//        }
        userProfile.setUserId(session(Session.User.id.toString()));
        userProfile.save();
        flash(FlashCodes.success.toString(), "Profile has been updated!");
        return redirect(routes.CustomerController.index());
    }

    @Override
    public Result read() {
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
        String verificationUrl = General.SITEURL_TEST.toString() + "User/Verify/" + token;
        try {
            Mailer mailer = new Mailer(mailerClient);
            mailer.sendVerification(email, verificationUrl, environment.getFile("public/images/logo.png"));
        } catch (Exception x) {
            Logger.warn("UserController: generateVerificationEmail:\nException sending verification email\n\n" + x.toString());
            return false;
        }
        return true;
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
        userForm.bind(m).get();
        return badRequest(register.render(userForm));
    }

    public Result registerComplete() {
        String uId = AppCookie.extract(request(), AppCookie.user_id);
        if (uId.isEmpty() || uId == null)
            return AppTags.renderDefaultPage();
        Customer customer = Customer.find.byId(Long.parseLong(uId));
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
    public Result completeRegistration() {
        Http.Request request = request();
        Http.Cookie cookie = request.cookies().get(AppCookie.newUser.toString());
        if (cookie == null)
            return new UserController().login();

        Form<UserRegisterDetails> registerForm = formFactory.form(UserRegisterDetails.class).bindFromRequest();
        String cookieToken = AppCookie.extract(request(), AppCookie.user_token);
        Long userId;
        try {
            String uId = AppCookie.extract(request(), AppCookie.user_id);
            if (uId == null)
                return internalServerError(invalid.render("Something went wrong, please try again!"));
            userId = Long.parseLong(uId);
        } catch (Exception x) {
            return internalServerError(invalid.render("Something went wrong, please try again!"));
        }

        if (registerForm.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields");
            return badRequest(registerDetails.render(registerForm));
        }

        Customer c = Customer.find.byId(userId);
        if (c == null) {
            return internalServerError(invalid.render("Something went wrong, please try again!"));
        }

        if (!c.getToken().equals(cookieToken)) {
            AppCookie.clear(response(), AppCookie.RememberMe, AppCookie.user_id, AppCookie.user_type, AppCookie.user_token, AppCookie.Org);
            flash().put(FlashCodes.danger.toString(), "Token mismatch, close your browser and restart");
            return badRequest(invalid.render("Something went horribly wrong, please log in again!"));
        }

        if (c.isComplete()) {
            return badRequest(invalid.render("Your account is already registered, please login in"));
        }


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
        Long addressId = address.getAddressId();

        //set customer
        c.setAddressId(addressId);
        c.setCellNumber(userRegisterDetails.getCellNumber());
        c.setName(userRegisterDetails.getName());
        c.setSurname(userRegisterDetails.getSurname());
        c.setUserId(AppCookie.extractUserId(request()));
        if (c.completeCheck())
            c.setComplete(true);
        else{
            flash(FlashCodes.warning.toString(), "Some details are missing, please check all fields");
            return badRequest(registerDetails.render(registerForm));
        }
        c.save();

        Result result = redirect(routes.CustomerController.index());
        result = result.withCookies(
                buildCookie(AppCookie.user_id.toString(), String.valueOf(c.getUserId())),
                buildCookie(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString()),
                buildCookie(AppCookie.user_token.toString(), c.getToken()));
        return result;
    }
}