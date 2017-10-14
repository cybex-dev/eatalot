package controllers.User;

import annotations.Routing.AdminOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import controllers.Application.AppTags;
import models.User.Admin.Admin;
import models.User.Admin.AdminInfo;
import models.User.UserProfile;
import models.User.UserDetails;
import play.api.mvc.Call;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import utility.DashboardButton;
import annotations.SessionVerifier.*;
import views.html.User.Admin.manageDiscounts;
import views.html.User.Admin.manageMeals;
import views.html.User.Admin.manageUsers;
import views.html.User.Admin.editAdminProfile;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class AdminController extends Controller {

    @Inject
    FormFactory formFactory;

    @With(LoadOrRedirect.class)
    @AdminOnly
    public Result index(){
        Http.Session session = session();
        //flash().put(AppTags.FlashCodes.info.toString(), "Admin page still needs implementation");

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton("", "Orders Ready", new Call("#" ,"#", "#")));
        arrayList.add(new DashboardButton("", "Current Deliveries", new Call("#" ,"#", "#")));
        arrayList.add(new DashboardButton("R ", "Revenue Today", new Call("#" ,"#", "#")));
        arrayList.add(new DashboardButton("", "Meals Today", new Call("#" ,"#", "#")));

        AdminInfo adminInfo = new AdminInfo();

        return ok(views.html.User.Admin.adminHome.render(arrayList, adminInfo));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result manageUsers(){
        return ok(manageUsers.render());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result manageMeals(){
        return ok(manageMeals.render());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result manageDiscounts(){
        return ok(manageDiscounts.render());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result edit(){
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class);
        return ok(editAdminProfile.render(userDetailsForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public CompletionStage<Result> doEdit(){
        Admin admin = Admin.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        if (admin != null){
            flash().put(AppTags.FlashCodes.danger.toString(), "An error occurred, changes not saved");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
        }
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (userDetailsForm.hasErrors()){
            flash().put(AppTags.FlashCodes.warning.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editAdminProfile.render(userDetailsForm)));
        }
        UserProfile userDetails = userDetailsForm.get();
        if (!userDetails.getPassword().equals(userDetails.getConfirmPassword())) {
            flash(AppTags.FlashCodes.warning.toString(), "Please check passwords match and are valid");
            return CompletableFuture.completedFuture(badRequest(editAdminProfile.render(userDetailsForm)));
        }
        userDetails.save(AppTags.AppCookie.UserType.ADMIN);
        flash(AppTags.FlashCodes.success.toString(), "Admin profile updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.AdminController.index()));
    }
}
