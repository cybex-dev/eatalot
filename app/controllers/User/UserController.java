package controllers.User;

import controllers.Application.AppTags;
import controllers.Order.KitchenController;
import controllers.Delivery.DeliveryController;
import libs.Mailer;
import models.CRUD;
import models.User.Customer;
import models.User.User;
import models.User.UserLoginInfo;
import models.User.UserRegisterDetails;
import org.apache.commons.codec.digest.Crypt;
import play.Logger;
import play.api.libs.Crypto;
import play.api.libs.Crypto$;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.App;
import views.html.Application.Home.index;
import views.html.User.User.login;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import views.html.User.Customer.registerDetails;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.AppCookie.buildCookie;
import static controllers.Application.AppTags.AppCookie.buildExpiredCookie;
import static controllers.Application.AppTags.AppCookie.clear;

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
    //
    public Result login() {
        Http.Response response = response();
        Http.Request request = request();
        Http.Session session = session();
        Result result = AppTags.Session.checkExistingLogin(request(), session());
        if (result != null)
            return result;
        return ok(login.render(formFactory.form(UserLoginInfo.class)));
    }

    /**
     * Performs login operation, if successful, then redirect to user's home page
     *
     * @return
     */
    public Result doLogin() {
        Form<UserLoginInfo> form = formFactory.form(UserLoginInfo.class).bindFromRequest();

        if (form.hasErrors()) {
            flash(ErrorCodes.warning.toString(), "Please check all fields are correct");
            return badRequest(login.render(form));
        }

        UserLoginInfo userLoginInfo = form.get();
        //init login
        Customer customer = null;
        try {
            List<Customer> userEmails = Customer.find.query().where().eq(Database.User.email, userLoginInfo.getEmail()).findList();
            if (userEmails.size() > 1) {
                flash(ErrorCodes.danger.toString(), "An server error occurred, please try again later!");
                return notFound(login.render(form));
            }
            if (userEmails.size() == 0) {
                flash(ErrorCodes.warning.toString(), "Username/Password combination invalid");
                return notFound(login.render(form));
            }
            customer = userEmails.get(0);
        } catch (Exception x) {
            Logger.warn("Exception - UserController: doLogin:\n" + x.toString());
            flash(ErrorCodes.danger.toString(), "An critical error occurred, we apologize for any inconvenience!");
            return internalServerError(login.render(form));
        }

        Result result;
        if (!customer.isComplete()) {
            result = ok(registerDetails.apply(formFactory.form(UserRegisterDetails.class)));
            result = result.withCookies(buildCookie(AppCookie.newUser.toString(), AppCookie.newUser.toString()));
        } else {
            result = redirect(routes.CustomerController.index());
        }
        String time = new Date().toString().replace(':', '-').replace(' ', '_');
        result = result.withCookies(
                buildCookie(AppCookie.RememberMe.toString(), (userLoginInfo.getbRememberMe()) ? "true" : "false"),
                buildCookie(AppCookie.user_id.toString(), String.valueOf(customer.getUserId())),
                buildCookie(AppCookie.user_type.toString(), AppCookie.UserType.CUSTOMER.toString()),
                buildCookie(AppCookie.user_token.toString(), customer.getToken()),
                buildCookie(AppCookie.Org.toString(), General.SITENAME.toString()),
                buildCookie(AppCookie.loginTime.toString(), time));
        return result;
}

    public Result logout() {

        Result redirect = redirect(controllers.Application.routes.HomeController.index()).withCookies(
                buildExpiredCookie(AppCookie.RememberMe.toString()),
                buildExpiredCookie(AppCookie.user_type.toString()),
                buildExpiredCookie(AppCookie.user_id.toString()),
                buildExpiredCookie(AppCookie.user_token.toString())
        );
        session().clear();
//        AppCookie.logout(redirect);
        return redirect;
    }


}

