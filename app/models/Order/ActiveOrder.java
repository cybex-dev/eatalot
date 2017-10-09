package models.Order;

import utility.DateInterpreter;

import java.util.Date;
import java.util.List;

public class ActiveOrder extends DateInterpreter{
    public String orderId;
    public String amount;
    public Date timeOrdered;
    public String queueStatus;
    public List<MealOrderItem> mealOrdersList;

    public ActiveOrder(String orderId, String amount, Date timeOrdered, String queueStatus, List<MealOrderItem> mealOrdersList) {
        super(timeOrdered);
        this.orderId = orderId;
        this.amount = amount;
        this.queueStatus = queueStatus;
        this.mealOrdersList = mealOrdersList;
    }
}
