package controllers.Delivery;

import annotations.Routing.DeliveryStaffOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;

public class DeliveryController extends Controller {

    @With(LoadOrRedirectToLogin.class)
    @DeliveryStaffOnly
    public Result index(){
        return TODO;
    }
}
