package controllers.User;

import controllers.Application.AppTags;
import models.User.Customer;
import models.User.UserLoginInfo;
import models.User.UserRegisterDetails;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import views.html.Application.Home.index;
import views.html.User.User.login;

import javax.inject.Inject;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import views.html.User.Customer.registerDetails;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.*;

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
    public Result index() {
        Result result = AppTags.Session.checkExistingLogin(request(), session());
        if (result != null)
            return result;
        return ok(index.render());
    }

    /**
     * Renders login page
     *
     * @return
     */
    public Result login() {
        Http.Response response = response();
        Http.Request request = request();
        Http.Session session = session();
        Result result = AppTags.Session.checkExistingLogin(request(), session());
        if (result == null)
            result = ok(login.render(formFactory.form(UserLoginInfo.class)));
        return result;
    }

    /**
     * Performs login operation, if successful, then redirect to user's home page
     *
     * @return
     */
    public Result doLogin() {
        Form<UserLoginInfo> form = formFactory.form(UserLoginInfo.class).bindFromRequest();

        if (form.hasErrors()) {
            flash(FlashCodes.warning.toString(), "Please check all fields are correct");
            return badRequest(login.render(form));
        }

        UserLoginInfo userLoginInfo = form.get();
        //init login
        Customer customer = null;
        try {
            List<Customer> userEmails = Customer.find.query().where().eq(Database.User.email, userLoginInfo.getEmail()).findList();
            if (userEmails.size() > 1) {
                flash(FlashCodes.danger.toString(), "An server error occurred, please try again later!");
                return notFound(login.render(form));
            }
            if (userEmails.size() == 0) {
                flash(FlashCodes.warning.toString(), "Username/Password combination invalid");
                return notFound(login.render(form));
            }
            customer = userEmails.get(0);
            String s = form.field(Session.SessionTags.csrfTokenString.toString()).getValue().get();
            customer.setToken(s);
        } catch (Exception x) {
            Logger.warn("Exception - UserController: doLogin:\n" + x.toString());
            flash(FlashCodes.danger.toString(), "An critical error occurred, we apologize for any inconvenience!");
            return internalServerError(login.render(form));
        }

        Result result;
        String time = new Date().toString().replace(':', '-').replace(' ', '_');
        if (!customer.isComplete()) {
            if (customer.completeCheck()) {
                customer.setComplete(true);
                result = redirect(routes.CustomerController.index());
            }
            else {
                session().put(Session.User.id.toString(), String.valueOf(customer.getUserId()));
                session().put(Session.User.token.toString(), String.valueOf(customer.getToken()));
                session().put(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString());

                result = ok(registerDetails.apply(formFactory.form(UserRegisterDetails.class)));
                return result.withCookies(
                        buildCookie(AppCookie.newUser.toString(), AppCookie.newUser.toString()),
                        buildCookie(AppCookie.remember_me.toString(), (userLoginInfo.getbRememberMe()) ? remember_me_true.toString() : remember_me_false.toString()),
                        buildCookie(AppCookie.org.toString(), General.SITENAME.toString()),
                        buildCookie(AppCookie.loginTime.toString(), time),
                        buildCookie(AppCookie.user_token.toString(), customer.getToken()),
                        buildCookie(AppCookie.user_id.toString(), String.valueOf(customer.getUserId())));
            }
        } else {
            result = redirect(routes.CustomerController.index());
        }
        result = result.withCookies(
                buildCookie(AppCookie.remember_me.toString(), (userLoginInfo.getbRememberMe()) ? remember_me_true.toString() : remember_me_false.toString()),
                buildCookie(AppCookie.user_id.toString(), String.valueOf(customer.getUserId())),
                buildCookie(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString()),
                buildCookie(AppCookie.user_token.toString(), customer.getToken()),
                buildCookie(AppCookie.org.toString(), General.SITENAME.toString()),
                buildCookie(AppCookie.loginTime.toString(), time));
        return result;
}

    public Result logout() {

        Result redirect = redirect(controllers.Application.routes.HomeController.index()).withCookies(
                buildExpiredCookie(AppCookie.remember_me.toString()),
                buildExpiredCookie(AppCookie.user_type.toString()),
                buildExpiredCookie(AppCookie.user_id.toString()),
                buildExpiredCookie(AppCookie.user_token.toString())
        );
        session().clear();
//        AppCookie.logout(redirect);
        return redirect;
    }


}

