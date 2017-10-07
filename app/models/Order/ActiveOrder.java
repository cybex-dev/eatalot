package models.Order;

import java.util.Date;
import java.util.List;

public class ActiveOrder {
    public String orderId;
    public String amount;
    public Date timeOrdered;
    public QueueType queueStatus;
    public List<MealOrderItem> mealOrdersList;
}
