package controllers.User;

import controllers.Application.AppTags;
import controllers.Delivery.DeliveryController;
import controllers.Order.KitchenController;
import models.User.Staff;
import models.User.UserLoginInfo;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Application.Home.index;
import views.html.User.Staff.login;

import javax.inject.Inject;
import java.util.List;

public class StaffController extends Controller {
    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing Staff User's home, with options of loging in or registering
     *
     * @return
     */
    //default route : /user
    public Result index() {
        return ok(index.render());
//        try {
//            if (!response().cookies().stream().anyMatch(cookie -> cookie.name().equals(RememberMe.toString()) && cookie.value().equals(Boolean.TRUE))) {
//
//            }
//            Http.Cookie cookie_id = response().cookies().stream().filter(cookie1 -> cookie1.name().equals(user_id.toString())).findFirst().get();
//            Http.Cookie cookie_type = response().cookies().stream().filter(cookie1 -> cookie1.name().equals(user_type.toString())).findFirst().get();
//            if (cookie_id == null ||
//                    cookie_type == null) {
//
//            }
//            Long.parseLong(cookie_id.value());
//            Http.Session session = session();
//            Long id = Long.parseLong(cookie_id.value());
//            switch (parse(cookie_type.value())){
//                case CUSTOMER :{
//                     session = AppTags.Session.User.populateFromID(session, id);
//                     return ok(views.html.User.Customer.customerHome.render())
//                }
//            }
//        }
//        catch (Exception x){
//
//        }
    }

    /**
     * Renders login page
     *
     * @return
     */
    public Result login() {
        return ok(login.render(formFactory.form(UserLoginInfo.class)));
    }


    // TODO: 2017/07/18 Needs implementation

    /**
     * Performs login operation, if successful, then redirect to staff user's home page
     *
     * @return
     */
    public Result doLogin() {
        Form<UserLoginInfo> form = formFactory.form(UserLoginInfo.class).bindFromRequest();

        if (form == null) {
            flash(AppTags.FlashCodes.danger.toString(), "An error occurred!");
            return badRequest(login.render(form));
        }

        if (form.hasErrors()) {
            flash(AppTags.FlashCodes.warning.toString(), "Please check all fields are correct");
            return badRequest(login.render(form));
        }

        String email = form.field("edtEmail").getValue().get().toLowerCase();
        String password = form.field("edtPassword").getValue().get().toLowerCase();

        Boolean bRemember = Boolean.FALSE;
        try {
            bRemember = (form.field("chkRemember").getValue().get().toLowerCase().equals("on"));
        } catch (Exception x) {
            Logger.warn("UserController: doLogin: could not convert boolean");
            flash(AppTags.FlashCodes.warning.toString(), "An error occurred");
            return internalServerError(login.render(form));
        }

        Staff user = null;
        try {
            List<Staff> userEmails = Staff.find.query().where().eq(AppTags.Database.User.email, email).findList();
            if (userEmails.size() > 1) {
                Logger.warn("Multiple emails exist: [ " + email + " ]");
                flash(AppTags.FlashCodes.danger.toString(), "An server error occurred, please try again later!");
                return internalServerError(login.render(form));
            }
            if (userEmails.size() == 0) {
                flash(AppTags.FlashCodes.warning.toString(), "Username/Password combination invalid");
                return internalServerError(login.render(form));
            }
            user = userEmails.get(0);
        } catch (Exception x) {
            Logger.warn("Exception - UserController: doLogin:\n" + x.toString());
            flash(AppTags.FlashCodes.danger.toString(), "An critical error occurred, we apologize for any inconvenience!");
            return internalServerError(login.render(form));
        }

        Result result;
        if (user.getPassword().equals(password)) {
            return (user.isKitchenStaff())
                    ? new KitchenController().index()
                    : new DeliveryController().index();
        } else {
            flash(AppTags.FlashCodes.warning.toString(), "Incorrect username/password combination");
            return notFound(login.render(form));
        }
    }

    public Result logout() {
        AppTags.Session.User.clear(session());
        return ok(index.render());
    }


}


