package controllers.User;

import annotations.Routing.AdminOnly;
import annotations.Routing.KitchenStaffOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import models.User.KitchenStaff.KitchenStaffInfo;
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
import views.html.User.Staff.editDeliveryProfile;
import views.html.User.Staff.editKitchenProfile;
import views.html.User.Staff.kitchenHome;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.AppCookie.user_id;

public class KitchenStaffController extends Controller {
    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing Staff User's home, with options of loging in or registering
     *
     * @return
     */
    @With(LoadOrRedirectToLogin.class)
    @KitchenStaffOnly
    public Result index() {

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());

        String userId = session().get(user_id);

        KitchenStaffInfo kitchenStaffInfo = KitchenStaffInfo.GetKitchenStaffInfo(userId);
        return ok(kitchenHome.render(arrayList, kitchenStaffInfo));
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public Result viewOrder() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public Result viewActiveOrders() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public Result viewQueuedOrders() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public Result viewCompletedOrders() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public Result edit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        Map<String, String> userInfoMap = UserProfile.buildMap(staff);
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bind(userInfoMap);
        return ok(editKitchenProfile.render(userDetailsForm));
    }

    @With(RequiresActive.class)
    @KitchenStaffOnly
    public CompletionStage<Result> doEdit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        if (staff != null){
            flash().put(AppTags.FlashCodes.danger.toString(), "An error occurred, changes not saved");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
        }

        if (!staff.isDeliveryStaff()){
            flash().put(AppTags.FlashCodes.danger.toString(), "You are trying to edit someone else's profile, this will be reported!");
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
        }
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (userDetailsForm.hasErrors()){
            flash().put(AppTags.FlashCodes.danger.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editKitchenProfile.render(userDetailsForm)));
        }
        UserProfile userProfile = userDetailsForm.get();
        userProfile.setConfirmPassword(userDetailsForm.value().get().getConfirmPassword());
        if (!userProfile.passwordsEmpty()) {
            if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
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
        userProfile.save(AppTags.AppCookie.UserType.KITCHEN);
        flash(AppTags.FlashCodes.success.toString(), "Profile has been updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result getKitchenDashUpdate() {
        KitchenStaffInfo kitchenStaffInfo = KitchenStaffInfo.GetKitchenStaffInfo(session(user_id.toString()));
        String s0 = "",
                s1 = "",
                s2 = "",
                s3 = "";
        Map<String, String> jsonMap = DashboardButton.dashbuttonJsonMap(s0, s1, s2, s3);
        return ok(Json.toJson(jsonMap));
    }

    public Result kitchenJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(AppTags.Routes.KitchenJSRoutes.toString(),
                        routes.javascript.KitchenStaffController.getKitchenDashUpdate()
                )
        ).as("text/javascript");
    }
}



