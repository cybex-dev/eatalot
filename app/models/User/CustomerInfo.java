package models.User;

import java.util.logging.Logger;

public class CustomerInfo {
    private boolean isScheduleActive;
    private String userId;
    private String name, surname, balance;
    private boolean isComplete, isStudent;
    private int activeOrderCount = 0;

    public CustomerInfo(){}

    public CustomerInfo(String userId, String name, String surname, boolean isComplete, Boolean isStudent, String balance, int activeOrderCount, boolean isScheduleActive) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
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

    public static CustomerInfo fill(String uId) {
        try {
            Customer customer = Customer.find.byId(uId);
            // TODO: 2017/10/07 fix this below
            return new CustomerInfo(uId, customer.getName(), customer.getSurname(), customer.isComplete(), customer.isStudent(), String.valueOf(customer.getBalance()), 0 , false);
        }
        catch (Exception x){
            Logger.getGlobal().info("Failed to acquire session info of user \'"+ uId + "\'\n" + x.toString());
            return null;
        }
    }

    public boolean isScheduleActive() {
        return isScheduleActive;
    }

    public int getActiveOrderCount() {
        return activeOrderCount;
    }
}
