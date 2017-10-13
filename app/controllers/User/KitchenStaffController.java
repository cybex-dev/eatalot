package controllers.User;

import annotations.Routing.KitchenStaffOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.SessionVerifier.RequiresActive;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import models.User.KitchenStaff.KitchenStaffInfo;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import utility.DashboardButton;
import views.html.User.Staff.deliveryHome;
import views.html.User.Staff.kitchenHome;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

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

}



