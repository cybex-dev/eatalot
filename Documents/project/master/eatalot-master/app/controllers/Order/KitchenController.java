package controllers.Order;

import models.Order.CustomerOrder;
import models.Order.Ingredient;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Global.Temp.master;
import views.html.Kitchen.*;

import javax.inject.Inject;
import java.util.Objects;

public class KitchenController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index(){
        return TODO;
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
    public Result updateOrderStatus(String orderId){
        String[] result = request().body().asFormUrlEncoded().get("action");
        switch (result[0]){
            case "process":
                CustomerOrder.findOrderById(orderId)
                        .setStatusId("processing")
                        .update();
                break;
            case "deliver":
                CustomerOrder.findOrderById(orderId)
                        .setStatusId("delivering")
                        .update();
                break;
            case "cancel":
                CustomerOrder.findOrderById(orderId)
                        .setStatusId("cancelled")
                        .update();
                break;
            default: return badRequest();
        }
        return redirect(controllers.Order.routes.KitchenController.getOrderPage());
    }

    public Result getPendingOrderPage(){
        return ok(master.render("Pending Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllPendingOrders()), 3)));
    }

    public Result getProcessingOrderPage(){
        return ok(master.render("Processing Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllProcessingOrders()), 4)));
    }

    public Result getOrderPage(){
        return ok(master.render("Customer Orders",
                masterKitchen.render(
                        orders.render(CustomerOrder.findAllOrders()), 2)));
    }

    public Result getMealOrderPage(String orderId){
        return ok(master.render("Meal Orders",
                masterKitchen.render(
                        mealOrders.render(CustomerOrder.findAllMealsFromOrder(orderId),
                        CustomerOrder.findOrderById(orderId).getStatusId()), 1)));
    }

//  ===== Maintain Ingredients =====

    public Result getIngredientPage(){
        return ok(master.render("Ingredients",
                masterKitchen.render(
                ingredients.render(Ingredient.findAllIngredients()), 1)));
    }

    public Result getNewIngredientPage(){
        Form<Ingredient> ingredientForm = formFactory.form(Ingredient.class);
        return ok(master.render("New Ingredient",
                masterKitchen.render(
                addIngredient.render(ingredientForm), 1)));
    }

    public Result getIngredientOrderPage(String ingredientId){
        return ok(master.render("Order Ingredients",
                masterKitchen.render(
                orderIngredient.render(Ingredient.findIngredientById(ingredientId)), 1)));
    }

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
