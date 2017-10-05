package controllers.Delivery;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.User.Staff.deliveryHome;

public class DeliveryController extends Controller {

    public Result index(){
        return ok(deliveryHome.render());
    }
}
