package controllers.User;

import annotations.Routing.KitchenStaffOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import models.User.UserProfile;
import models.User.KitchenStaff.KitchenStaffInfo;
import models.User.Staff;
import models.User.UserDetails;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import utility.DashboardButton;
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
    @With(LoadOrRedirect.class)
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
        Map<String, String> userInfoMap = UserDetails.buildMap(staff);
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
            flash().put(AppTags.FlashCodes.warning.toString(), "You are trying to edit someone else's profile, this will be reported!");
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
        }
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (userDetailsForm.hasErrors()){
            flash().put(AppTags.FlashCodes.warning.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editKitchenProfile.render(userDetailsForm)));
        }
        UserProfile userDetails = userDetailsForm.get();
        if (!userDetails.getPassword().equals(userDetails.getConfirmPassword())) {
            flash(AppTags.FlashCodes.warning.toString(), "Please check passwords match and are valid");
            return CompletableFuture.completedFuture(badRequest(editKitchenProfile.render(userDetailsForm)));
        }
        userDetails.save(AppTags.AppCookie.UserType.KITCHEN);
        flash(AppTags.FlashCodes.success.toString(), "Profile has been updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
    }

}



