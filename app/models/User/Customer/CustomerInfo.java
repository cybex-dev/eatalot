package models.User.Customer;

import models.Order.CustomerOrder;
import models.Order.OrderSchedule;
import models.Order.OrderScheduleItem;
import models.User.UserInfo;

public class CustomerInfo extends UserInfo {
    private boolean isScheduleActive;
    private String balance;
    private boolean isComplete, isStudent;
    private int activeOrderCount = 0;

    public CustomerInfo(){
        super();
    }

    public CustomerInfo(String userId, String name, String surname, String email, boolean isComplete, Boolean isStudent, String balance, int activeOrderCount, boolean isScheduleActive) {
        super(userId, name, surname, email);
        this.isComplete = isComplete;
        this.isStudent = isStudent;
        this.balance = balance;
        this.activeOrderCount = activeOrderCount;
        this.isScheduleActive = isScheduleActive;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public boolean isScheduleActive() {
        return isScheduleActive;
    }

    public int getActiveOrderCount(String userId) {
        activeOrderCount = Customer.findCustomerByUserId(userId).countActiveOrders();
        return activeOrderCount;
    }

    public static CustomerInfo GetCustomerInfo(String userId){
        Customer customer = Customer.find.byId(userId);
        if (customer == null)
            return null;
        OrderSchedule orderSchedule = customer.getOrderSchedule();
        boolean isActive = false;
        int count = 0;
        if (orderSchedule != null){
            isActive = orderSchedule.isActive();
            count = OrderScheduleItem.find.query().where().ilike("orderSchedId", orderSchedule.getOrderSchedId()).findCount();
        }
        return new CustomerInfo(customer.getUserId(), customer.getName(), customer.getSurname(), customer.getEmail(), customer.isComplete(), customer.getStudent(), customer.getAccBalanceString(), count, isActive);
    }
}
