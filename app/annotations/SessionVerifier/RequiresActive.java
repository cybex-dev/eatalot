package annotations.SessionVerifier;

import controllers.Application.AppTags;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import utility.Utility;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static utility.Utility.checkValidCSRF;
import static utility.Utility.removeLoginCookies;
import static utility.Utility.removeLoginSession;

/**
 * Checks for an active session defined by the userInfo object
 * <p>
 * If not found, redirect to login
 */
// POST
public class RequiresActive extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        if (!ctx.session().get(AppTags.Session.SessionTags.session_status.toString()).equalsIgnoreCase(AppTags.Session.SessionTags.valid.toString())) {
            ctx.flash().put("info", "invalid session, please login again!");
            removeLoginCookies(ctx);
            removeLoginSession(ctx.session());
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
        }

        if (!checkValidCSRF(ctx)) {
            ctx.flash().put(AppTags.FlashCodes.danger.toString(), "Invalid session token!");
            removeLoginSession(ctx.session());
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
        }

        return this.delegate.call(ctx);
    }

}
