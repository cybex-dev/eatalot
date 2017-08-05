package controllers.User;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.User.Customer.customerHome;

/**
 * Created by cybex on 2017/07/21.
 */
public class CustomerController extends Controller {

    public  Result index() {
        return ok(customerHome.render());
    } //rmoved static while changing Home page
}
