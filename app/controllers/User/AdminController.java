package controllers.User;

import annotations.Routing.AdminOnly;
import annotations.SessionVerifier.LoadOrRedirectToLogin;
import annotations.SessionVerifier.RequiresActive;
import com.fasterxml.jackson.databind.node.ArrayNode;
import controllers.Application.AppTags;
import models.Finance.Discount;
import models.Order.Meal;
import models.User.Admin.*;
import models.User.Customer.Customer;
import models.User.Staff;
import models.User.User;
import models.User.UserProfile;
import play.api.mvc.Call;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import utility.DashboardButton;
import utility.NumberAwareStringComparator;
import views.html.Ordering.viewMeal;
import views.html.User.Admin.*;
import views.html.User.viewCustomer;
import views.html.User.viewStaff;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import static controllers.Application.AppTags.AppCookie.user_id;

public class AdminController extends Controller {

    @Inject
    FormFactory formFactory;
    @Inject
    HttpExecutionContext httpExecutionContext;

    @With(LoadOrRedirectToLogin.class)
    @AdminOnly
    public CompletionStage<Result> index() {
        return CompletableFuture.supplyAsync(() -> {
            double revenue = 0;
            int ordersProcessing = 0;
            int ordersReady = 0;
            int numMeals = 0;

            List<DashboardButton> arrayList = new ArrayList<>();
            arrayList.add(new DashboardButton("R ".concat(String.valueOf(revenue)), "Revenue Today", new Call("#", "#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(numMeals), "Meals Today", new Call("#", "#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(ordersProcessing), "Orders in Kitchen", new Call("#", "#", "#")));
            arrayList.add(new DashboardButton(String.valueOf(ordersReady), "Current Deliveries", new Call("#", "#", "#")));

            AdminInfo adminInfo = new AdminInfo();
            return ok(adminHome.render(arrayList, adminInfo));
        }, httpExecutionContext.current());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public CompletionStage<Result> manageUsers() {
        final List<UserItem> customerList = new ArrayList<>();
        final List<UserItem> kitchenList = new ArrayList<>();
        final List<UserItem> deliveryList = new ArrayList<>();
        return CompletableFuture.runAsync(() -> {
            customerList.addAll(Customer.find.all().stream().map(UserItem::UserCustomer).sorted(UserItem::compare).collect(Collectors.toList()));
            kitchenList.addAll(Staff.find.all().stream().filter(Staff::getKitchenStaffStatus).map(UserItem::UserStaff).sorted(UserItem::compare).collect(Collectors.toList()));
            deliveryList.addAll(Staff.find.all().stream().filter(Staff::getDeliveryStaff).map(UserItem::UserStaff).sorted(UserItem::compare).collect(Collectors.toList()));

        }, httpExecutionContext.current()).thenApply(u -> ok(manageUsers.render(customerList, kitchenList, deliveryList)));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public CompletionStage<Result> manageMeals() {
        final List<MealItem> mealList = new ArrayList<>();
        return CompletableFuture.runAsync(() -> {
            mealList.addAll(Meal.find.all().stream().map(meal -> MealItem.build(meal)).collect(Collectors.toList()));
        }, httpExecutionContext.current()).thenApply(aVoid -> ok(manageMeals.render(mealList)));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result manageDiscounts() {
        List<DiscountItem> discountList = Discount.find.all().stream().map(discount -> DiscountItem.build(discount)).collect(Collectors.toList());
        return ok(manageDiscounts.render(discountList));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result edit() {
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class);
        return ok(editAdminProfile.render(userDetailsForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public CompletionStage<Result> doEdit() {
        Admin admin = Admin.find.byId(session().get(AppTags.AppCookie.user_id.toString()));
        if (admin != null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "An error occurred, changes not saved");
            return CompletableFuture.completedFuture(redirect(controllers.User.routes.KitchenStaffController.index()));
        }
        Form<UserProfile> userDetailsForm = formFactory.form(UserProfile.class).bindFromRequest();
        if (userDetailsForm.hasErrors()) {
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
            } else
                flash(AppTags.FlashCodes.info.toString(), "Password updated!");
        }
        userProfile.save(AppTags.AppCookie.UserType.ADMIN);

        flash(AppTags.FlashCodes.success.toString(), "Admin profile updated!");
        return CompletableFuture.completedFuture(redirect(controllers.User.routes.AdminController.index()));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result getAdminDashUpdate() {
        AdminInfo adminInfo = AdminInfo.GetAdminInfo();
        String s0 = String.format("%s %s", AppTags.Locale.Currency.ZAR.toString(), String.valueOf(adminInfo.getRevenue())),
                s1 = String.valueOf(adminInfo.getNumMealsToday()),
                s2 = String.valueOf(adminInfo.getOrdersInKitchen()),
                s3 = String.valueOf(adminInfo.getCurrentDeliveries());
        ArrayNode arrayNode = DashboardButton.dashbuttonJsonMap(s0, s1, s2, s3);
        return ok(Json.toJson(arrayNode));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result addMeal() {
        Form<Meal> mealForm = formFactory.form(Meal.class);
        Meal meal = null;
        return ok(viewMeal.render(mealForm.fill(meal)));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result addCustomer() {
        Customer customer = new Customer();
        Form<Customer> customerForm = formFactory.form(Customer.class).fill(customer);
        return ok(viewCustomer.render(customerForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result addStaff() {
        Staff staff = new Staff();
        Form<Staff> staffForm = formFactory.form(Staff.class).fill(staff);
        return ok(viewStaff.render(staffForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result editMeal(String mealId) {
        Meal meal = Meal.find.byId(mealId);
        Form<Meal> mealForm = formFactory.form(Meal.class).fill(meal);
        return ok(viewMeal.render(mealForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result editCustomer(String userId) {
        Customer customer = Customer.find.byId(userId);
        Form<Customer> customerForm = formFactory.form(Customer.class).fill(customer);
        return ok(viewCustomer.render(customerForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result editStaff(String userId) {
        Staff staff = Staff.find.byId(userId);
        Form<Staff> staffForm = formFactory.form(Staff.class).fill(staff);
        return ok(viewStaff.render(staffForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result updateMeal() {
        Form<Meal> form = formFactory.form(Meal.class).bindFromRequest();
        if (form.hasErrors()) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Please ensure all form fields are entered!");
            return badRequest(viewMeal.render(form));
        }
        Meal editedMeal = form.get();
        String id = editedMeal.getMealId();
        Meal meal = null;
        if (id != null || !id.isEmpty()){
            meal = Meal.find.byId(id);
        } else  {
            meal = new Meal();
        }
        meal.fill(editedMeal);
        meal.save();
        flash().put(AppTags.FlashCodes.success.toString(), "Discount \'" + meal.getDescription() + "\' updated!");
        return redirect(controllers.User.routes.AdminController.manageMeals());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result updateCustomer() {
        Form<Customer> form = formFactory.form(Customer.class).bindFromRequest();
        if (form.hasErrors()) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Please ensure all form fields are entered!");
            return badRequest(viewCustomer.render(form));
        }
        Customer editedCustomer = form.discardingErrors().get();
        String id = editedCustomer.getUserId();
        Customer customer = null;
        if (id != null && !id.isEmpty()){
            customer = Customer.find.byId(id);
            customer.fill(editedCustomer);
            customer.update();
        } else {
            customer = new Customer();
            customer.generateId();
            customer.init();
            customer.fill(editedCustomer);
            customer.save();
        }
        flash().put(AppTags.FlashCodes.success.toString(), "Customer information updated");
        return redirect(controllers.User.routes.AdminController.manageUsers());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result updateStaff() {
        Form<Staff> form = formFactory.form(Staff.class).bindFromRequest();
        if (form.hasErrors()) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Please ensure all form fields are entered!");
            return badRequest(viewStaff.render(form));
        }
        Staff editedStaff = form.get();
        String id = editedStaff.getUserId();
        Staff staff = null;
        if (id != null && !id.isEmpty()){
            staff = Staff.find.byId(id);
            staff.fill(editedStaff);
            staff.update();
        } else {
            staff = new Staff();
            staff.generateId();
            staff.fill(editedStaff);
            staff.save();
        }
        flash().put(AppTags.FlashCodes.success.toString(), "Staff information updated");
        return redirect(controllers.User.routes.AdminController.manageUsers());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result removeMeal() {
        String mealId = formFactory.form(Meal.class).bindFromRequest().discardingErrors().get().getMealId();
        Meal meal = Meal.find.byId(mealId);
        if (meal == null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Failed to delete meal!");
            return badRequest();
        }
        String mealName = meal.getDescription();
        boolean result = meal.delete();
        if (result) {
            flash().put(AppTags.FlashCodes.success.toString(), "Meal \'" + mealName + "\' deleted!");
        } else {
            flash().put(AppTags.FlashCodes.warning.toString(), "Meal \'" + mealName + "\' could not be deleted!");
        }
        return redirect(controllers.User.routes.AdminController.manageMeals());
    }


    @With(RequiresActive.class)
    @AdminOnly
    public Result removeCustomer() {
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();
        String userId = customerForm.discardingErrors().get().getUserId();
        Customer customer = Customer.find.byId(userId);
        if (customer == null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Failed to delete customer!");
            return badRequest();
        }
        String customerName = customer.getName();
        boolean result = customer.delete();
        if (result) {
            flash().put(AppTags.FlashCodes.success.toString(), "Customer \'" + customerName + "\' deleted!");
        } else {
            flash().put(AppTags.FlashCodes.warning.toString(), "Customer \'" + customerName + "\' could not be deleted!");
        }
        return redirect(controllers.User.routes.AdminController.manageUsers());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result removeStaff() {
        String userId = formFactory.form(Staff.class).bindFromRequest().discardingErrors().get().getUserId();
        Staff staff = Staff.find.byId(userId);
        if (staff == null) {
            flash().put(AppTags.FlashCodes.danger.toString(), "Failed to delete staff member!");
            return badRequest();
        }
        String staffName = staff.getName();
        boolean result = staff.delete();
        if (result) {
            flash().put(AppTags.FlashCodes.success.toString(), "Staff \'" + staffName + "\' deleted!");
        } else {
            flash().put(AppTags.FlashCodes.warning.toString(), "Staff \'" + staffName + "\' could not be deleted!");
        }
        return redirect(controllers.User.routes.AdminController.manageUsers());
    }

    public Result adminJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(AppTags.Routes.AdminJSRoutes.toString(),
                        routes.javascript.AdminController.getAdminDashUpdate(),
                        routes.javascript.AdminController.editMeal(),
                        routes.javascript.AdminController.editCustomer(),
                        routes.javascript.AdminController.editStaff(),
                        routes.javascript.AdminController.removeMeal()
                )
        ).as("text/javascript");
    }
}
