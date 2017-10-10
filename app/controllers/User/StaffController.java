package controllers.User;

import annotations.Routing;
import annotations.SessionVerifier;
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

@Routing.StaffOnly
public class StaffController extends Controller {
    @Inject
    FormFactory formFactory;

    /**
     * Should display default customerHome page, showing Staff User's home, with options of loging in or registering
     *
     * @return
     */
    @With(SessionVerifier.LoadOrRedirect.class)
    public Result index() {

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());

        String userId = session().get(user_id);
        UserType userType = UserType.parse(session().get(user_type));
        switch (userType){
            case KITCHEN:{
                KitchenStaffInfo kitchenStaffInfo = KitchenStaffInfo.GetKitchenStaffInfo(userId);
                return ok(kitchenHome.render(arrayList, kitchenStaffInfo));
            }

            case DELIVERY:{
                DeliveryStaffInfo deliveryStaffInfo = DeliveryStaffInfo.GetDeliveryStaffInfo(userId);
                return ok(deliveryHome.render(arrayList, deliveryStaffInfo));
            }
        }
        return forbidden();
    }

}


