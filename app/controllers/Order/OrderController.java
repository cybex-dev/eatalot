package controllers.Order;

import controllers.Application.AppTags;
import controllers.User.*;
import controllers.User.routes;
import io.ebean.Ebean;
import models.Finance.Payment;
import models.Order.*;
import models.User.Customer.Customer;
import models.User.User;
import org.h2.engine.Session;
import play.mvc.Controller;
import play.mvc.Result;
import utility.DateUtility;
import utility.StatusId;
import views.html.Global.Temp.master;
import views.html.Ordering.*;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

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
     * Allows user to view all orders that are considered active.
     * An active order is anything other than cancelled or complete
     * @return
     */
    public Result getActiveOrders(){
        if(session(AppTags.AppCookie.user_type.toString()) == null)
            return redirect(controllers.User.routes.UserController.login());
        if(session(AppTags.AppCookie.user_type.toString()).equals(AppTags.AppCookie.UserType.CUSTOMER.toString()))
            return ok(master.render("Active Orders",
                masterOrder.render(
                        activeOrders.render(CustomerOrder.findOrderByUserId(session(AppTags.AppCookie.user_id.toString()))
                                .stream().filter(order -> !(order.getStatusId().equals(COMPLETE) || order.getStatusId().equals(CANCELLED)))
                                .collect(Collectors.toList())))));
        else
            return redirect(controllers.User.routes.UserController.login());
    }

    public Result activeOrderAction(String orderId){
        if(session(AppTags.AppCookie.user_type.toString()) == null)
            return redirect(controllers.User.routes.UserController.login());
        if(session(AppTags.AppCookie.user_type.toString()).equals(AppTags.AppCookie.UserType.CUSTOMER.toString())){
            String[] postAction = request().body().asFormUrlEncoded().get("action");

            switch(postAction[0]){
                case "view":
                    // retarded bug from intellij, just ignore it compiles fine
                    return redirect(controllers.Order.routes.OrderController.getViewOrder(orderId));
                case "cancel":
                    CustomerOrder order = CustomerOrder.findOrderById(orderId);
                    assert order != null;
                    order.setCancelled().update();
                    return redirect(controllers.Order.routes.OrderController.getActiveOrders());
            }
            return badRequest();
        }
        else return redirect(controllers.User.routes.UserController.login());

    }

    /**
     * Used by customer for detail view of a CustomerOrder
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
                order.setUnsubmitted();

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
        CustomerOrder order = CustomerOrder.findOrderById(session("orderId"));
        assert order != null;
        order.updateCost();
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
//      OUTPUTS - DATE YYYY/MM/DD
//              - TIME HH:MM
        String[] time = request().body().asFormUrlEncoded().get("time");
        String[] date = request().body().asFormUrlEncoded().get("date");
        String[] result = request().body().asFormUrlEncoded().get("payment");

        if(time == null || date == null || result == null){
            flash("message", "Form invalid");
            return redirect(controllers.Order.routes.OrderController.getSubmitPage());
        }

        if(time[0].equals("") || date[0].equals("") || result[0].equals("")){
            flash("message", "Form invalid");
            return redirect(controllers.Order.routes.OrderController.getSubmitPage());
        }

        try {
            LocalDateTime dateTime = DateUtility.readDateTime(date[0], time[0]);
            if(!DateUtility.verifyDate(dateTime)){
                flash("message", "Please enter a delivery date that is at least 1 hour from now.");
                return redirect(controllers.Order.routes.OrderController.getSubmitPage());
            }
            order.setDeliveryDate(DateUtility.convertToDate(dateTime));
        } catch (ParseException e) {
            e.printStackTrace();
            flash("message", "Invalid date selected");
            return redirect(controllers.Order.routes.OrderController.getSubmitPage());
        }



        Payment payment = order.getPaymentObject();
        Customer customer = order.getCustomer();

        order.setPending().update();

        if(customer.getStudent()){
            payment.setAmount(payment.getAmount() - 0.15);
            payment.update();
        }


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

        payment.update();
        session("orderId", null);
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }
}
