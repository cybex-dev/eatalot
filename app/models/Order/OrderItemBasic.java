package models.Order;

import models.ordering.Meal;
import utility.DateInterpreter;

import java.util.Date;

public class OrderItemBasic extends DateInterpreter {
    public String orderId;
    public Double amount;
    public String mealNames;
    public String status;

    public OrderItemBasic(String orderId, Date dateOrdered, Double amount, String mealNames, String status) {
        super(dateOrdered);
        this.orderId = orderId;
        this.amount = amount;
        this.mealNames = mealNames;
        this.status = status;
    }
}


