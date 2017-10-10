package controllers.Order;

import annotations.Routing;
import annotations.SessionVerifier;
import controllers.Application.AppTags;
import controllers.Application.routes;
import models.Order.OrderSchedule;
import models.Order.OrderScheduleItem;
import play.data.Form;
import play.data.FormFactory;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;

import play.mvc.With;
import router.Routes;
import views.html.Order.Schedule.create;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@With(SessionVerifier.RequiresActive.class)
@Routing.CustomersOnly
@RequireCSRFCheck
public class ScheduleController extends Controller {

    @Inject
    FormFactory formFactory;
    @Inject
    HttpExecutionContext httpExecutionContext;

    // GET
    public Result index() {
        return play.mvc.Results.TODO;
    }

    // GET

    public Result createSchedule() {
        Form<OrderSchedule> scheduleForm = formFactory.form(OrderSchedule.class);
        return ok(create.render(scheduleForm));
    }

    // GET
    public Result addOrder() {
        return play.mvc.Results.TODO;
    }

    // GET
    public Result editScheduleName() {
        Map<String, String> map = new HashMap<>();
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        map.put("title", orderSchedule.getTitle());
        Form<OrderSchedule> orderScheduleForm = formFactory.form(OrderSchedule.class).bind(map);
        return ok(create.render(orderScheduleForm));
    }

    // PUT
    public CompletionStage<Result> updateScheduleName() {
        Form<OrderSchedule> form = formFactory.form(OrderSchedule.class).bindFromRequest();
        if (form.hasGlobalErrors())
            return CompletableFuture.completedFuture(badRequest(create.render(form)));
        return updateOrderScheduleName(form.get().getTitle()).thenApplyAsync(updated -> {
            if (updated)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Schedule title");
            else
                ctx().flash().put(AppTags.FlashCodes.warning.toString(), "Error updating schedule");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    private CompletionStage<Boolean> updateOrderScheduleName(String title){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        orderSchedule.setTitle(title);
        orderSchedule.update();
        return CompletableFuture.completedFuture(true);
    }

    // POST
    public CompletionStage<Result> doCreateSchedule() {
        Form<OrderSchedule> orderScheduleForm = formFactory.form(OrderSchedule.class);
        if (orderScheduleForm.hasGlobalErrors()) {
            flash().put(AppTags.FlashCodes.warning.toString(), "Invalid schedule name");
            return CompletableFuture.completedFuture(badRequest(create.render(orderScheduleForm)));
        }

        OrderSchedule orderSchedule = orderScheduleForm.get();
        String userId = session().get(AppTags.AppCookie.user_id.toString());
        if (!orderSchedule.getUserId().equals(userId)){
            session().clear();
            response().cookies().clear();
            flash().put(AppTags.FlashCodes.warning.toString(), "Invalid session, please login again");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.UserController.login()));
        }
        orderSchedule.save();
        return CompletableFuture.completedFuture(redirect(controllers.Order.routes.ScheduleController.index()));
    }

    // PUT
    public CompletionStage<Result> doAddOrder() {
        return CompletableFuture.completedFuture(play.mvc.Results.TODO);
    }

    // DELETE
    public CompletionStage<Result> clearSchedule() {
        String userId = session().get(AppTags.AppCookie.user_id.toString());
        return clearScheduleItems(userId).thenApplyAsync(deleted -> {
            if (deleted)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Schedule cleared");
            else
                ctx().flash().put(AppTags.FlashCodes.warning.toString(), "Error clearing schedule");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    private CompletionStage<Boolean> clearScheduleItems(String userId){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(userId);
        return CompletableFuture.completedFuture(orderSchedule.clearSchedule());
    }

    // DELETE
    public CompletionStage<Result> removeOrder(String orderId) {
        return removeOrderFromSchedule(orderId).thenApplyAsync(deleted -> {
            if (deleted)
                ctx().flash().put(AppTags.FlashCodes.success.toString(), "Order removed");
            else
                ctx().flash().put(AppTags.FlashCodes.warning.toString(), "Error removing order");
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    private CompletionStage<Boolean> removeOrderFromSchedule(String orderId){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(session().get(AppTags.AppCookie.user_id.toString()));
        if (!orderSchedule.hasScheduledOrders())
            return CompletableFuture.completedFuture(false);
        Optional<OrderScheduleItem> first = orderSchedule.getScheduledOrders().stream().filter(orderScheduleItem -> orderScheduleItem.getOrderId().equals(orderId)).findFirst();
        return first.<CompletionStage<Boolean>>map(orderScheduleItem -> CompletableFuture.completedFuture(orderScheduleItem.delete())).orElseGet(() -> CompletableFuture.completedFuture(false));
    }

    // PUT
    public CompletionStage<Result> setScheduleState(){
        return changeScheduleStatus(session().get(AppTags.AppCookie.user_id.toString())).thenApplyAsync(aBoolean -> {
            if (aBoolean){
                flash().put(AppTags.FlashCodes.success.toString(), "Schedule enabled");
            } else {
                flash().put(AppTags.FlashCodes.warning.toString(), "Schedule disabled");
            }
            return redirect(controllers.Order.routes.ScheduleController.index());
        }, httpExecutionContext.current());
    }

    private CompletionStage<Boolean> changeScheduleStatus(String userId){
        OrderSchedule orderSchedule = OrderSchedule.getOrderScheduleByUserId(userId);
        boolean status = !orderSchedule.isActive();
        orderSchedule.setActive(status);
        return CompletableFuture.completedFuture(status);
    }

//    public static Result javascriptRoutes() {
//        response().setContentType("text/javascript");
//        return ok(
//                Routes.javascriptRouter("jsRoutes",
//                        // Routes
//                        controllers.Order.routes.javascript.ScheduleController.removeOrder("")
//                )
//        );
//    }
}
