package controllers.Delivery;

import annotations.SessionVerifier;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.User.Staff.deliveryHome;

@With(SessionVerifier.LoadActive.class)
public class DeliveryController extends Controller {

    @With(SessionVerifier.RequiresActive.class)
    public Result index(){
        return ok(deliveryHome.render());
    }
}
