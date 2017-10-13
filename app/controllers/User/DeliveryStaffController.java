package controllers.User;

import annotations.Routing.DeliveryStaffOnly;
import annotations.SessionVerifier.LoadActive;
import annotations.SessionVerifier.LoadOrRedirect;
import annotations.Routing.StaffOnly;
import annotations.SessionVerifier.RequiresActive;
import models.User.DeliveryStaff.DeliveryStaffInfo;
import models.User.KitchenStaff.KitchenStaffInfo;
import play.data.FormFactory;
import play.mvc.*;
import utility.DashboardButton;
import views.html.User.Staff.deliveryHome;
import views.html.User.Staff.kitchenHome;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;

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
}


