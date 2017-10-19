package models.Order;

import models.Finance.Payment;
import models.User.KitchenStaff.StaffOrderInteraction;
import models.User.Staff;

import java.util.Date;
import java.util.List;

public class OrderItemDetail {
    public String orderId;
    public Date dateOrdered;
    public Double amount;
    public List<MealOrderItem> mealOrders;
    public Boolean isScheduleOrder;
    public Payment payment;
    public String status;
    public String delivererName;

    public OrderItemDetail(String orderId, Date dateOrdered, Double amount, List<MealOrderItem> mealOrders, Boolean isScheduleOrder, Payment payment, String status) {
        this.orderId = orderId;
        this.dateOrdered = dateOrdered;
        this.amount = (amount != null)
                ? payment.getAmount()
                : amount;
        this.mealOrders = mealOrders;
        this.isScheduleOrder = isScheduleOrder;
        this.payment = payment;
        this.status = status;

        delivererName = getDelivererName();

    }

    public String getDelivererName() {
        String name = "Not Found";
        List<StaffOrderInteraction> orderStaff = StaffOrderInteraction.find.query().where().ilike("orderId", orderId).findList();
        StaffOrderInteraction staffOrderInteraction1 = orderStaff.stream().filter(staffOrderInteraction -> Staff.find.byId(staffOrderInteraction.getStaffId()).isDeliveryStaff()).findFirst().orElse(null);
        if (staffOrderInteraction1 != null) {
            Staff staff = Staff.find.byId(staffOrderInteraction1.getStaffId());
            name = staff.getName().concat(" ").concat(staff.getSurname());
        }
        return name;
    }
}
