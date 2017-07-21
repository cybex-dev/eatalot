package controllers.User;

import controllers.Application.AppTags;
import models.CRUD;
import models.User.User;
import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.Mailer;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
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
     * Should display default index page, showing User's home, with options of loging in or registering
     * @return
     */
    public Result index() {
        return ok(index.render());
    }

    /**
     * Renders login page
     * @return
     */
    public Result login() {
        return ok(login.render(null));
    }

    // TODO: 2017/07/18 Needs implementation

    /**
     * Performs login operation, if successful, then redirect to user's home page
     * @return
     */
    public Result doLogin() {
        return TODO;


//        DynamicForm form = formFactory.form().bindFromRequest("id", "password");
//
//        String id = form.get("id");
//        String password = form.get("password");
//
//        if (form == null)
//            return notFound("Empty data");
//
//        Integer userId = -1;
//        try {
//            Integer t = Integer.parseInt(id);
//            if (t.equals(userId))
//                throw new Exception("Invalid User Exception");
//            userId = t;
//        }catch (Exception x){
//            return notFound("Invalid User");
//        }
//
//        Result result;
//        if (User.validUser(userId, password)){
//            Integer finalUserId = userId;
//            User user = User.getAllUsers().stream().filter(user1 -> user1.id.equals(finalUserId)).findFirst().get();
//            result = ok(index.render(user.id, user.name, user.emailVerified));
//        }
//        else {
//            result = notFound(login.render("Invalid credentials!"));
//        }
//        return ok("hi");
    }

    /**
     * Registers a user
     * @return
     */
    public Result create() {
        Form<User> userForm = formFactory.form(User.class);
        return ok(views.html.User.Account.register.render(userForm));
    }

    /**
     * Saves a new user to the database
     * @return
     */
    // TODO: 2017/07/18 Needs fixing, capture fields in form, then create new user with those fields
    public Result save() {
        Form userForm = formFactory.form().bindFromRequest();
        String CRSFToken = userForm.field("crsfToken").getValue().get();
        User u = null;
        u.setToken(CRSFToken);
        u.save();
        generateVerificationEmail(u);
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
        String verificationUrl = AppTags.SITEURL.toString() + "/user/verified/" + user.getCRSFToken();
        Email e = new EmailBuilder()
                .from("Admin", "mailer@" + AppTags.SITEDOMAIN.toString())
                .to(user.getEmail())
                .subject("Eatalot Account Verification")
                .text("Welcome " + user.getName())
                .text("")
                .text("Please verified your account using the link provided below")
                .textHTML("<i><a style=\"color:blue;font-size:2em;\" href=\"" + verificationUrl + "\"/></i>")
                .text("")
                .text("If you have not created an account at " + AppTags.SITENAME.toString() + " then ignore this email")
                .text("")
                .text("Eatalot Team")
                .embedImage("Eatalot Logo", new FileDataSource(new File("/assets/images/logo.png")))
                .build();
        new Mailer().sendMail(e);
    }
}
