package annotations;

import controllers.Application.AppTags;
import play.filters.csrf.CSRF;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class CheckCSRF extends Action<Result> {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        CSRF.Token token = CSRF.getToken(ctx.request()).orElse(null);
        if (token != null){
            if (token.value().length() > 0)
                    this.delegate.call(ctx);
        }
        ctx.flash().put(AppTags.FlashCodes.warning.toString(), "Session token invalid, please login again");
        return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.index()));
    }
}
