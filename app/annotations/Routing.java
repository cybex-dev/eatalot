package annotations;

import controllers.Application.AppTags;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Results.redirect;

public class Routing {

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface DeliveryStaffOnly {
        Class<? extends DeliveryStaffOnlyHandler> value() default DeliveryStaffOnlyHandler.class;
    }
    public static class DeliveryStaffOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.DELIVERY ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface StaffOnly {
        Class<? extends KitchenStaffOnlyHandler> value() default KitchenStaffOnlyHandler.class;
    }
    public static class StaffOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.DELIVERY ||
                    userType == AppTags.AppCookie.UserType.KITCHEN ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }

        private CompletionStage<Result> redirectForbidden() {
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface NoneAllowed {
        Class<? extends NoneAllowedHandler> value() default NoneAllowedHandler.class;
    }
    public static class NoneAllowedHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface AnyAllowed {
        Class<? extends AnyAllowedHandler> value() default AnyAllowedHandler.class;
    }
    public static class AnyAllowedHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return this.delegate.call(ctx);
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface KitchenStaffOnly {
        Class<? extends KitchenStaffOnlyHandler> value() default KitchenStaffOnlyHandler.class;
    }
    public static class KitchenStaffOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.KITCHEN ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface AdminOnly {
        Class<? extends AdminOnlyHandler> value() default AdminOnlyHandler.class;
    }
    public static class AdminOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            // TODO: 2017/10/10 admin session token
            return redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface CustomersOnly {
        Class<? extends CustomersOnlyHandler> value() default CustomersOnlyHandler.class;
    }
    public static class CustomersOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.CUSTOMER ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface CustomersKitchenOnly {
        Class<? extends CustomersKitchenOnlyHandler> value() default CustomersKitchenOnlyHandler.class;
    }
    public static class CustomersKitchenOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.CUSTOMER ||
                    userType == AppTags.AppCookie.UserType.KITCHEN ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }
    }

    @With(CheckCSRF.class)
    @Target({ElementType.METHOD, ElementType.TYPE})
    public static @interface CustomersDeliveryOnly {
        Class<? extends CustomersDeliveryOnlyHandler> value() default CustomersDeliveryOnlyHandler.class;
    }
    public static class CustomersDeliveryOnlyHandler extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(ctx.session().get(AppTags.AppCookie.user_type.toString()));

            return (userType == AppTags.AppCookie.UserType.CUSTOMER ||
                    userType == AppTags.AppCookie.UserType.DELIVERY ||
                    userType == AppTags.AppCookie.UserType.ADMIN)
                    ? this.delegate.call(ctx)
                    : redirectForbidden();
        }
    }

    private static CompletionStage<Result> redirectForbidden() {
        return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
    }
}
