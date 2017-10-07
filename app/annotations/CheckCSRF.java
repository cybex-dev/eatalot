package annotations;

import controllers.Application.AppTags;
import controllers.User.routes;
import models.User.Customer;
import models.User.Staff;
import play.filters.csrf.CSRF;
import play.filters.csrf.CSRFErrorHandler;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import scala.compat.java8.FutureConverters;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
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
