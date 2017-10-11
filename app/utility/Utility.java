package utility;

import controllers.Application.AppTags;
import controllers.Application.AppTags.AppCookie;
import models.User.Admin.Admin;
import models.User.Staff;
import models.User.User;
import play.filters.csrf.CSRF;
import play.mvc.Http;

import java.util.Date;

public class Utility {

    public static void logout(Http.Context ctx, Http.Session session) {
        removeLoginSession(session);
        removeLoginCookies(ctx);
    }

    public static void removeLoginCookies(Http.Context ctx) {
        ctx.response().discardCookie(AppCookie.user_id.toString());
        ctx.response().discardCookie(AppCookie.user_token.toString());
        ctx.response().discardCookie(AppCookie.user_type.toString());
        ctx.response().discardCookie(AppCookie.remember_me.toString());
    }

    public static void removeLoginSession(Http.Session session) {
        session.remove(AppCookie.user_id.toString());
        session.remove(AppCookie.user_type.toString());
        session.remove(AppCookie.user_token.toString());
    }

    /**
     * Assume user is customer, unless a staff user is passed though. Uses instanceof to check user type
     * @param ctx
     * @param user
     * @param csrfToken
     * @param rememberMe
     * @return
     */
    public static Http.Response login(Http.Context ctx, User user, String csrfToken, Boolean rememberMe) {
        //set new login token
        Http.Session session = ctx.session();
        user.setToken(csrfToken);

        //add session data
        session.put(AppCookie.user_id.toString(), user.getUserId());
        session.put(AppCookie.user_token.toString(), csrfToken);
        String userType = AppCookie.UserType.CUSTOMER.toString();
        if (user instanceof Staff)
            userType = ((Staff)user).isKitchenStaff() ? AppCookie.UserType.KITCHEN.toString() : AppCookie.UserType.DELIVERY.toString();
        session.put(AppCookie.user_type.toString(), userType);
        session.put(AppTags.Session.SessionTags.session_status.toString(), AppTags.Session.SessionTags.valid.toString());

        Http.Response response = ctx.response();
        if (rememberMe) {
            response.setCookie(AppCookie.buildCookie(AppCookie.user_id.toString(), user.getUserId()));
            response.setCookie(AppCookie.buildCookie(AppCookie.user_token.toString(), csrfToken));
            response.setCookie(AppCookie.buildCookie(AppCookie.user_type.toString(), userType));
        }

        String currentTime = new Date().toString().replace(':', '-').replace(' ', '_');
        response.setCookie(AppCookie.buildCookie(AppCookie.login_time.toString(), currentTime));
        return response;
    }

    /**
     * Assume user is customer, unless a staff user is passed though. Uses instanceof to check user type
     * @param ctx
     * @param admin
     * @param csrfToken
     * @return
     */
    public static void loginAdmin(Http.Context ctx, Admin admin, String csrfToken) {
        //set new login token
        Http.Session session = ctx.session();
        admin.setToken(csrfToken);

        //add session data
        session.put(AppCookie.user_id.toString(), admin.getAdminId());
        session.put(AppCookie.user_token.toString(), csrfToken);
        String userType = AppCookie.UserType.ADMIN.toString();
        session.put(AppCookie.user_type.toString(), userType);
        session.put(AppTags.Session.SessionTags.session_status.toString(), AppTags.Session.SessionTags.valid.toString());
    }

    public static boolean checkValidCSRF(Http.Context ctx) {
        String csrfToken = "";
        if (CSRF.getToken(ctx.request()).isPresent()) {
            csrfToken = CSRF.getToken(ctx.request()).get().value();
        } else
            return false;
        return csrfToken.equalsIgnoreCase(ctx.session().get(AppCookie.user_token.toString()));
    }

}