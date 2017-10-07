package controllers;

import models.ordering.CustomerOrder;
import play.api.mvc.Session;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.global.master;
import views.html.user.signup;

import java.util.List;
import java.util.Objects;

/**
 * Created by dylan on 2017/07/22.
 */
public class AccountController extends Controller{

    /**
     * User logs in
     * For now user_id is users email
     * @return redirect to menu page
     */
    // TODO: Implement login
    public Result doLogin(){
        session("user", "customer");
        session("username", "Dylan");
        session("email", "dylan@dylan.com");
        setCurrentOrder();
        return redirect(routes.OrderController.getMenu());
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
        return redirect(routes.OrderController.getMenu());
    }

    public Result getSignUp(){
//        return ok(views.html.global.master.render("Sign up", views.html.user.signup.render()));
        return ok(master.render("Sign up", signup.render()));
    }

    public static boolean isCustomer(){
        return Objects.equals(session("user"), "customer");
    }

}
