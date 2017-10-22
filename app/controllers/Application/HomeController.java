package controllers.Application;

import annotations.Routing.AnyAllowed;
import annotations.SessionVerifier.LoadActive;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import utility.Mobile;
import views.html.Application.Home.index;
import views.html.Application.Home.indexMobile;
import views.html.Application.forbidden;
import views.html.Application.unknown;
import views.html.Application.contact_us;
import views.html.Ordering.masterOrder;

import static controllers.Application.AppTags.AppCookie.*;
import static controllers.Application.AppTags.Session.SessionTags.visited;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    @AnyAllowed
    public Result invalidRoute(String path) {
        return notFound("Oops...\n\nThe page \"" + path + "\" does not exist");
    }

    /**
     * Custom forbidden page
     */

    @AnyAllowed
    public Result forbiddenAccess() {
        String message = "You are not allowed to access this page!";
        return forbidden(forbidden.render(message));
    }

    /**
     * Custom notFound page
     */

    @AnyAllowed
    public Result unknown() {
        String message = "Page not found!";
        return notFound(unknown.render(message));
    }

    @AnyAllowed
    public Result contactUs() {
        return ok(contact_us.render());
    }

    /**
     * An action that renders an HTML page with a customerHome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @With(LoadActive.class)

    public Result index() {
        if (session().get(visited.toString()) == null) {
            session().put(visited.toString(), remember_me_true.toString());
            if (request().cookie(org.toString()) == null) {
                flash().put(AppTags.FlashCodes.info.toString(), "Welcome to EatAloT!");
                response().setCookie(buildCookie(org.toString(), AppTags.General.SITEURL.toString()));
                if(Mobile.isMobile(request().getHeaders())) return ok(masterOrder.render(indexMobile.render()));
                else return ok(index.render());
            }
            if (request().cookie(org.toString()).value().equals(AppTags.General.SITEURL.toString()))
                flash().put(AppTags.FlashCodes.info.toString(), "Welcome back!");
            else {
                flash().put(AppTags.FlashCodes.info.toString(), "Welcome to EatAloT!");
                response().setCookie(buildCookie(org.toString(), AppTags.General.SITEURL.toString()));
            }
        }

        if(Mobile.isMobile(request().getHeaders())) return ok(masterOrder.render(indexMobile.render()));
        else return ok(index.render());
    }

}
