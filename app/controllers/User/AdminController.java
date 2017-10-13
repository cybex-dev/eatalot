package controllers.User;

import annotations.Requires;
import annotations.Routing.AdminOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import controllers.Application.AppTags;
import models.User.Admin.AdminInfo;
import play.api.mvc.Call;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import utility.DashboardButton;
import annotations.SessionVerifier.*;
import views.html.User.Admin.manageDiscounts;
import views.html.User.Admin.manageMeals;
import views.html.User.Admin.manageUsers;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class AdminController extends Controller {

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
}
