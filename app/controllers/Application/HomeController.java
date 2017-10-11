package controllers.Application;

import annotations.Routing.AnyAllowed;
import annotations.SessionVerifier.LoadActive;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.Application.Home.index;
import views.html.Application.forbidden;
import views.html.Application.unknown;

import static controllers.Application.AppTags.AppCookie.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@AnyAllowed
public class HomeController extends Controller {

    public Result invalidRoute(String path) {
        return notFound("Oops...\n\nThe page \"" + path + "\" does not exist");
    }

    /**
     * Custom forbidden page
     */
    public Result forbiddenAccess() {
        String message = "You are not allowed to access this page!";
        return forbidden(forbidden.render(message));
    }

    /**
     * Custom notFound page
     */
    public Result unknown() {
        String message = "Page not found!";
        return notFound(unknown.render(message));
    }

    /**
     * An action that renders an HTML page with a customerHome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @With(LoadActive.class)
    public Result index() {
        if (request().cookie(org.toString()) == null){
            flash().put(AppTags.FlashCodes.info.toString(), "Welcome to EatAloT!");
            response().setCookie(buildCookie(org.toString(), AppTags.General.SITEURL.toString()));
            return ok(index.render());
        }
        if (request().cookie(org.toString()).value().equals(AppTags.General.SITEURL.toString()))
            flash().put(AppTags.FlashCodes.info.toString(), "Welcome back!");
        else {
            flash().put(AppTags.FlashCodes.info.toString(), "Welcome to EatAloT!");
            response().setCookie(buildCookie(org.toString(), AppTags.General.SITEURL.toString()));
        }
        return ok(index.render());
    }

}
