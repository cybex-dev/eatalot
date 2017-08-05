package controllers.User;

import controllers.Application.AppTags;
import models.CRUD;
import models.User.User;
import models.User.UserLogin;
import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.Mailer;
import play.Application;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.Application.Home.index;
import views.html.User.Account.*;

import javax.activation.FileDataSource;
import javax.inject.Inject;
import java.io.File;
import java.util.List;

/**
 * Created by cybex on 2017/07/08.
 */

public class AccountController extends Controller implements CRUD {

    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing User's home, with options of loging in or registering
     * @return
     */
    //default route : /user
    public Result index() {
        Http.Session session = session();
        if (session.containsKey("id"))
            return new CustomerController().index();
        return ok(index.render(" :: Account"));
    }

    /**
     * Renders login page
     * @return
     */
    public Result login() {
        return ok(login.render(formFactory.form(UserLogin.class)));
    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * Performs login operation, if successful, then redirect to user's home page
     * @return
     */
    public Result doLogin() {
        Form form = formFactory.form().bindFromRequest();

        if (form == null) {
            flash(AppTags.ErrorCodes.danger.toString(), "An error occurred!");
            return badRequest(login.render(form));
        }

        if (form.hasErrors()) {
            flash(AppTags.ErrorCodes.warning.toString(), "Please check all fields are correct");
            return badRequest(login.render(form));
        }

        String email = form.field("edtEmail").toString();
        String password = form.field("edtPassword").toString();

        Boolean bRemember = Boolean.FALSE;
        try {
            bRemember = Boolean.parseBoolean(form.field("chkRemember").toString());
        } catch (Exception x){
            Logger.warn("AccountController: doLogin: could not convert boolean");
        }

        User user = null;
        try {
            List<User> userEmails = User.find.query().where().ilike("email", email).findPagedList().getList();
            if (userEmails.size() > 1){
                Logger.warn("Multiple emails exist: [ " + email + " ]");
                flash(AppTags.ErrorCodes.danger.toString(), "An server error occurred, please try again later!");
                return internalServerError(login.render(form));
            }
            if (userEmails.size() == 0){
                flash(AppTags.ErrorCodes.warning.toString(), "Username/Password combination invalid");
                return internalServerError(login.render(form));
            }
            user = userEmails.get(0);
        }catch (Exception x){
            Logger.warn("Exception - AccountController: doLogin:\n" + x.toString());
            flash(AppTags.ErrorCodes.danger.toString(), "An critical error occurred, we apologize for any inconvenience!");
            return internalServerError(login.render(form));
        }

        Result result;
        if (user.getPassword().equals(password)){

            result = new CustomerController().index();
        }
        else {
            flash(AppTags.ErrorCodes.warning.toString(), "Incorrect username/password combination");
            result = notFound(login.render(form));
        }
        return result;
    }

    /**
     * Registers a user
     * @return
     */
    public Result create() {
        Form userForm = formFactory.form(User.class);
        return ok(register.render(userForm));
    }

    public Result logout(){
        AppTags.Session.User.clear(session());
        return ok(index.render(" :: Welcome"));
    }

    /**
     * Saves a new user to the database
     * @return
     */
    // TODO: 2017/07/18 Needs fixing, capture fields in form, then create new user with those fields
    public Result save() {
        Form userForm = formFactory.form().bindFromRequest();

        if (userForm.hasErrors()){
            flash(AppTags.ErrorCodes.warning.toString(), "Please check all fields");
            return badRequest(register.render(userForm));
        }

        String CRSFToken = userForm.field("crsfToken").getValue().get();
        User u = null;
        u.setToken(CRSFToken);
        u.save();

        try {
            generateVerificationEmail(u);
        }catch (Exception x){
            Logger.debug("Unable to send verification email:\nREASON: " + x.toString());
            flash(AppTags.ErrorCodes.warning.toString(), "Unable to process request, please try again later!");
            return ok(verify.render());
        }

        return ok(verify.render());
    }

    /**
     * Verifies a user's email address, if succcessful, sets flag in database for the user and
     * 1. Should automatically redirect to login page
     * 2. Show option to login
     *
     * Ideally needs to render page contiaing text "Please wait while your account is being verified",
     *          and Async operation, possibly using AKKA streams
     * followed by an updated text "Account verified" and an option mentioned above
     * @param token
     * @return
     */
    // TODO: 2017/07/18 Needs fixing
    public Result verify(String token) {
        List<User> userList = User.find.query().where().ilike("CRSFToken", token).findPagedList().getList();
        if (userList.size() > 1)
            return notFound(invalid.render("Invalid verification URL, please request a new email verification link"));
        User u = userList.get(0);
        if (u.getCRSFToken().isEmpty())
            return notFound(invalid.render("Verification URL has expired, please request a new email verification link"));
        u.setEmailVerified(true);
        u.save();
        return ok(verified.render());

    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * OPTIONAL
     * Use with caution, will require authentication from user via email.
     * @return
     */
    @Override
    public Result delete() {
        return null;
    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * Renders the edit user info page
     * @return
     */
    @Override
    public Result edit() {
        return null;
    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * Updates the user's information in the database
     * @return
     */
    @Override
    public Result update() {
        return null;
    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * Read user in database
     * @return
     */
    @Override
    public Result read() {
        return null;
    }

    // TODO: 2017/07/18 Needs testing
    /**
     * Sends email to user's email address. The token used for the session is saved to the database, and this token is matched against the email sent. If the token matches (as a field of the URL) then the email is authenticated.
     *
     * @param user User data object saved to database, used for sending email
     */
    private void generateVerificationEmail(User user) {
        String verificationUrl = AppTags.General.SITEURL.toString() + "/user/verified/" + user.getCRSFToken();
        Email e = new EmailBuilder()
                .from("Admin", "mailer@" + AppTags.General.SITEDOMAIN.toString())
                .to(user.getEmail())
                .subject("Eatalot Account Verification")
                .text("Welcome " + user.getName())
                .text("")
                .text("Please verified your account using the link provided below")
                .textHTML("<i><a style=\"color:blue;font-size:2em;\" href=\"" + verificationUrl + "\"/></i>")
                .text("")
                .text("If you have not created an account at " + AppTags.General.SITENAME.toString() + " then ignore this email")
                .text("")
                .text("Eatalot Team")
                .embedImage("Eatalot Logo", new FileDataSource(new File("/assets/images/logo.png")))
                .build();
        new Mailer().sendMail(e);
    }
}
