package controllers.User;

import annotations.Routing.DeliveryStaffOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import annotations.SessionVerifier.RequiresActive;
import com.fasterxml.jackson.databind.node.ArrayNode;
import controllers.Application.AppTags;
import models.Order.CustomerOrder;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import models.User.Staff;
import models.User.UserProfile;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import utility.DashboardButton;
import views.html.Global.Temp.master;
import views.html.User.Staff.deliveryHome;
import views.html.User.Staff.editDeliveryProfile;
import views.html.Delivery.*;
import utility.StatusId;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static controllers.Application.AppTags.AppCookie.UserType;
import static controllers.Application.AppTags.AppCookie.user_id;

public class DeliveryStaffController extends Controller implements StatusId{
    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing Staff User's home, with options of loging in or registering
     *
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @DeliveryStaffOnly
    public Result index() {

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());

        String userId = session().get(user_id);

        DeliveryStaffInfo deliveryStaffInfo = DeliveryStaffInfo.GetDeliveryStaffInfo(userId);
//        return ok(deliveryHome.render(arrayList, deliveryStaffInfo));
        return redirect(routes.DeliveryStaffController.viewActiveDeliveries());
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result deliverOrder() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result checkoutOrder() {
        return play.mvc.Results.TODO;
    }

    /**
     * Is an extension of dashboard overview with more indepth info of deliveries
     * @return
     */
    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewActiveDeliveries() {
        List<CustomerOrder> list = CustomerOrder
                .findAllOrders()
                .stream()
                .filter(customerOrder -> customerOrder.getStatusId().equals(DELIVERING))
                .sorted()
                .collect(Collectors.toList());
        return ok(master.render("Orders", deliveryMaster.render(orders.render(list), 1)));
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewWaitingDeliveries() {
        return redirect(routes.DeliveryStaffController.viewActiveDeliveries());
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewCompletedDeliveries() {
        List<CustomerOrder> list = CustomerOrder
                .findAllOrders()
                .stream()
                .filter(customerOrder -> customerOrder.getStatusId().equals(COMPLETE))
                .collect(Collectors.toList());
        return ok(master.render("Orders", deliveryMaster.render(orders.render(list), 2)));

    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewOrder(String orderId) {
        return ok(master.render("Order Details", deliveryMaster
                .render(mealOrders.render(CustomerOrder.findAllMealsFromOrder(orderId),
                        CustomerOrder.findOrderById(orderId).getStatusId()), 1)));
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result updateOrderStatus(String orderId){
        CustomerOrder order = CustomerOrder.findOrderById(orderId);
        String[] result =     request().body().asFormUrlEncoded().get("action");

        switch (result[0]){
            case "complete":
                order.setComplete().update();
                order.getPaymentObject().setPaid(true);
                order.getPaymentObject().update();
                break;
            case "completebroke":
                order.setComplete().update();
                order.getPaymentObject().setPaid(false);
                order.getPaymentObject().update();
                break;
            case "cancel":
                return redirect(routes.DeliveryStaffController.getCancelPage(orderId));
        }
        return redirect(routes.DeliveryStaffController.viewActiveDeliveries());
    }

    public Result getCancelPage(String orderId){
        return ok(master.render("Cancel Order", deliveryMaster.render(cancelOrder.render(CustomerOrder.findOrderById(orderId)), 1)));
    }

    public Result doOrderCancellation(String orderId){
        CustomerOrder order = CustomerOrder.findOrderById(orderId);
        order.setCancelled().update();
        return redirect(routes.DeliveryStaffController.viewActiveDeliveries());
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result edit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        Map<String, String> userInfoMap = UserProfile.buildMap(staff);
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bind(userInfoMap);
        return ok(editDeliveryProfile.render(userDetailsForm));
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public CompletionStage<Result> doEdit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (!staff.getDeliveryStaff()){
            flash().put(AppTags.FlashCodes.danger.toString(), "You are trying to edit someone else's profile, this will be reported!");
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
        }
        if (userDetailsForm.hasErrors()){
            flash().put(AppTags.FlashCodes.danger.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editDeliveryProfile.render(userDetailsForm)));
        }
        UserProfile userProfile = userDetailsForm.get();
        userProfile.setConfirmPassword(userDetailsForm.value().get().getConfirmPassword());
        if (!userProfile.passwordsEmpty()) {
            //if passwords are empty, user isn't changing them
            String password = userProfile.getPassword(),
                    confirmPassword = userProfile.getConfirmPassword();
            if (!password.equals(confirmPassword)) {
                //passswords do not match, notify
                flash(AppTags.FlashCodes.danger.toString(), "Please check passwords match and are valid");
                return CompletableFuture.completedFuture(badRequest(editDeliveryProfile.render(userDetailsForm)));
            }
            else {
                flash(AppTags.FlashCodes.info.toString(), "Password updated!");
            }
        }
        if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
            flash(AppTags.FlashCodes.danger.toString(), "Please check passwords match and are valid");
            return CompletableFuture.completedFuture(badRequest(editDeliveryProfile.render(userDetailsForm)));
        }
        userProfile.save(UserType.DELIVERY);
        flash(AppTags.FlashCodes.success.toString(), "Profile has been updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.DeliveryStaffController.index()));
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result getDeliveryDashUpdate(){
        DeliveryStaffInfo deliveryStaffInfo = DeliveryStaffInfo.GetDeliveryStaffInfo(session(user_id.toString()));
        String s0 = "",
                s1 = "",
                s2 = "",
                s3 = "";
        ArrayNode arrayNode = DashboardButton.dashbuttonJsonMap(s0, s1, s2, s3);
        return ok(Json.toJson(arrayNode));
    }

    public Result deliveryJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(AppTags.Routes.DeliveryJSRoutes.toString(),
                        routes.javascript.DeliveryStaffController.getDeliveryDashUpdate()
                )
        ).as("text/javascript");
    }
}


