package controllers.User;

import annotations.Routing.AnyAllowed;
import annotations.SessionVerifier.LoadActive;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import models.User.*;
import models.User.Admin.Admin;
import models.User.Customer.Customer;
import models.User.Customer.CustomerInfo;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.CSRF;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.*;
import utility.Utility;
import views.html.Application.Home.index;
import views.html.User.User.login;

import javax.inject.Inject;
import java.util.Optional;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.*;
import static models.User.Customer.Customer.*;

/**
 * Created by cybex on 2017/07/08.
 * <p>
 * UserController handles all generic user related methods and functions
 * <p>
 * <ul>
 * <li>Home page : containing login & register options, with ads of products provided</li>
 * <li>Login page : where logins are handled, including customer and staff logins, these are redirected to the appropriate controller when the user logs in</li>
 * </ul>
 */

public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing User's home, with options of loging in or registering
     *
     * @return
     */
    // /user
    @With(LoadOrRedirect.class)
    @AnyAllowed
    public Result index() {
        return ok(index.render());
    }

    /**
     * Renders login page
     *
     * @return
     */
    @With(LoadActive.class)
    @AnyAllowed
    public Result login() {
        Http.Session session = session();
        return ok(login.render(formFactory.form(UserLoginInfo.class)));
    }

    /**
     * Performs login operation, if successful, then redirect to user's home page
     * <p>
     * Overview:
     * PRE login code
     * checks, determine user type, check valid data passed
     * login() save session data and cookie data (cookie data only if user wants to be remembered)
     * POST login
     * customer check complete, possibly complete registration
     * <p>
     * FINALLY Confirm Login
     * checks if session is valid and user id cookie exists
     *
     * @return
     */
    @With(annotations.CheckCSRF.class)
    public Result doLogin() {
        Form<UserLoginInfo> form = formFactory.form(UserLoginInfo.class).bindFromRequest();

        if (form.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields are correct");
            return badRequest(login.render(form));
        }

        UserLoginInfo userLoginInfo = form.get();
        //init login
        User user = null;
        UserType userType = null;

        Optional<Customer> customer = find.query().where()
                .eq("email", userLoginInfo.getLoginId())
                .and()
                .eq("password", userLoginInfo.getPassword())
                .findOneOrEmpty();

        Optional<Staff> staffMember = Staff.find.query().where()
                .eq("email", userLoginInfo.getLoginId())
                .or()
                .eq("alias", userLoginInfo.getLoginId())
                .findList().stream()
                .filter(s -> s.getPassword().equals(userLoginInfo.getPassword()))
                .findFirst();

        Optional<Admin> admin = Admin.find.query().where()
                .eq("alias", userLoginInfo.getLoginId())
                .and()
                .eq("password", userLoginInfo.getPassword())
                .findOneOrEmpty();

        Customer c = customer.orElse(null);
        Staff s = staffMember.orElse(null);
        Admin a = admin.orElse(null);

        // user login not found
        if (c == null &&
                s == null &&
                a == null) {
            flash(FlashCodes.warning.toString(), "Username/Password combination invalid");
            return notFound(login.render(form));
        }


        Http.Context ctx = ctx();

        if (c == null && s == null) {
            userType = UserType.ADMIN;
        } else {


            // user login appears in staff and customer talbe
            if (c != null &&
                    s != null) {
                flash().put(FlashCodes.warning.toString(), "Please log in using your staff");
                return badRequest(login.render(form));
            }

            // determine if user is staff or customer
            if (s == null) {
                //user us customer
                userType = UserType.CUSTOMER;
                user = c;
            } else {
                //user is staff
                userType = (s.isKitchenStaff()) ? UserType.KITCHEN : UserType.DELIVERY;
                user = s;
            }
        }

        // user is authenticated, adding login cookies (if remember me is true) and session

        // response contains login cookies, session login also added via context
        Optional<CSRF.Token> token = CSRF.getToken(ctx.request());
        if (!token.isPresent()) {
            flash(FlashCodes.danger.toString(), "No token present, close your browser and reopen it.");
            return redirect(controllers.Application.routes.HomeController.index());
        }

        // get csrf token and login
        String csrfToken = token.get().value();
        if (userType == UserType.ADMIN) {
            Utility.loginAdmin(ctx(), a, csrfToken);

            // confirm login, by checking session and cookies
            if (!session().containsKey(user_id.toString()) ||
                    !session().get(AppTags.Session.SessionTags.session_status.toString()).equals(AppTags.Session.SessionTags.valid.toString())) {
                flash().put(FlashCodes.warning.toString(), "Admin login error, please speak to developers!");
                Utility.logout(ctx, session());
                return internalServerError(index.render());
            }
        }
        else {
            Utility.login(ctx(), user, csrfToken, userLoginInfo.getRememberMe());

            // confirm login, by checking session
            if (!session().containsKey(user_id.toString()) ||
                    !session().get(AppTags.Session.SessionTags.session_status.toString()).equals(AppTags.Session.SessionTags.valid.toString())) {
                flash().put(FlashCodes.warning.toString(), "Login error occurred, please try again later!");
                Utility.logout(ctx, session());
                return internalServerError(index.render());
            }

            //check if user wants to be remembered,  only for users, not admin
            if (userLoginInfo.getRememberMe()) {
                Http.Cookie rememberMeCookie = response().cookie(remember_me.toString()).orElse(null);
                if (rememberMeCookie == null ||
                        !rememberMeCookie.value().equals(remember_me_true.toString())){
                    flash().put(FlashCodes.warning.toString(), "Couldn't save cookies!");
                }
            }
        }

        switch (userType) {

            case ADMIN: {
                flash(FlashCodes.success.toString(), "Logged in as admin.");
                flash(FlashCodes.info.toString(), "After closing this window, you are logged out automatically.");
                return redirect(controllers.User.routes.AdminController.index());
            }

            case CUSTOMER: {
                CustomerInfo customerInfo = CustomerInfo.GetCustomerInfo(user.getUserId());
                return customerCheckComplete(customerInfo);
            }

            case DELIVERY: {
                return redirect(controllers.User.routes.DeliveryStaffController.index());
            }
            case KITCHEN: {
                return redirect(controllers.User.routes.KitchenStaffController.index());
            }
        }
        flash().put(FlashCodes.warning.toString(), "An unknown login error occurred. Close your browser and try again.");
        return redirect(controllers.Application.routes.HomeController.index());
    }

    private Result customerCheckComplete(CustomerInfo customerInfo) {
        Customer customer = Customer.find.byId(customerInfo.getUserId());

        if (customer.isComplete())
            return redirect(routes.CustomerController.index());
        else {
            //customer not profile not complete before, checking now
            if (customer.completeCheck()) {
                // customer profile complete, setting flag
                customer.setComplete(true);
                return redirect(routes.CustomerController.index());
            }
        }

        session().put(AppCookie.new_user.toString(), AppCookie.new_user.toString());
        flash().put(FlashCodes.info.toString(), "Please complete your profile");
        return redirect(controllers.User.routes.CustomerController.completeRegistration());
    }

    @With(RequiresActive.class)
    public Result logout() {

            Utility.logout(ctx(), session());
        return redirect(controllers.Application.routes.HomeController.index());

//        Result redirect = redirect(controllers.Application.routes.HomeController.index()).withCookies(
//                buildExpiredCookie(AppCookie.remember_me.toString()),
//                buildExpiredCookie(AppCookie.user_type.toString()),
//                buildExpiredCookie(AppCookie.user_id.toString()),
//                buildExpiredCookie(AppCookie.user_token.toString())
//        );
//        session().clear();
////        AppCookie.logout(redirect);
//        return redirect;
//    }


    }
}

