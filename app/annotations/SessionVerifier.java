package annotations;

import controllers.Application.AppTags;
import controllers.Application.AppTags.AppCookie;
import controllers.Application.AppTags.FlashCodes;
import controllers.Application.AppTags.Session.SessionTags;
import controllers.Application.routes;
import models.User.Customer;
import models.User.CustomerInfo;
import models.User.Staff;
import models.User.User;
import play.Logger;
import play.filters.csrf.CSRF;
import play.mvc.*;
import scala.Option;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class SessionVerifier extends Controller {

    /**
     * For get requests, this checks if a session is active.
     * Active session is defined by:
     * UserId
     * TOken
     * user_type
     * User object matching token
     * If it is,
     * then return ?,
     * else
     * check if the following cookies are passed in header, and attempts to load into session
     * userId
     * token
     * user_type
     * then reverify session
     * else if no cookies, then do nothing.4
     * <p>
     * if a session has been loaded and is validated (i.e. correct), a session tag is added to prevent the rechecking, i.e. saves time
     */
    public static class LoadActive extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            Http.Session session = ctx.session();

            if (session.containsKey(SessionTags.session_status.toString())) {
                /**
                 * The user has logged in before since the session status is set
                 */
                String session_status = session.get(SessionTags.session_status.toString());
                if (session_status.equalsIgnoreCase(SessionTags.valid.toString())) {
                    return delegate.call(ctx);
                } else {
                    //session was invalidated for some reason
                    if (session_status.equalsIgnoreCase(SessionTags.invalid.toString())) {
                        //attempt to revalidate session
                        if (validSession(session)) {
                            //is valid, add session tag : station status -> valid
                            session.put(SessionTags.session_status.toString(), SessionTags.valid.toString());
                            ctx.flash().put(FlashCodes.info.toString(), "Welcome back");
                            return delegate.call(ctx);
                        }
                    }
                    /**session could not be revalidated, this is due to:
                     userId missing
                     token missing
                     usertype missing

                     userId and token not matching that which is stored in database
                     this implies tampering with session data or cookies stored

                     we clear the session and ensure all login cookies are removed, then relogin
                     */

                    removeLoginSession(session);
                    removeLoginCookies(ctx);

                    ctx.flash().put(FlashCodes.warning.toString(), "Session invalid, please log in again");
                }
            }

            /**
             * The user has not logged in,
             *  attempt to load session from cookies, this is done ONLY IF the remember me flag is set
             */
            loadSessionFromCookies(session, ctx);
            // session may or may not be loaded
            if (validSession(session)) {
                // session loaded successfully & is valid, add session tag : station status -> valid
                ctx.flash().put(FlashCodes.info.toString(), "Welcome back");
                session.put(SessionTags.session_status.toString(), SessionTags.valid.toString());
            }
            return delegate.call(ctx);
        }

        private void loadSessionFromCookies(Http.Session session, Http.Context ctx) {
            Http.Cookie cookie = ctx.request().cookie(AppCookie.remember_me.toString());

            // check if cookie doesn't exist or remember me is set to false
            if (cookie == null || !cookie.value().equalsIgnoreCase(AppCookie.remember_me_true.toString())) {
                return;
            }
        }

        private boolean validSession(Http.Session session) {
            String userId = "", token = "";
            AppCookie.UserType userType = null;

            if (session.containsKey(AppCookie.user_id.toString()) &&
                    session.containsKey(AppCookie.user_token.toString()) &&
                    session.containsKey(AppCookie.user_type.toString())) {
                userId = session.get(AppCookie.user_id.toString());
                token = session.get(AppCookie.user_token.toString());
                userType = AppCookie.UserType.parse(session.get(AppCookie.user_type.toString()));
            } else
                return false;
            boolean result = authUser(userId, token, userType);
            if (result) {
                String csrfToken = "";
                if (checkValidCSRF(ctx())) {
                    User.find.byId(userId).setToken(csrfToken);
                    session.put(AppCookie.user_token.toString(), csrfToken);
                }
            } else {
                flash().put(FlashCodes.danger.toString(), "No session token!");
            }
            return result;
        }


        private boolean authUser(String userId, String token, AppCookie.UserType userType) {
            switch (userType) {
                case CUSTOMER:
                    return Customer.Authenticate(userId, token);
                case KITCHEN:
                    return Staff.Authenticate(userId, token, true);
                case DELIVERY:
                    return Staff.Authenticate(userId, token, false);
            }
            return false;
        }
    }


    /**
     * Checks for an active session defined by the userInfo object
     * <p>
     * If not found, redirect to login
     */
    public class RequiresActive extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            if (!ctx.session().get(SessionTags.session_status.toString()).equalsIgnoreCase(SessionTags.valid.toString())) {
                ctx.flash().put("info", "invalid session, please login again!");
                removeLoginCookies(ctx);
                removeLoginSession(ctx.session());
                return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
            }

            if (!checkValidCSRF(ctx)) {
                ctx.flash().put(FlashCodes.danger.toString(), "Invalid session token!");
                removeLoginSession(ctx.session());
                return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
            }

            return this.delegate.call(ctx);
        }

    }

    private static boolean checkValidCSRF(Http.Context ctx) {
        String csrfToken = "";
        if (CSRF.getToken(ctx.request()).isPresent()) {
            csrfToken = CSRF.getToken(ctx.request()).get().value();
        } else
            return false;
        return csrfToken.equalsIgnoreCase(ctx.session().get(AppCookie.user_token.toString()));
    }

    private static void removeLoginCookies(Http.Context ctx) {
        ctx.response().discardCookie(AppCookie.user_id.toString());
        ctx.response().discardCookie(AppCookie.user_type.toString());
        ctx.response().discardCookie(AppCookie.user_token.toString());
        ctx.response().discardCookie(AppCookie.loginTime.toString());
        ctx.response().discardCookie(AppCookie.remember_me.toString());
    }

    private static void removeLoginSession(Http.Session session) {
        session.remove(AppCookie.user_id.toString());
        session.remove(AppCookie.user_type.toString());
        session.remove(AppCookie.user_token.toString());
    }

//    public class Verifier extends Security.Authenticator {
//        @Override
//        public String getUsername(Http.Context ctx) {
//            String token = getTokenFromHeader(ctx.request());
//            if (token == null)
//                return null;
//
//            List<Customer> customerList = Customer.find.query().where().ilike("token", token).findList();
//            if (customerList.size() == 0)
//                return null;
//            if (customerList.size() >= 2) {
//                Logger.warn("Duplicate tokens \'%s\'found in customer table", token);
//                return null;
//            }
//            Customer c = customerList.get(0);
//            return c.getEmail();
//        }
//
//        private String getTokenFromHeader(Http.Request request) {
//            //todo check this tag
//            if (request.hasHeader("X-AUTH-TOKEN")) {
//                String token = request.getHeaders().get("X-AUTH-TOKEN").get();
//                return (token.length() > 0)
//                        ? token
//                        : null;
//            }
//            return null;
//        }
//
//        @Override
//        public Result onUnauthorized(Http.Context ctx) {
//            Result r = redirect(controllers.User.routes.UserController.login());
//            r.session().clear();
//            r.flash().put("info", "invalid session, please login again!");
//            return r;
//        }
//    }


    //load sesion flrom cookies
}