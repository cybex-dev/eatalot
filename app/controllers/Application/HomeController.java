package controllers.Application;

import annotations.Routing;
import annotations.SessionVerifier;
import com.typesafe.config.Optional;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import views.html.Application.Home.index;
import views.html.Application.forbidden;

import static controllers.Application.AppTags.AppCookie.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@Routing.AnyAllowed
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
     * An action that renders an HTML page with a customerHome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @With(SessionVerifier.LoadActive.class)
    public Result index() {
        if (response().cookie(org.toString()).isPresent())
            flash().put(AppTags.FlashCodes.info.toString(), "Welcome back!");
        else {
            flash().put(AppTags.FlashCodes.info.toString(), "Welcome to EatAloT!");
            response().setCookie(buildCookie(org.toString(), AppTags.General.SITEURL.toString()));
        }
        return ok(index.render());
    }

}
