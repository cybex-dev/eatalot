package models.User.Admin;

import models.Order.CustomerOrder;
import models.User.Customer.Customer;
import utility.DateInterpreter;
import utility.DateInterpreterStatic;
import utility.StatusId;

import java.util.List;
import java.util.stream.Collectors;

public class AdminInfo {

    private double revenue;
    private int ordersInKitchen, currentDeliveries, numMealsToday;

    public AdminInfo(){}

    public static AdminInfo GetAdminInfo() {
        AdminInfo admin = new AdminInfo();

        List<CustomerOrder> customerOrders = CustomerOrder.find.all().stream().filter(customerOrder1 -> DateInterpreterStatic.isToday(customerOrder1.getDeliveryDate())).collect(Collectors.toList());
        // get today's revenue
        admin.setRevenue(customerOrders.stream().mapToDouble(value -> value.getPaymentObject().getAmount()).sum());

        // get # orders in kitchen preparation
        admin.setOrdersInKitchen(CustomerOrder.findAllProcessingOrders().size());

        // get # current deliveries
        admin.setCurrentDeliveries(Math.toIntExact(CustomerOrder.findAllOrders().stream().filter(customerOrder -> customerOrder.getStatusId().equals(StatusId.DELIVERING)).count()));

        // get total meals today
        admin.setNumMealsToday(customerOrders.size());

        return admin;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getOrdersInKitchen() {
        return ordersInKitchen;
    }

    public void setOrdersInKitchen(int ordersInKitchen) {
        this.ordersInKitchen = ordersInKitchen;
    }

    public int getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(int currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }

    public int getNumMealsToday() {
        return numMealsToday;
    }

    public void setNumMealsToday(int numMealsToday) {
        this.numMealsToday = numMealsToday;
    }
}
