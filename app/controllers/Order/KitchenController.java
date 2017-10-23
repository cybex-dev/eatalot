package controllers.Order;

import annotations.Routing.KitchenStaffOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import io.ebeaninternal.server.lib.util.Str;
import models.Order.CustomerOrder;
import models.Order.Ingredient;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import utility.StatusId;
import views.html.Global.Temp.master;
import views.html.Kitchen.*;

import javax.inject.Inject;
import java.util.Objects;
import java.util.stream.Collectors;

public class KitchenController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index(){
        return redirect(controllers.Order.routes.KitchenController.home());
    }

    public Result home(){
        // TODO: Add kitchen dashboard to render
        return ok(master.render("Kitchen Home",
                masterKitchen.render(null, 0)));
    }

//  ===== Maintain Orders =====

    /**
     * Updates the status of an order.
     * @param orderId of order to have statusId changed
     * @return redirect to order page
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result updateOrderStatus(String orderId){
        String[] result = request().body().asFormUrlEncoded().get("action");
        switch (result[0]){
            case "process":
                CustomerOrder.findOrderById(orderId)
                        .setProcessing()
                        .update();
                break;
            case "deliver":
                CustomerOrder.findOrderById(orderId)
                        .setDelivering()
                        .update();
                break;
            case "cancel":
                return redirect(routes.KitchenController.getCancelOrderPage(orderId));
            default: return badRequest();
        }
        return redirect(controllers.Order.routes.KitchenController.getOrderPage());
    }


    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getPendingOrderPage(){
        return ok(master.render("Pending Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllPendingOrders().stream().sorted().collect(Collectors.toList())), 3)));
    }

    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getProcessingOrderPage(){
        return ok(master.render("Processing Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllProcessingOrders().stream().sorted().collect(Collectors.toList())), 4)));
    }

    /**
     * Displays list of all orders that are not unsubmitted or cancelled.
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getOrderPage(){
        return ok(master.render("Customer Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllOrders()
                                .stream()
                                .filter(order -> (!order.getStatusId().equals(StatusId.CANCELLED) && !order.getStatusId().equals(StatusId.UNSUBMITTED)))
                                .sorted()
                                .collect(Collectors.toList())),
                        2)));
    }

    /**
     * Returns all meal orders associated with the given orderId
     * @param orderId
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getMealOrderPage(String orderId){
        return ok(master.render("Meal Orders",
                masterKitchen.render(
                        mealOrders.render(CustomerOrder.findAllMealsFromOrder(orderId),
                                CustomerOrder.findOrderById(orderId).getStatusId()), 2)));
    }

    /**
     * Get the page that allows kitchen staff to cancel order
     * Can select and enter reason for order cancellation
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getCancelOrderPage(String orderId){
        return ok(master.render("Cancel Order",
                masterKitchen.render(cancelOrder.render(CustomerOrder.findOrderById(orderId)), 2)));
    }

    /**
     * Sets orders
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result doOrderCancellation(String orderId){
        if(request().body().asFormUrlEncoded().get("action").equals("back"))
            return redirect(routes.KitchenController.getOrderPage());

        CustomerOrder order = CustomerOrder.findOrderById(orderId);

        String[] reason = request().body().asFormUrlEncoded().get("reason");
        String[] explain = request().body().asFormUrlEncoded().get("explain");

        if(reason[0].equals("other")) {
            order.setCancelMessage(explain[0]);
        } else {
            if(explain[0] != null)
                order.setCancelMessage(reason[0] + " - " + explain[0]);
            else
                order.setCancelMessage(reason[0]);
        }

        order.setCancelled();
        order.save();

        return redirect(routes.KitchenController.getOrderPage());
    }

//  ===== Maintain Ingredients =====

    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getIngredientPage(){
        return ok(master.render("Ingredients",
                masterKitchen.render(
                        ingredients.render(Ingredient.findAllIngredients()), 1)));
    }

    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getNewIngredientPage(){
        Form<Ingredient> ingredientForm = formFactory.form(Ingredient.class);
        return ok(master.render("New Ingredient",
                masterKitchen.render(
                        addIngredient.render(ingredientForm), 1)));
    }

    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result getIngredientOrderPage(String ingredientId){
        return ok(master.render("Order Ingredients",
                masterKitchen.render(
                        orderIngredient.render(Ingredient.findIngredientById(ingredientId)), 1)));
    }

    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result addIngredient(){
        Form<Ingredient> ingredientForm = formFactory.form(Ingredient.class).bindFromRequest();
        if (ingredientForm.hasErrors()) return badRequest();

        Ingredient newIngredient = ingredientForm.get();
        newIngredient.insert();
        newIngredient.save();
        return redirect(controllers.Order.routes.KitchenController.getIngredientPage());
    }

    /**
     * Allows the editing of an ingredients quantity ordered.
     * Allows an ingredient to be removed.
     * Edit or delete of ingredient depends on received postAction.
     * @param ingredientId of ingredient to be edited/removed
     * @return redirect to ingredient page
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result editIngredient(String ingredientId){
        String[] postAction = request().body().asFormUrlEncoded().get("action");

        if(postAction.length == 0)
            return badRequest();

        switch (postAction[0]){
            case "edit":
                String[] qty = request().body().asFormUrlEncoded().get("qty");
                if(qty.length == 0 || Objects.equals(qty[0], ""))
                    return badRequest();
                System.out.println(qty[0]);
                Ingredient ingredient = Ingredient.findIngredientById(ingredientId);
                ingredient.updateIngredientQuantity(ingredientId, Integer.parseInt(qty[0]));
                break;
            case "remove":
                Ingredient.findIngredientById(ingredientId).delete();
                break;
        }
        return redirect(controllers.Order.routes.KitchenController.getIngredientPage());
    }
}
