package controllers.Order;

import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.RequiresActive;
import com.fasterxml.jackson.databind.node.ObjectNode;
import controllers.Application.AppTags;
import controllers.Application.AppTags.Routes;
import models.Order.OrderSchedule;
import models.Order.OrderScheduleDays;
import models.Order.OrderScheduleItem;
import models.User.Customer.Customer;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import views.html.Global.Temp.master;
import views.html.Order.Schedule.create;
import views.html.Order.Schedule.index;
import views.html.Ordering.masterOrder;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ScheduleController extends Controller {

    @Inject
    FormFactory formFactory;
    @Inject
    HttpExecutionContext httpExecutionContext;

    // GET
    @With(RequiresActive.class)
    @CustomersOnly
    public Result index() {
        String userId = session().get(AppTags.AppCookie.user_id.toString());
        Customer customer = Customer.find.byId(userId);
        if (customer == null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "An error occurred, please logout and login again");
            return redirect(controllers.User.routes.CustomerController.index());
        }
        OrderSchedule orderSchedule = customer.getOrderSchedule();
        if (orderSchedule.getTitle() == null){
            return redirect(controllers.Order.routes.ScheduleController.createSchedule());
        }
        OrderScheduleDays orderScheduleDays = new OrderScheduleDays(orderSchedule.getOrderSchedId());

        return ok(index.render(orderSchedule.getTitle(), orderScheduleDays));
    }

    // GET
    @With(RequiresActive.class)
    @CustomersOnly
    public Result createSchedule() {
        Form<OrderSchedule> scheduleForm = formFactory.form(OrderSchedule.class);
        return ok(master.render("Order Schedule", masterOrder.render(create.render(true, scheduleForm))));
//        return ok(create.render(true, scheduleForm));
    }

    // GET
    @With(RequiresActive.class)
    @CustomersOnly
    public Result addOrder() {
        return redirect(controllers.Order.routes.KitchenController.home());
    }

    // GET
    @With(RequiresActive.class)
    @CustomersOnly
    public Result editScheduleName() {
        Map<String, String> map = new HashMap<>();
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        map.put("title", orderSchedule.getTitle());
        Form<OrderSchedule> orderScheduleForm = formFactory.form(OrderSchedule.class).bind(map);
        return ok(create.render(false, orderScheduleForm));
    }

    // PUT
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> updateScheduleName() {
        Form<OrderSchedule> form = formFactory.form(OrderSchedule.class).bindFromRequest();
        if (form.hasGlobalErrors())
            return CompletableFuture.completedFuture(badRequest(create.render(false, form)));
        return updateOrderScheduleName(form.get().getTitle()).thenApplyAsync(updated -> {
            if (updated)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Schedule title updated");
            else
                ctx().flash().put(AppTags.FlashCodes.danger.toString(), "Error updating schedule");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @CustomersOnly
    private CompletionStage<Boolean> updateOrderScheduleName(String title){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        orderSchedule.setTitle(title);
        orderSchedule.update();
        return CompletableFuture.completedFuture(true);
    }

    // POST
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> doCreateSchedule() {
        Form<OrderSchedule> orderScheduleForm = formFactory.form(OrderSchedule.class);
        if (orderScheduleForm.hasErrors()) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Invalid schedule name");
            return CompletableFuture.completedFuture(badRequest(create.render(true, orderScheduleForm)));
        }
        OrderSchedule orderSchedule = orderScheduleForm.get();

        Customer customer = Customer.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        if (customer == null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "An error occurred, please logout and login again");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.CustomerController.index()));
        }
        customer.getOrderSchedule().setTitle(orderSchedule.getTitle());
        flash().put(AppTags.FlashCodes.success.toString(), "Schedule created");
        return CompletableFuture.completedFuture(redirect(controllers.Order.routes.ScheduleController.index()));
    }

    // PUT
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> doAddOrder() {
        return CompletableFuture.completedFuture(play.mvc.Results.TODO);
    }

    // DELETE
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> clearSchedule() {
        String userId = session().get(AppTags.AppCookie.user_id.toString());
        return clearScheduleItems(userId).thenApplyAsync(deleted -> {
            if (deleted)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Schedule cleared");
            else
                ctx().flash().put(AppTags.FlashCodes.danger.toString(), "Error clearing schedule");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @CustomersOnly
    private CompletionStage<Boolean> clearScheduleItems(String userId){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(userId);
        return CompletableFuture.completedFuture(orderSchedule.clearSchedule());
    }

    // DELETE
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> removeOrder(String orderId) {
        return removeOrderFromSchedule(orderId).thenApplyAsync(deleted -> {
            if (deleted)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Order removed");
            else
                ctx().flash().put(AppTags.FlashCodes.danger.toString(), "Error removing order");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @CustomersOnly
    private CompletionStage<Boolean> removeOrderFromSchedule(String orderId){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        if (!orderSchedule.hasScheduledOrders())
            return CompletableFuture.completedFuture(false);
        Optional<OrderScheduleItem> first = orderSchedule.getScheduledOrders().stream().filter(orderScheduleItem -> orderScheduleItem.getOrderId().equals(orderId)).findFirst();
        return first.<CompletionStage<Boolean>>map(orderScheduleItem -> CompletableFuture.completedFuture(orderScheduleItem.delete())).orElseGet(() -> CompletableFuture.completedFuture(false));
    }

    // PUT
    @With(RequiresActive.class)
    @CustomersOnly
    public CompletionStage<Result> setScheduleState(){
        return CompletableFuture.supplyAsync(() -> {
            Http.Session session = session();
            String userId = session.get(AppTags.AppCookie.user_id.toString());
            OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(userId);
            boolean status = !orderSchedule.isActive();
            orderSchedule.setActive(status);
            ObjectNode jsonNodes = Json.newObject();
            jsonNodes.put("status", status ? "true" : "false");
            return ok(jsonNodes);
        }, httpExecutionContext.current());
    }

    public Result scheduleJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(
                        Routes.ScheduleJSRoutes.toString(),
                        routes.javascript.ScheduleController.setScheduleState(),
                        routes.javascript.ScheduleController.removeOrder(),
                        routes.javascript.ScheduleController.addOrder(),
                        routes.javascript.ScheduleController.clearSchedule(),
                        routes.javascript.ScheduleController.createSchedule(),
                        routes.javascript.ScheduleController.editScheduleName(),
                        routes.javascript.ScheduleController.updateScheduleName(),
                        routes.javascript.ScheduleController.doCreateSchedule()
                )
        ).as("text/javascript");
    }

}
