package controllers.Order;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.User.Staff.kitchenHome;

public class KitchenController extends Controller {

    public Result index(){
        return ok(kitchenHome.render());
    }
}