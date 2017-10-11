package controllers.User;

import annotations.Routing.AdminOnly;
import annotations.SessionVerifier.LoadOrRedirect;
import controllers.Application.AppTags;
import models.User.Admin.AdminInfo;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import utility.DashboardButton;

import java.util.ArrayList;
import java.util.List;

@AdminOnly
public class AdminController extends Controller {

    @With(LoadOrRedirect.class)
    public Result index(){
        flash().put(AppTags.FlashCodes.info.toString(), "Admin page still needs implementation");

        List<DashboardButton> arrayList = new ArrayList<>();
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());
        arrayList.add(new DashboardButton());

        AdminInfo adminInfo = new AdminInfo();

        return ok(views.html.User.Admin.adminHome.render(arrayList, adminInfo));
    }
}
