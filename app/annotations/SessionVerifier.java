package annotations;

import controllers.Application.AppTags;
import controllers.User.routes;
import models.User.Customer;
import models.User.User;
import play.Logger;
import play.filters.csrf.CSRF;
import play.mvc.*;

import javax.persistence.NonUniqueResultException;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class SessionVerifier extends Controller {

    public class Load extends Action.Simple{
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
//            AppTags.Session.loadSessionfromCookies(ctx.request(), ctx.session());
            return null;
        }
    }

    public class Active extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            return null;
        }
    }

    public class Verifier extends Security.Authenticator {
        @Override
        public String getUsername(Http.Context ctx) {
            String token = getTokenFromHeader(ctx.request());
            if (token == null)
                return null;

            List<Customer> customerList = Customer.find.query().where().ilike("token", token).findList();
            if (customerList.size() == 0)
                return null;
            if (customerList.size() >= 2) {
                Logger.warn("Duplicate tokens \'%s\'found in customer table", token);
                return null;
            }
            Customer c = customerList.get(0);
            return c.getEmail();
        }

        private String getTokenFromHeader(Http.Request request) {
            //todo check this tag
            if (request.hasHeader("X-AUTH-TOKEN")) {
                String token = request.getHeaders().get("X-AUTH-TOKEN").get();
                return (token.length() > 0)
                        ? token
                        : null;
            }
            return null;
        }

        @Override
        public Result onUnauthorized(Http.Context ctx) {
            Result r = redirect(controllers.User.routes.UserController.login());
            r.session().clear();
            r.flash().put("info", "invalid session, please login again!");
            return r;
        }
    }


    //load sesion flrom cookies
}