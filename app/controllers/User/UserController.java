package controllers.User;

import annotations.Routing.AnyAllowed;
import annotations.SessionVerifier.RedirectToDashIfActive;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import libs.Mailer;
import models.Order.CustomerOrder;
import models.User.Admin.Admin;
import models.User.Customer.Customer;
import models.User.Customer.CustomerInfo;
import models.User.Staff;
import models.User.User;
import models.User.UserLoginInfo;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.CSRF;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import utility.Mobile;
import utility.Utility;
import views.html.Application.Home.index;
import views.html.User.User.login;
import views.html.User.User.loginMobile;
import views.html.Ordering.masterOrder;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.AppCookie;
import static controllers.Application.AppTags.AppCookie.*;
import static controllers.Application.AppTags.FlashCodes;
import static java.util.concurrent.CompletableFuture.supplyAsync;
import static models.User.Customer.Customer.find;

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
    @Inject
    HttpExecutionContext httpExecutionContext;

    /**
     * Should display default customerHome page, showing User's home, with options of loging in or registering
     *
     * @return
     */
    @With(RedirectToDashIfActive.class)
    @AnyAllowed
    public Result index() {
        return redirect(controllers.Application.routes.HomeController.unknown());
    }

    /**
     * Renders login page
     *
     * @return
     */
    @With(RedirectToDashIfActive.class)
    @AnyAllowed
    public Result login() {
        if(Mobile.isMobile(request().getHeaders()))
            return ok(masterOrder.render(loginMobile.render(formFactory.form(UserLoginInfo.class))));
        else
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
    public CompletionStage<Result> doLogin() {
        return tryLogin();
    }

    private CompletionStage<Result> tryLogin(){
        Form<UserLoginInfo> form = formFactory.form(UserLoginInfo.class).bindFromRequest();

        if (form.hasErrors()) {
            flash(FlashCodes.danger.toString(), "Please check all fields are correct");
            if(Mobile.isMobile(request().getHeaders()))
                return CompletableFuture.completedFuture(badRequest(masterOrder.render(loginMobile.render(formFactory.form(UserLoginInfo.class)))));
            else
                return CompletableFuture.completedFuture(badRequest(login.render(formFactory.form(UserLoginInfo.class))));
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

        Optional<Staff> staffMember =  Staff.find.query().where()
                .or()
                .eq("loginAlias", userLoginInfo.getLoginId())
                .eq("email", userLoginInfo.getLoginId())
                .endOr()
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
            flash(FlashCodes.danger.toString(), "Username/Password combination invalid");
            if(Mobile.isMobile(request().getHeaders()))
                return CompletableFuture.completedFuture(notFound((masterOrder.render(loginMobile.render(formFactory.form(UserLoginInfo.class))))));
            else
                return CompletableFuture.completedFuture(notFound((login.render(formFactory.form(UserLoginInfo.class)))));
        }


        Http.Context ctx = ctx();

        if (c == null && s == null) {
            userType = UserType.ADMIN;
        } else {

            // user login appears in staff and customer talbe
            if (c != null &&
                    s != null) {
                flash().put(FlashCodes.danger.toString(), "Please log in using your staff");
                if(Mobile.isMobile(request().getHeaders()))
                    return CompletableFuture.completedFuture(badRequest(masterOrder.render(loginMobile.render(formFactory.form(UserLoginInfo.class)))));
                else
                    return CompletableFuture.completedFuture(badRequest(login.render(formFactory.form(UserLoginInfo.class))));
            }

            // determine if user is staff or customer
            if (s == null) {
                //user us customer
                userType = UserType.CUSTOMER;
                user = c;
            } else {
                //user is staff
                userType = (s.getKitchenStaffStatus()) ? UserType.KITCHEN : UserType.DELIVERY;
                user = s;
            }
        }

        //check if user is active
        if (userType != UserType.ADMIN) {
            if (!user.getAccountActive()) {
                flash().put(FlashCodes.danger.toString(), "Your account has been disable, please contact the Eatalot to resolve this!");
                if(Mobile.isMobile(request().getHeaders()))
                    return CompletableFuture.completedFuture(badRequest(masterOrder.render(loginMobile.render(formFactory.form(UserLoginInfo.class)))));
                else
                    return CompletableFuture.completedFuture(badRequest(login.render(formFactory.form(UserLoginInfo.class))));
            }
        }

        // user is authenticated, adding login cookies (if remember me is true) and session

        // response contains login cookies, session login also added via context
        Optional<CSRF.Token> token = CSRF.getToken(ctx.request());
        if (!token.isPresent()) {
            flash(FlashCodes.danger.toString(), "No token present, close your browser and reopen it.");
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.index()));
        }

        // get csrf token and login
        String csrfToken = token.get().value();
        if (userType == UserType.ADMIN) {
            Utility.loginAdmin(ctx(), a, csrfToken);

            // confirm login, by checking session and cookies
            if (!session().containsKey(user_id.toString()) ||
                    !session().get(AppTags.Session.SessionTags.session_status.toString()).equals(AppTags.Session.SessionTags.valid.toString())) {
                flash().put(FlashCodes.danger.toString(), "Admin login error, please speak to developers!");
                Utility.logout(ctx, session());
                return CompletableFuture.completedFuture(internalServerError(index.render()));
            }
        } else {
            Utility.login(ctx(), user, csrfToken, userLoginInfo.getRememberMe());

            // confirm login, by checking session
            if (!session().containsKey(user_id.toString()) ||
                    !session().get(AppTags.Session.SessionTags.session_status.toString()).equals(AppTags.Session.SessionTags.valid.toString())) {
                flash().put(FlashCodes.danger.toString(), "Login error occurred, please try again later!");
                Utility.logout(ctx, session());
                return CompletableFuture.completedFuture(internalServerError(index.render()));
            }

            //check if user wants to be remembered,  only for users, not admin
            if (userLoginInfo.getRememberMe()) {
                Http.Cookie rememberMeCookie = response().cookie(remember_me.toString()).orElse(null);
                if (rememberMeCookie == null ||
                        !rememberMeCookie.value().equals(remember_me_true.toString())) {
                    flash().put(FlashCodes.danger.toString(), "Couldn't save cookies!");
                }
            }
        }

        switch (userType) {

            case ADMIN: {
                flash(FlashCodes.success.toString(), "Logged in as admin.");
                return CompletableFuture.completedFuture(redirect(controllers.User.routes.AdminController.index()));
            }

            case CUSTOMER: {
                CustomerInfo customerInfo = CustomerInfo.GetCustomerInfo(user.getUserId());
                setCurrentOrder();
                return customerCheckComplete(customerInfo);
            }

            case DELIVERY: {
                return CompletableFuture.completedFuture(redirect(controllers.User.routes.DeliveryStaffController.index()));
            }
            case KITCHEN: {
                return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
            }
        }
        flash().put(FlashCodes.danger.toString(), "An unknown login error occurred. Close your browser and try again.");
        return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.index()));
    }

    /**
     * TODO: ADDED THIS TO FIND AN EXISTING ORDER FOR A CUSTOMER. ADDED TO LINE 230.
     *
     * Check if there is an unsubmitted order from a previous session
     * Resume previous order after logout
     * Set session to that orderId
     * There should only ever be one unsubmitted order per user
     */
    private void setCurrentOrder(){
        List<CustomerOrder> lstOrders = CustomerOrder.findOrderByUserId(session(AppTags.AppCookie.user_id.toString()));
        if (lstOrders != null) {
            for (CustomerOrder lstOrder : lstOrders) {
                if (lstOrder.getStatusId().equals("unsubmitted")) {
                    session("orderId", String.valueOf(lstOrder.getOrderId()));
                    break;
                }
            }
        }
    }

    private CompletionStage<Result> customerCheckComplete(CustomerInfo customerInfo) {
        Customer customer = Customer.find.byId(customerInfo.getUserId());

        if (customer == null)
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.index()));

        if (customer.isComplete())
            return CompletableFuture.completedFuture(redirect(routes.CustomerController.index()));

        //customer details not complete , check if details complete manually
        if (customer.completeCheck()) {
            // customer profile complete, setting flag
            customer.setComplete(true);
            return CompletableFuture.completedFuture(redirect(routes.CustomerController.index()));
        }

        //either profile is incomplete or email not verified
        boolean profileComplete = customer.isProfileComplete(),
                emailVerified = customer.getEmailVerifiedStatus();

        if (!emailVerified && profileComplete)
            return supplyAsync(() -> {
                if (Mailer.SendVerificationEmail(customer.getEmail(), customer.getToken())) {
                    flash().put(FlashCodes.info.toString(), "Please verify for your email address, we will be sending you another email verification link");
                } else {
                    flash().put(FlashCodes.danger.toString(), "Unable to send verification email");
                }
                return redirect(controllers.User.routes.CustomerController.index());
            }, httpExecutionContext.current());

        session().put(AppCookie.new_user.toString(), AppCookie.new_user.toString());
        flash().put(FlashCodes.info.toString(), "Please complete your profile");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.CustomerController.completeRegistration()));
    }

    @With(RequiresActive.class)
    public Result logout() {

        Utility.logout(ctx(), session());
        return redirect(controllers.Application.routes.HomeController.index());
    }
}

