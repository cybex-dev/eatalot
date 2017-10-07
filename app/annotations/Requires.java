package annotations;

import controllers.Application.AppTags;
import controllers.Application.AppTags.AppCookie;
import controllers.Application.AppTags.AppCookie.UserType;
import controllers.User.routes;
import models.User.Customer;
import models.User.Staff;
import models.User.User;
import play.Logger;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class Requires {

    public class RegistrationLogin extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            boolean b = checkStandardCookies(ctx);
            Http.Cookie newUserCookie = ctx.request().cookie(AppCookie.newUser.toString());
            if (newUserCookie != null) {
                if (newUserCookie.value().equals(AppCookie.newUser.toString()) && b) {
                    return this.delegate.call(ctx);
                }
            }
            ctx.flash().put(AppTags.FlashCodes.warning.toString(), "Your profile has already been created, please login");
            return completedFuture(redirect(controllers.User.routes.UserController.login()));
        }
    }

    public class Login extends Action.Simple {

        /**
         * Login requires the following cookies
         * <ul>
         * <li>user_id</li>
         * <li>user_type</li>
         * <li>user_token</li>
         * <li>remember_me</li>
         * <li>login_time</li>
         * <li>org</li>
         * </ul>
         *
         * @param ctx
         * @return
         */
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            if (checkStandardCookies(ctx))
                return this.delegate.call(ctx);
            else {
                ctx.flash().put(AppTags.FlashCodes.warning.toString(), "Invalid login, please try again!");
                return completedFuture(redirect(controllers.User.routes.UserController.login()));
            }
        }

        //load session
        //load session from cookies
    }

    public class LoginCustomer extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            boolean b = checkStandardCookies(ctx);
            Http.Cookie userTypeCookie = ctx.request().cookie(AppCookie.user_type.toString());
            UserType userType = UserType.parse(userTypeCookie.value());
            if (!b) {
                ctx.flash().put(AppTags.FlashCodes.warning.toString(), "Invalid login, please try again!");
                return completedFuture(redirect(controllers.User.routes.UserController.login()));
            }
            if (userType == UserType.CUSTOMER) {
                return this.delegate.call(ctx);
            } else {
                ctx.flash().put(AppTags.FlashCodes.warning.toString(), "You need to be a customer to access this page");
                return completedFuture(redirect(controllers.User.routes.UserController.login()));
            }
        }
    }

    /**
     * Check the existence of standard cookies and returns true if all cookies exist.
     * <p>
     * Checks if user type is valid for the user ID and the supplied token This information is matched in the database.
     * <p>
     * Required cookies are:
     * <ul>
     * <li>user_id</li>
     * <li>user_type</li>
     * <li>user_token</li>
     * <li>remember_me</li>
     * <li>login_time</li>
     * <li>org</li>
     * </ul>
     *
     * @param ctx
     * @return true if all cookies exist
     */
    private boolean checkStandardCookies(Http.Context ctx) {
        Http.Cookie userIdCookie = ctx.request().cookie(AppCookie.user_id.toString());
        Http.Cookie userTokenCookie = ctx.request().cookie(AppCookie.user_token.toString());
        Http.Cookie userTypeCookie = ctx.request().cookie(AppCookie.user_type.toString());
        Http.Cookie orgCookie = ctx.request().cookie(AppCookie.Org.toString());
        Http.Cookie loginTimeCookie = ctx.request().cookie(AppCookie.loginTime.toString());

        if (userIdCookie == null ||
                userTokenCookie == null ||
                userTypeCookie == null ||
                orgCookie == null ||
                loginTimeCookie == null)
            return false;

        try {
            UserType type = UserType.parse(userTypeCookie.value());
            switch (type) {
                case CUSTOMER: {
                    Customer c = Customer.find.byId(userIdCookie.value());
                    return (c != null) &&
                            c.getToken().equals(userTokenCookie.value());
                }

                case KITCHEN: {
                    Staff s = Staff.find.byId(userIdCookie.value());
                    return (s != null &&
                            s.getToken().equals(userTokenCookie.value()) &&
                            s.isKitchenStaff());
                }

                case DELIVERY: {
                    Staff sd = Staff.find.byId(userIdCookie.value());
                    return (sd != null &&
                            sd.getToken().equals(userTokenCookie.value()) &&
                            !sd.isKitchenStaff());
                }
            }
        } catch (Exception x) {
            Logger.warn("Exception Throw: \n" + x.toString());
            return false;
        }

        return false;
    }
}
