package controllers.User;

import annotations.Routing.DeliveryStaffOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import models.User.UserProfile;
import models.User.UserDetails;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import models.User.Staff;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import utility.DashboardButton;
import views.html.User.Staff.editDeliveryProfile;
import views.html.User.Staff.deliveryHome;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.AppCookie.*;

public class DeliveryStaffController extends Controller {
    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing Staff User's home, with options of loging in or registering
     *
     * @return
     */
    @With(LoadOrRedirect.class)
    @DeliveryStaffOnly
    public Result index() {

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());

        String userId = session().get(user_id);

        DeliveryStaffInfo deliveryStaffInfo = DeliveryStaffInfo.GetDeliveryStaffInfo(userId);
        return ok(deliveryHome.render(arrayList, deliveryStaffInfo));
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
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewWaitingDeliveries() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewCompletedDeliveries() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result viewOrder() {
        return play.mvc.Results.TODO;
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public Result edit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        Map<String, String> userInfoMap = UserDetails.buildMap(staff);
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bind(userInfoMap);
        return ok(editDeliveryProfile.render(userDetailsForm));
    }

    @With(RequiresActive.class)
    @DeliveryStaffOnly
    public CompletionStage<Result> doEdit(){
        Staff staff = Staff.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (!staff.isDeliveryStaff()){
            flash().put(AppTags.FlashCodes.warning.toString(), "You are trying to edit someone else's profile, this will be reported!");
            return CompletableFuture.completedFuture(redirect(controllers.Application.routes.HomeController.forbiddenAccess()));
        }
        if (userDetailsForm.hasErrors()){
            flash().put(AppTags.FlashCodes.warning.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editDeliveryProfile.render(userDetailsForm)));
        }
        UserProfile userDetails = userDetailsForm.get();
        if (!userDetails.getPassword().equals(userDetails.getConfirmPassword())) {
            flash(AppTags.FlashCodes.warning.toString(), "Please check passwords match and are valid");
            return CompletableFuture.completedFuture(badRequest(editDeliveryProfile.render(userDetailsForm)));
        }
        userDetails.save(UserType.DELIVERY);
        flash(AppTags.FlashCodes.success.toString(), "Profile has been updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.DeliveryStaffController.index()));
    }
}


