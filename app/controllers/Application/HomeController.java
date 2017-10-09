package controllers.Application;

import annotations.SessionVerifier;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import views.html.Application.Home.index;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result invalidRoute(String path) {
        return notFound("Oops...\n\nThe page \"" + path + "\" does not exist");
    }

    /**
     * An action that renders an HTML page with a customerHome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @With(SessionVerifier.LoadActive.class)
    public Result index() {
        return ok(index.render());
    }

}
