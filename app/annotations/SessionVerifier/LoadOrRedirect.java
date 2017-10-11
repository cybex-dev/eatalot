package annotations.SessionVerifier;

import controllers.Application.AppTags;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

// Logins
@With(LoadActive.class)
public class LoadOrRedirect extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        Http.Session session = ctx.session();
        String s = session.get(AppTags.Session.SessionTags.session_status.toString());
        if (s == null) {
            ctx.flash().put(AppTags.FlashCodes.info.toString(), "Please login to view this page");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
        }
        if (!s.equalsIgnoreCase(AppTags.Session.SessionTags.valid.toString())){
            ctx.flash().put(AppTags.FlashCodes.info.toString(), "Session expired, please login again");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
        }

        // if valid, continue
        // this is used for logins
        return this.delegate.call(ctx);
    }
}
