package annotations.SessionVerifier;

import controllers.Application.AppTags;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@With(LoadActive.class)
public class RedirectToDashIfActive extends Action.Simple {
    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        if (ctx.session().containsKey(AppTags.Session.SessionTags.session_status.toString())) {
            String s = ctx.session().get(AppTags.Session.SessionTags.session_status.toString());
            if (s.equals(AppTags.Session.SessionTags.valid.toString()))
                return CompletableFuture.completedFuture(redirectToHome(ctx));
        }
        return this.delegate.call(ctx);
    }

    private Result redirectToHome(Http.Context ctx) {
        try {
            String user_type = ctx.session().get(AppTags.AppCookie.user_type.toString());
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(user_type);
            switch (userType) {
                case ADMIN: {
                    return redirect(controllers.User.routes.AdminController.index());
                }
                case KITCHEN: {
                    return redirect(controllers.User.routes.KitchenStaffController.index());
                }
                case DELIVERY: {
                    return redirect(controllers.User.routes.DeliveryStaffController.index());
                }
                case CUSTOMER: {
                    return redirect(controllers.User.routes.CustomerController.index());
                }
            }
        } catch (NullPointerException e){}
        ctx.flash().put(AppTags.FlashCodes.warning.toString(), "A redirect error occurred, please logout and login again");
        return redirect(controllers.Application.routes.HomeController.unknown());
    }
}
