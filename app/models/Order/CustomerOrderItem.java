package models.Order;

import utility.DateInterpreter;

import java.util.Date;

public class CustomerOrderItem extends DateInterpreter{
    public String orderId;
    public String description;
    public String amount;

    public CustomerOrderItem(String orderId, Date deliveryDate, String description, String amount) {
        super(deliveryDate);
        this.orderId = orderId;
        this.description = description;
        this.amount = amount;
    }
}
