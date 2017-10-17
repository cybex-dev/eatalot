package annotations;

//import org.junit.Before;

import play.api.Play;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

//https://stackoverflow.com/questions/7415030/enforce-https-routing-for-login-with-play-framework?rq=1
public class HttpsRequired extends Action<Controller> {
//
//    @Inject
//    private ConfigFactory config;

    private static final String SSL_HEADER = "x-forwarded-proto";

    /** Called before every request to ensure that HTTPS is used. */
//    @Before
//    public static void redirectToHttps() {
//        //if it's not secure, but Heroku has already done the SSL processing then it might actually be secure after all
//        Http.Request request = request();
//
//        boolean secure = request.secure();
//        if (!secure && request.getHeaders().get("x-forwarded-proto") != null) {
//            secure = request.getHeaders().get("x-forwarded-proto").get().contains("https");
//        }
//
//        //redirect if it's not secure
//        if (!secure) {
//            String url = redirectHostHttps() + request.uri();
//            System.out.println("Redirecting to secure: " + url);
//            redirect(url);
//        }
//    }

    /** Renames the host to be https://, handles both Heroku and local testing. */
//    public static String redirectHostHttps() {
//        if (Play.current().mode().equals("dev")) {
//            String[] pieces = request().host().split(":");
//            String httpsPort = ConfigFactory.load().getString("https.port");
//            return "https://" + pieces[0] + ":" + httpsPort;
//        } else {
//            if (request().host().contains("http:")) {
//                return "https://" + request().host();
//            }
//        }
//    }

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        final CompletionStage<Result> resultCompletionStage;
        if (Play.current().mode().toString().toLowerCase().equals("prod") &&
                isHttpsRequest(ctx.request())) {
            resultCompletionStage = CompletableFuture.completedFuture(redirect("https://" + ctx.request().host() + ctx.request().uri()));
        }
        else {
            resultCompletionStage = this.delegate.call(ctx);
        }
        return resultCompletionStage;
    }

    private static boolean isHttpsRequest(Http.Request request){
        Optional<String> httpsHeader = request.getHeaders().get(SSL_HEADER);
        return (httpsHeader.isPresent() && httpsHeader.get().toLowerCase().contains("https"));
    }
}