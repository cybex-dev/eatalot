package controllers.Delivery;

import annotations.Routing;
import annotations.SessionVerifier;
import controllers.Application.AppTags;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.User.Staff.deliveryHome;

@With(SessionVerifier.LoadActive.class)
@Routing.DeliveryStaffOnly
public class DeliveryController extends Controller {

    @With(SessionVerifier.LoadOrRedirect.class)
    public Result index(){
        return TODO;
    }
}
