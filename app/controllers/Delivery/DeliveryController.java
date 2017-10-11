package controllers.Delivery;

import annotations.Routing.DeliveryStaffOnly;
import annotations.SessionVerifier.LoadActive;
import annotations.SessionVerifier.LoadOrRedirect;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;

@With(LoadActive.class)
@DeliveryStaffOnly
public class DeliveryController extends Controller {

    @With(LoadOrRedirect.class)
    public Result index(){
        return TODO;
    }
}
