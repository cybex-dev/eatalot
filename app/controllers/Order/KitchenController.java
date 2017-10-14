package controllers.Order;

import controllers.Application.AppTags;
import io.ebeaninternal.server.lib.util.Str;
import models.Order.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Global.Temp.*;
import views.html.Kitchen.*;

import javax.inject.Inject;
import java.util.Objects;

public class KitchenController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index(){
        return ok(kitchenHome.render());
    }

    public Result home(){
        return ok(master.render("Kitchen Home", kitchenHome.render()));
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
                orders.render(CustomerOrder.findAllPendingOrders())));
    }

    public Result getProcessingOrderPage(){
        return ok(master.render("Processing Orders",
                orders.render(CustomerOrder.findAllProcessingOrders())));
    }

    public Result getOrderPage(){
        return ok(master.render("Customer Orders",
                orders.render(CustomerOrder.findAllOrders())));
    }

    public Result getMealOrderPage(String orderId){
        return ok(master.render("Meal Orders",
                mealOrders.render(CustomerOrder.findAllMealsFromOrder(orderId),
                        CustomerOrder.findOrderById(orderId).getStatusId())));
    }

//  ===== Maintain Ingredients =====

    public Result getIngredientPage(){
        return ok(master.render("Ingredients",
                ingredients.render(Ingredient.findAllIngredients())));
    }

    public Result getNewIngredientPage(){
        Form<Ingredient> ingredientForm = formFactory.form(Ingredient.class);
        return ok(master.render("New Ingredient",
                addIngredient.render(ingredientForm)));
    }

    public Result getIngredientOrderPage(String ingredientId){
        return ok(master.render("Order Ingredients",
                orderIngredient.render(Ingredient.findIngredientById(ingredientId))));
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
