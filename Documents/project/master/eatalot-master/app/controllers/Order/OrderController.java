package controllers.Order;

import controllers.Application.AppTags;
import controllers.User.*;
import io.ebean.Ebean;
import models.Finance.Payment;
import models.Order.*;
import models.User.Customer.Customer;
import play.mvc.Controller;
import play.mvc.Result;
import scala.App;
import utility.StatusId;
import views.html.Global.Temp.master;
import views.html.Ordering.*;

import java.util.ArrayList;

/**
 * Created by dylan on 2017/07/18.
 * Manages orders
 */
public class OrderController extends Controller implements StatusId {


    public Result getSubmitPage(){
        //TODO: Uncomment once Customer is integrated
        return ok(master.render("Finalise Cart",
                submitCart.render(
                        CustomerOrder.findOrderById(session("orderId")),
                        Customer.findCustomerByEmail(session("email")))));
//        Customer customer = new Customer();
//        customer.setStudent(true);

//        return ok(master.render("Finalise Cart",
//                submitCart.render(
//                        CustomerOrder.findOrderById(session("orderId")),
//                        customer)));

    }

    public Result getHistoryPage() {
        return ok(master.render("Order History",
                createdOrders.render(CustomerOrder.findOrderByUserId(session("email")))));
    }

    public Result getViewOrder(String orderId) {
        return ok(master.render("View Order",
                viewOrder.render(CustomerOrder.findAllMealsFromOrder(orderId))));
    }

    public Result removeOrder(String orderId){
        return redirect(controllers.Order.routes.OrderController.getHistoryPage());
    }

    public Result getMenu(){
        // Uncomment and comment to add data after evolutions
//        addData();
        if(flash("menuType") == null){
            return ok(master.render("Place Order", menu.render(Meal.findMealsByType("Breakfast"), 0)));
        }
        switch(flash("menuType")){
            case "0": return ok(master.render("Place Order", menu.render(Meal.findMealsByType("Breakfast"), 0)));
            case "1": return ok(master.render("Place Order", menu.render(Meal.findMealsByType("Lunch"), 1)));
            case "2": return ok(master.render("Place Order", menu.render(Meal.findMealsByType("Dinner"), 2)));
            default: return badRequest();
        }
    }

    public Result switchMenu(int menuType){
        flash("menuType", String.valueOf(menuType));
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }

    //TODO: (QoL) redirect to switchMenu instead of getMenu with meal type to keep user on same menu
    public Result addMealToOrder(String mealId){
        if(session(AppTags.AppCookie.user_type.toString()).equals(AppTags.AppCookie.UserType.CUSTOMER.toString())) {
            CustomerOrder order;
            Customer customer = Customer.findCustomerByUserId(session(AppTags.AppCookie.user_id.toString()));
            if(session("orderId") == null){
                order = new CustomerOrder();
                order.setUserId(session(AppTags.AppCookie.user_id.toString()));
                order.setStatusId(UNSUBMITTED);

                Payment payment = new Payment(order.getOrderId());
                order.setPaymentId(payment.getPaymentId());
                order.setUserId(customer.getUserId());
                payment.setCustomerUserId(customer.getUserId());

                customer.getOrders().add(order);
                customer.getPayments().add(payment);

                Ebean.save(customer);

                Ebean.save(payment);
                Ebean.save(order);

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
        if(AccountController.isCustomer())
            if(session("orderId") != null)
                return ok(master.render("Cart",
                        cart.render(
                                CustomerOrder.findAllMealsFromOrder(session("orderId")),
                                CustomerOrder.findOrderById(session("orderId")))));
            else
                return ok(master.render("Cart", cart.render(new ArrayList<>(), null)));
        else
            return redirect(controllers.Order.routes.AccountController.getSignUp());
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
        Customer customer = Customer.findCustomerByEmail(session("email"));

        order.setStatusId(PENDING).update();

        // ===== UNCOMMENT ONCE CUSTOMER IS INTEGRATED =====
//        if(customer.isStudent()){
//            payment.setAmount(payment.getAmount() - 0.15);
//            payment.update();
//        }

        String[] result = request().body().asFormUrlEncoded().get("payment");
        switch(result[0].toLowerCase()){
            case "cash":
                payment.setCash(true);
                break;
            case "credit":
                payment.setCash(false);
                // UNCOMMENT HERE WHEN INTEGRATED
//                customer.pay(payment.getAmount());
//                customer.update();
                break;
        }


//      OUTPUTS - DATE YYYY/MM/DD
//              - TIME HH:MM
        String[] time = request().body().asFormUrlEncoded().get("time");
        String[] date = request().body().asFormUrlEncoded().get("date");

//        System.out.println("=====HERE====    " + time[0]);

//        try {
        payment.setDate(date[0]);
        payment.setTime(time[0]);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println("$$ ERROR: INVALID DATE FORMAT");
//        }

        payment.update();
        session("orderId", null);
        return redirect(controllers.Order.routes.OrderController.getMenu());
    }

    /**
     * Method to add simulation data to database.
     * Ingredient, Recipe Ingredient, Recipe and Meal.
     * Recipe ids can determine meal type (B, L, D) - Breakfast, Lunch, Dinner.
     * Re-run whenever database undergoes evolution and tables are dropped.
     */
    // TODO: Add more data
    private void addData(){
        // Ingredient 1
        Ingredient ingredient1 = new Ingredient("1", "Bread", 5);
        ingredient1.save();

        // Recipe Ingredient 1
        RecipeIngredients recipeIngredients1 = new RecipeIngredients("L1", "1", 5);
        recipeIngredients1.save();

        // Recipe 1
        Recipe recipe1 = new Recipe("R1", 1, 10);
        recipe1.save();

        // Meal 1
        Meal meal1 = new Meal("L1", "R1", "Burger and chips", "Lunch", 50, "burger.png");
        meal1.save();


        // Ingredient 2
        Ingredient ingredient2 = new Ingredient("2", "Chicken", 20);
        ingredient2.save();

        // Recipe Ingredient 2
        RecipeIngredients recipeIngredients2 = new RecipeIngredients("Lw", "w", 12);
        recipeIngredients2.save();

        // Recipe 2
        Recipe recipe2 = new Recipe("R2", 3, 14);
        recipe2.save();

        // Meal 2
        Meal meal2 = new Meal("L2", "R2", "Fried Chicken Wrap", "Dinner", 150, "pancakes.png");
        meal2.save();

    }
}
