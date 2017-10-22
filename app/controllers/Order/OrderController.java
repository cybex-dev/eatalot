package controllers.Order;

import controllers.Application.AppTags;
import controllers.User.*;
import io.ebean.Ebean;
import models.Finance.Payment;
import models.Order.*;
import models.User.Customer.Customer;
import org.h2.engine.Session;
import play.mvc.Controller;
import play.mvc.Result;
import scala.App;
import utility.StatusId;
import views.html.Global.Temp.master;
import views.html.Ordering.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dylan on 2017/07/18.
 * Manages orders
 */
public class OrderController extends Controller implements StatusId {


    /**
     * TODO: Possible bug:
     *          Logged in, hit submit order, redirected to page that said I was verified?
     *          Account is not verified.
     *
     * Allows for the viewing of the final page in submitting an order
     * Displays total cost and any associated discounts
     * Allows customer to select payment method - credit/cash
     * Allows customer to select date and time for delivery
     * @return
     */
    public Result getSubmitPage(){
        Customer customer = Customer.findCustomerByUserId(session(AppTags.AppCookie.user_id.toString()));
        if(customer == null)
            return redirect(controllers.User.routes.UserController.login());
        if(!customer.isComplete())
            return redirect(controllers.User.routes.CustomerController.completeRegistration());

        CustomerOrder order = CustomerOrder.findOrderById(session("orderId"));
        return ok(master.render("Finalise Cart",
                masterOrder.render(
                        submitCart.render(order, order.getCustomer()))));
    }

    /**
     * Allows for the viewing of a Customers order history
     * Displays all Customer orders associated with the customer's userId
     * @return
     */
    public Result getHistoryPage() {
        return ok(master.render("Order History",
                masterOrder.render(
                        createdOrders.render(CustomerOrder.findOrderByUserId(session("email"))))));
    }

    /**
     * Allows for the viewing of a CustomerOrder
     * Displays all MealOrders of a CustomerOrder
     * @param orderId of order to be viewed
     * @return
     */
    public Result getViewOrder(String orderId) {
        return ok(master.render("View Order",
                masterOrder.render(
                        viewOrder.render(CustomerOrder.findAllMealsFromOrder(orderId)))));
    }

    public Result removeOrder(String orderId){
        return redirect(controllers.Order.routes.OrderController.getHistoryPage());
    }

    /**
     * Fetches the menu type - Breakfast, Lunch, Dinner, Desert, Snacks - selected by user.
     * Default menu is Breakfast when none are selected.
     * @return
     */
    public Result getMenu(){
        if(flash("menuType") == null){
            return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Breakfast"), 0))));
        }
        switch(flash("menuType")){
            case "0": return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Breakfast"), 0))));
            case "1": return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Lunch"), 1))));
            case "2": return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Dinner"), 2))));
            case "3": return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Desert"), 3))));
            case "4": return ok(master.render("Place Order",
                    masterOrder.render(
                            menu.render(Meal.findMealsByType("Snacks"), 4))));
            default: return badRequest();
        }
    }

    public Result switchMenu(int menuType){
        flash("menuType", String.valueOf(menuType));
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }

    //TODO: (QoL) redirect to switchMenu instead of getMenu with meal type to keep user on same menu
    public Result addMealToOrder(String mealId){
        if(session(AppTags.AppCookie.user_type.toString()) == null)
            return redirect(controllers.User.routes.UserController.login());
        if(session(AppTags.AppCookie.user_type.toString()).equals(AppTags.AppCookie.UserType.CUSTOMER.toString())) {
            CustomerOrder order;
            Customer customer = Customer.findCustomerByUserId(session(AppTags.AppCookie.user_id.toString()));
            if(session("orderId") == null){
                order = new CustomerOrder(customer);
                order.setCustomer(customer);
                order.setStatusId(UNSUBMITTED);

                Payment payment = new Payment();
                order.setPayment(payment);
                order.setCustomer(customer);
                customer.getOrders().add(order);
                customer.save();

                payment.insert();
                order.insert();

                session("orderId", String.valueOf(order.getOrderId()));
                createMealOrder(mealId);
            }
            else{
                order = CustomerOrder.findOrderById(session("orderId"));
                createMealOrder(mealId);
            }
            order.updateCost();
            return redirect(controllers.Order.routes.OrderController.getMenu());
        } else
            return redirect(controllers.User.routes.UserController.login());
    }

