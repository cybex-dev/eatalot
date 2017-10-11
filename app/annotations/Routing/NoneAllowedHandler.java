package annotations.Routing;

import controllers.Application.AppTags;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class NoneAllowedHandler extends Action.Simple {
    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

        return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
    }
}
