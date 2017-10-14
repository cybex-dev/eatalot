package utility;

import controllers.Application.AppTags;
import controllers.Application.AppTags.AppCookie;
import controllers.Application.AppTags.AppCookie.UserType;
import controllers.Application.AppTags.Session.SessionTags;
import controllers.routes;
import libs.Mailer;
import models.User.Admin.Admin;
import models.User.Staff;
import models.User.User;
import play.Environment;
import play.Logger;
import play.filters.csrf.CSRF;
import play.libs.mailer.MailerClient;
import play.mvc.Http;

import javax.inject.Inject;
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
        String s = session.get(AppCookie.user_type.toString());
        if (s != null) {
            UserType userType = UserType.parse(s);
            if (userType == UserType.ADMIN) {
                String adminId = session.get(AppCookie.user_id.toString());
                Admin admin = Admin.find.byId(adminId);
                if (admin != null)
                    admin.setToken("");
            }
        }
        session.remove(AppCookie.user_id.toString());
        session.remove(AppCookie.user_type.toString());
        session.remove(AppCookie.user_token.toString());
        session.remove(SessionTags.session_status.toString());
		session.remove(SessionTags.display_name.toString());
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
        String userType = UserType.CUSTOMER.toString();
        if (user instanceof Staff)
            userType = ((Staff)user).isKitchenStaff() ? UserType.KITCHEN.toString() : UserType.DELIVERY.toString();
        session.put(AppCookie.user_type.toString(), userType);
        session.put(SessionTags.session_status.toString(), SessionTags.valid.toString());
        String displayName = "User";
        if (user.getName() != null)
            displayName = user.getName();
        if (user.getSurname() != null){
            if (displayName.isEmpty())
                displayName = user.getSurname();
            else
                displayName = displayName.concat(" ").concat(user.getSurname());
        }
		session.put(SessionTags.display_name.toString(), displayName);

        Http.Response response = ctx.response();
        if (rememberMe) {
            response.setCookie(AppCookie.buildCookie(AppCookie.user_id.toString(), user.getUserId()));
            response.setCookie(AppCookie.buildCookie(AppCookie.user_token.toString(), csrfToken));
            response.setCookie(AppCookie.buildCookie(AppCookie.user_type.toString(), userType));
            response.setCookie(AppCookie.buildCookie(AppCookie.remember_me.toString(), AppCookie.remember_me_true.toString()));
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
        String userType = UserType.ADMIN.toString();
        session.put(AppCookie.user_type.toString(), userType);
        session.put(SessionTags.session_status.toString(), SessionTags.valid.toString());
		session.put(SessionTags.display_name.toString(), SessionTags.admin.toString());
    }

    public static boolean checkValidCSRF(Http.Context ctx) {
        return CSRF.getToken(ctx.request()).isPresent();
//        String csrfToken = "";
//        if (CSRF.getToken(ctx.request()).isPresent()) {
//            csrfToken = CSRF.getToken(ctx.request()).get().value();
//        } else
//            return false;
//        return csrfToken.equalsIgnoreCase(ctx.session().get(AppCookie.user_token.toString()));
    }

}