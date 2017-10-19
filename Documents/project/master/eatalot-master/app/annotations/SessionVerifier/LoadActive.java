package annotations.SessionVerifier;

import controllers.Application.AppTags;
import models.User.Customer.Customer;
import models.User.Staff;
import models.User.User;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

import static utility.Utility.*;

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
// GET
public class LoadActive extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        Http.Session session = ctx.session();

        if (session.containsKey(AppTags.Session.SessionTags.session_status.toString())) {
            /**
             * The user has logged in before since the session status is set
             */
            String session_status = session.get(AppTags.Session.SessionTags.session_status.toString());
            if (session_status.equalsIgnoreCase(AppTags.Session.SessionTags.valid.toString())) {
                return this.delegate.call(ctx);
            } else {
                //session was invalidated for some reason
                if (session_status.equalsIgnoreCase(AppTags.Session.SessionTags.invalid.toString())) {
                    //attempt to revalidate session
                    if (validSession(session)) {
                        //is valid, add session tag : station status -> valid
                        session.put(AppTags.Session.SessionTags.session_status.toString(), AppTags.Session.SessionTags.valid.toString());
                        ctx.flash().put(AppTags.FlashCodes.info.toString(), "Welcome back");
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

                ctx.flash().put(AppTags.FlashCodes.warning.toString(), "Session invalid, please log in again");
                //re login
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
            ctx.flash().put(AppTags.FlashCodes.info.toString(), "Welcome back");
            session.put(AppTags.Session.SessionTags.session_status.toString(), AppTags.Session.SessionTags.valid.toString());
        }
        return delegate.call(ctx);
    }

    private void loadSessionFromCookies(Http.Session session, Http.Context ctx) {
        Http.Cookie cookie = ctx.request().cookie(AppTags.AppCookie.remember_me.toString());

        // check if cookie doesn't exist or remember me is set to false
        if (cookie == null || !cookie.value().equalsIgnoreCase(AppTags.AppCookie.remember_me_true.toString())) {
            return;
        }
        Http.Cookie cookieUserType = ctx.request().cookie(AppTags.AppCookie.user_type.toString());
        if (cookieUserType == null)
            return;
        AppTags.AppCookie.UserType userType = AppTags.AppCookie.UserType.parse(cookieUserType.value());
        if (userType == null)
            return;
        Http.Cookie cookieUserToken = ctx.request().cookie(AppTags.AppCookie.user_type.toString());
        if (cookieUserToken == null)
            return;
        Http.Cookie cookieUserId = ctx.request().cookie(AppTags.AppCookie.user_type.toString());
        if (cookieUserId == null)
            return;

        session.put(AppTags.AppCookie.user_id.toString(), cookieUserId.value());
        session.put(AppTags.AppCookie.user_token.toString(), cookieUserToken.value());
        session.put(AppTags.AppCookie.user_type.toString(), userType.toString());

        if (userType == AppTags.AppCookie.UserType.ADMIN)
            session.put(AppTags.Session.SessionTags.display_name.toString(), AppTags.Session.SessionTags.admin.toString());
        else {
            User user = null;
            if (userType == AppTags.AppCookie.UserType.CUSTOMER) {
                user = Customer.find.byId(cookieUserId.value());
            } else if (userType == AppTags.AppCookie.UserType.DELIVERY ||
                    userType == AppTags.AppCookie.UserType.KITCHEN) {
                user = Staff.find.byId(cookieUserId.value());
            } else
                return;
            if (user == null)
                return;
            session.put(AppTags.Session.SessionTags.display_name.toString(), user.getName().concat(" ").concat(user.getSurname()));
        }
    }

    private boolean validSession(Http.Session session) {
        String userId = "", token = "";
        AppTags.AppCookie.UserType userType = null;

        if (session.containsKey(AppTags.AppCookie.user_id.toString()) &&
                session.containsKey(AppTags.AppCookie.user_token.toString()) &&
                session.containsKey(AppTags.AppCookie.user_type.toString())) {
            userId = session.get(AppTags.AppCookie.user_id.toString());
            token = session.get(AppTags.AppCookie.user_token.toString());
            userType = AppTags.AppCookie.UserType.parse(session.get(AppTags.AppCookie.user_type.toString()));
        } else
            return false;
        boolean result = authUser(userId, token, userType);
        if (result) {
            String csrfToken = "";
            if (checkValidCSRF(Controller.ctx())) {
                User.find.byId(userId).setToken(csrfToken);
                session.put(AppTags.AppCookie.user_token.toString(), csrfToken);
            }
        } else {
            // TODO: 2017/10/10 check url visited
            Controller.flash().put(AppTags.FlashCodes.danger.toString(), "No session token!");
        }
        return result;
    }


    private boolean authUser(String userId, String token, AppTags.AppCookie.UserType userType) {
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
