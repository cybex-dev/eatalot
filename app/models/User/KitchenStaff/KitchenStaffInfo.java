package models.User.KitchenStaff;

import models.User.Orders;
import models.User.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class KitchenStaffInfo extends UserInfo{
    public List<Orders> orderList = new ArrayList<>();

    public KitchenStaffInfo(){}

    public KitchenStaffInfo(String userId){
        this.userId = userId;
    }

    public static KitchenStaffInfo GetKitchenStaffInfo(String userId) {
        return null;
    }
}
