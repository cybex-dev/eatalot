package models.Order;

import models.Finance.Payment;
import utility.DateInterpreterStatic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderScheduleDays {
    public String orderScheduleId;
    public boolean isActive;
    private Map<String, List<CustomerOrderItem>> dayOrder = new HashMap<>();

    public OrderScheduleDays(String orderScheduleId) {
        this.orderScheduleId = orderScheduleId;
        this.isActive = OrderSchedule.find.byId(orderScheduleId).isActive();
        prepareMap();
    }

    private void prepareMap() {
        dayOrder.put("Monday", new ArrayList<>());
        dayOrder.put("Tuesday", new ArrayList<>());
        dayOrder.put("Wednesday", new ArrayList<>());
        dayOrder.put("Thursday", new ArrayList<>());
        dayOrder.put("Friday", new ArrayList<>());
        dayOrder.put("Saturday", new ArrayList<>());
        dayOrder.put("Sunday", new ArrayList<>());

        List<OrderScheduleItem> orderSchedule = OrderScheduleItem.find.query().where().ilike("orderSchedId", orderScheduleId).findList();
        orderSchedule.forEach(orderScheduleItem -> {
            CustomerOrder order = CustomerOrder.find.byId(Long.parseLong(orderScheduleItem.getOrderId()));
            List<MealOrder> mealOrderList = MealOrder.find.query().where().ilike("orderId", orderScheduleItem.getOrderId()).findList();
            final StringBuilder names = new StringBuilder();
            mealOrderList.forEach(mealOrder -> {
                Meal meal = Meal.find.byId(mealOrder.getMealId());
                names.append(meal.getDescription());
            });
            List<CustomerOrderItem> customerOrderItems = dayOrder.get(DateInterpreterStatic.getWeekDayName(order.getDeliveryDate()));
            customerOrderItems.add(new CustomerOrderItem(String.valueOf(order.getOrderId()), order.getDeliveryDate(), names.toString(), String.valueOf(Payment.find.byId(order.getPaymentId()).getAmount())));
        });

    }


    public List<CustomerOrderItem> getMonday(){
        return dayOrder.get("Monday");
    }

    public List<CustomerOrderItem> getTuesday(){
        return dayOrder.get("Tuesday");
    }

    public List<CustomerOrderItem> getWednesday(){
        return dayOrder.get("Wednesday");
    }

    public List<CustomerOrderItem> getThursday(){
        return dayOrder.get("Thursday");
    }

    public List<CustomerOrderItem> getFriday(){
        return dayOrder.get("Friday");
    }

    public List<CustomerOrderItem> getSaturday(){
        return dayOrder.get("Saturday");
    }

    public List<CustomerOrderItem> getSunday(){
        return dayOrder.get("Sunday");
    }
}