    private void createMealOrder(String mealId){
        MealOrder mealOrder = MealOrder.findMealByMealIdAndOrderId(mealId, session("orderId"));
        if(mealOrder == null){
            mealOrder = new MealOrder();
            mealOrder.setMealId(mealId);
            mealOrder.setOrderId(session("orderId"));
            mealOrder.incrementQty();
            mealOrder.save();
        }
        else{
            mealOrder.incrementQty();
            mealOrder.update();
        }
    }

    public Result getAddMealToMenu(){
        return ok(master.render("Add Order", addOrder.render()));
//        if(session("user") == "admin")
//            return ok(master.render("Add Order", addOrder.render()));
//        else
//            return badRequest();
    }

    public Result addMeal(){
        return redirect(controllers.Order.routes.OrderController.getAddMealToMenu());
    }

    /**
     * Remove an order from an order meal order.
     * Removes quantity if more than one is in order
     * @param mealId of order to be removed
     * @return redirect to cart
     */
    public Result removeMealFromOrder(String mealId){
        MealOrder.findMealByMealIdAndOrderId(mealId, session("orderId")).deductQty();
        return redirect(controllers.Order.routes.OrderController.getCart());

    }

    /**
     * Fetches the cart page that display all meal orders associated with the users current order.
     * Can be used to remove orders.
     * Checks if user is logged in and if there is an orderId session.
     * @return cart page if successful or sign up page if user is not logged in.
     */
    //TODO: Add submit order to page.
    public Result getCart(){
        if(session(AppTags.AppCookie.user_type.toString()) == null)
            return redirect(controllers.User.routes.UserController.login());
        if(session(AppTags.AppCookie.user_type.toString()).equals(AppTags.AppCookie.UserType.CUSTOMER.toString())) {
            if (session("orderId") != null)
                return ok(master.render("Cart",
                        masterOrder.render(
                                cart.render(
                                        CustomerOrder.findAllMealsFromOrder(session("orderId")),
                                        CustomerOrder.findOrderById(session("orderId"))))));
            else
                return ok(master.render("Cart",
                        masterOrder.render(
                                cart.render(new ArrayList<>(), null))));
        }
        else
            return redirect(controllers.User.routes.UserController.login());
    }

    /**
     * Submits the current cart for processing
     * Changes order status from "unsubmitted" to "pending"
     * Updates payment entry with discount if customer is student
     * @return
     */
    // TODO: Integrate Customer to subtract balance from order amount.
    public Result submitCart(){
        CustomerOrder order = CustomerOrder.findOrderById(session("orderId"));
        Payment payment = order.getPaymentObject();
        Customer customer = order.getCustomer();

        order.setStatusId(PENDING).update();

        if(customer.isStudent()){
            payment.setAmount(payment.getAmount() - 0.15);
            payment.update();
        }

        String[] result = request().body().asFormUrlEncoded().get("payment");
        switch(result[0].toLowerCase()){
            case "cash":
                payment.setCash(true).setPaid(false);
                break;
            case "credit":
                payment.setCash(false).setPaid(true);
                customer.pay(payment.getAmount());
                customer.update();
                break;
        }


//      OUTPUTS - DATE YYYY/MM/DD
//              - TIME HH:MM
        String[] time = request().body().asFormUrlEncoded().get("time");
        String[] date = request().body().asFormUrlEncoded().get("date");

        try {
            Date datetime = utility.Date.readDateTime(time[0] + date[0]);
            order.setDeliveryDate(datetime);
            System.out.println(datetime.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        payment.update();
        session("orderId", null);
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }
}
