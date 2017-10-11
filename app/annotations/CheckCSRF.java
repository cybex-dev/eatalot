package annotations;

import controllers.Application.AppTags;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.CSRF;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CheckCSRF extends Action<Result> {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        CSRF.Token token = CSRF.getToken(ctx.request()).orElse(null);
        if (token != null) {
            this.delegate.call(ctx);
        }
        return addCSRFToken(ctx);
    }

    @AddCSRFToken
    private CompletionStage<Result> addCSRFToken(Http.Context ctx) {
        ctx.flash().put(AppTags.FlashCodes.info.toString(), "Token added, hopefully");
        Optional<Http.Cookie> cookie = ctx.response().cookie(AppTags.Session.SessionTags.csrfTokenString.toString());
        if (cookie.isPresent()) {
            ctx.flash().put(AppTags.FlashCodes.success.toString(), "CSRF Token added: " + cookie.get().value());
            this.delegate.call(ctx);
        }

        ctx.flash().put(AppTags.FlashCodes.success.toString(), "Session token invalid, please login again");
        return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.index()));

    }
}
