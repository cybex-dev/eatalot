package controllers.User;

import annotations.Routing.AdminOnly;
import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import controllers.Application.AppTags;
import models.User.Admin.Admin;
import models.User.Admin.AdminInfo;
import models.User.Customer.CustomerInfo;
import models.User.UserProfile;
import models.ordering.CustomerOrder;
import play.api.mvc.Call;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import utility.DashboardButton;
import annotations.SessionVerifier.*;
import views.html.User.Admin.adminHome;
import views.html.User.Admin.manageDiscounts;
import views.html.User.Admin.manageMeals;
import views.html.User.Admin.manageUsers;
import views.html.User.Admin.editAdminProfile;
import views.html.User.Customer.editProfile;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static controllers.Application.AppTags.AppCookie.user_id;

public class AdminController extends Controller {

    @Inject
    FormFactory formFactory;
    @Inject
    HttpExecutionContext httpExecutionContext;

    @With(LoadOrRedirectToLogin.class)
    @AdminOnly
    public CompletionStage<Result> index(){
        return CompletableFuture.supplyAsync(() -> {
            double revenue = 0;
            int ordersProcessing = 0;
            int ordersReady = 0;
            int numMeals = 0;

            List<DashboardButton> arrayList = new ArrayList<>();
            arrayList.add(new DashboardButton("R ".concat(String.valueOf(revenue)), "Revenue Today", new Call("#" ,"#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(ordersProcessing), "Orders in Kitchen", new Call("#" ,"#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(ordersReady), "Current Deliveries", new Call("#" ,"#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(numMeals), "Meals Today", new Call("#" ,"#", "#")));

            AdminInfo adminInfo = new AdminInfo();
            return ok(adminHome.render(arrayList, adminInfo));
        }, httpExecutionContext.current());
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
            flash().put(AppTags.FlashCodes.danger.toString(), "Missing or incorrect fields");
            return CompletableFuture.completedFuture(badRequest(editAdminProfile.render(userDetailsForm)));
        }

        UserProfile userProfile = userDetailsForm.get();
        userProfile.setConfirmPassword(userDetailsForm.value().get().getConfirmPassword());
        if (!userProfile.passwordsEmpty()) {
            //if passwords are empty, user isn't changing them
            if (!userProfile.getPassword().equals(userProfile.getConfirmPassword())) {
                flash(AppTags.FlashCodes.danger.toString(), "Please check passwords match and are valid");
                return CompletableFuture.completedFuture(badRequest(editAdminProfile.render(userDetailsForm)));
            }
            else
                flash(AppTags.FlashCodes.info.toString(), "Password updated!");
        }
        userProfile.save(AppTags.AppCookie.UserType.ADMIN);

        flash(AppTags.FlashCodes.success.toString(), "Admin profile updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.AdminController.index()));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result getAdminDashUpdate(){
        AdminInfo adminInfo = AdminInfo.GetAdminInfo(session(user_id.toString()));
        String s0 = "",
                s1 = "",
                s2 = "",
                s3 = "";
        Map<String, String> jsonMap = DashboardButton.dashbuttonJsonMap(s0, s1, s2, s3);
        return ok(Json.toJson(jsonMap));
    }

    public Result adminJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(AppTags.Routes.AdminJSRoutes.toString(),
                        routes.javascript.AdminController.getAdminDashUpdate()
                )
        ).as("text/javascript");
    }
}
