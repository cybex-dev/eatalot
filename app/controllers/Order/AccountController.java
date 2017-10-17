package controllers.Order;

import controllers.Order.OrderController;
import models.Order.CustomerOrder;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.Objects;

import views.html.Ordering.*;
import views.html.Global.Temp.*;
import views.html.User.Temp.signup;

/**
 * Created by dylan on 2017/07/22.
 */
public class AccountController extends Controller{

    /**
     * User logs in
     * For now user_id is users email
     * @return redirect to menu page
     */
    // TODO: Integrate login
    public Result doLogin(){
        session("user", "customer");
        session("username", "Dylan");
        session("email", "dylan@dylan.com");
        setCurrentOrder();
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }

    /**
     * Check if there is an unsubmitted order from a previous session
     * Resume previous order after logout
     * Set session to that orderId
     * There should only ever be one unsubmitted order per user
     */
    private void setCurrentOrder(){
        List<CustomerOrder> lstOrders = CustomerOrder.findOrderByUserId(session("email"));
        if (lstOrders != null) {
            for (CustomerOrder lstOrder : lstOrders) {
                if (lstOrder.getStatusId().equals("unsubmitted")) {
                    session("orderId", String.valueOf(lstOrder.getOrderId()));
                    break;
                }
            }
        }
    }

    public Result doSignOut(){
        session("user", null);
        session("username", null);
        session("email", null);
        session("orderId", null);
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }

    public Result getSignUp(){
        return ok(master.render("Sign up", signup.render()));
    }

    public static boolean isCustomer(){
        return Objects.equals(session("user"), "customer");
    }
}