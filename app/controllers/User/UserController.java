package controllers.User;

import annotations.CheckCSRF;
import annotations.Routing;
import annotations.SessionVerifier;
import controllers.Application.AppTags;
import models.User.*;
import models.User.Customer.Customer;
import models.User.Customer.CustomerInfo;
import models.User.Customer.UserRegisterDetails;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import models.User.KitchenStaff.KitchenStaffInfo;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.CSRF;
import play.mvc.*;
import utility.Utility;
import views.html.Application.Home.index;
import views.html.User.Customer.customerHome;
import views.html.User.Staff.deliveryHome;
import views.html.User.Staff.kitchenHome;
import views.html.User.User.login;

import javax.inject.Inject;
import java.util.Optional;

import views.html.User.Customer.registerDetails;

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

@Routing.AnyAllowed
public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing User's home, with options of loging in or registering
     *
     * @return
     */
    // /user
    @With(SessionVerifier.LoadOrRedirect.class)
    public Result index() {
        return ok(index.render());
    }

    /**
     * Renders login page
     *
     * @return
     */
    @With(SessionVerifier.LoadActive.class)
    public Result login() {
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
    @With(CheckCSRF.class)
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

        Customer customer = find.query().where()
                .eq("email", userLoginInfo.getLoginId())
                .and()
                .eq("password", userLoginInfo.getPassword())
                .findOne();

        Optional<Staff> staffMember = Staff.find.query().where()
                .eq("email", userLoginInfo.getLoginId())
                .or()
                .eq("alias", userLoginInfo.getLoginId())
                .findList().stream()
                .filter(s -> s.getPassword().equals(userLoginInfo.getPassword()))
                .findFirst();
        if (!staffMember.isPresent() && customer == null) {
            flash(FlashCodes.warning.toString(), "Username/Password combination invalid");
            return notFound(login.render(form));
        }

        if (!staffMember.isPresent()) {
            userType = UserType.CUSTOMER;
            user = customer;
        } else {
            user = staffMember.get();
            if (customer == null) {
                userType = (staffMember.get().isKitchenStaff()) ? UserType.KITCHEN : UserType.DELIVERY;
            } else {
                flash().put(FlashCodes.warning.toString(), "Please log in using your staff");
                return badRequest(login.render(form));
            }
        }

        // user is authenticated, adding login cookies (if remember me is true) and session
        Http.Context ctx = ctx();

        // response contains login cookies, session login also added via context
        Optional<CSRF.Token> token = CSRF.getToken(ctx.request());
        if (!token.isPresent()) {
            flash(FlashCodes.danger.toString(), "No token present, close your browser and reopen it.");
            return redirect(controllers.Application.routes.HomeController.index());
        }

        // get csrf token and login
        String csrfToken = token.get().value();
        Utility.login(ctx(), user, csrfToken, userLoginInfo.getRememberMe());

        // confirm login, by checking session and cookies
        if (!response().cookie(user_id.toString()).isPresent() ||
                !session().get(AppTags.Session.SessionTags.session_status.toString()).equals(AppTags.Session.SessionTags.valid.toString())) {
            flash().put(FlashCodes.warning.toString(), "Login error occurred, please try again later!");
            Utility.logout(ctx, session());
            return internalServerError(index.render());
        }

        switch (userType) {
            case CUSTOMER: {
                CustomerInfo customerInfo = CustomerInfo.GetCustomerInfo(user.getUserId());
                return customerCheckComplete(customerInfo);
            }

            case DELIVERY:
            case KITCHEN: {
                return redirect(controllers.User.routes.StaffController.index());
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

    @With(SessionVerifier.RequiresActive.class)
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

