package models.Order;

import utility.DateInterpreter;

import java.util.Date;
import java.util.List;

public class ActiveOrder extends DateInterpreter{
    public String orderId;
    public String amount;
    public String queueStatus;
    public Integer queuePosition;
    public List<MealOrderItem> mealOrdersList;

    public ActiveOrder(String orderId, String amount, Date deliveryTime, String queueStatus, Integer queuePosition, List<MealOrderItem> mealOrdersList) {
        super(deliveryTime);
        this.orderId = orderId;
        this.queuePosition = queuePosition;
        this.amount = amount;
        this.queueStatus = queueStatus;
        this.mealOrdersList = mealOrdersList;
    }
}
