package models.User.DeliveryStaff;

import models.User.OrderItemDelivery;
import models.User.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class DeliveryStaffInfo extends UserInfo {
    public List<OrderItemDelivery> deliveries = new ArrayList<>();

    public DeliveryStaffInfo(){}

    public DeliveryStaffInfo(String userId) {
        this.userId = userId;
    }

    public static DeliveryStaffInfo GetDeliveryStaffInfo(String userId) {
        return null;
    }
}
