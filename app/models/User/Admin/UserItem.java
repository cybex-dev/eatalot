package models.User.Admin;

import models.User.Customer.Customer;
import models.User.Staff;
import utility.NumberAwareStringComparator;

import java.util.ArrayList;
import java.util.List;

public class UserItem  {
    private String userId = "", name = "", surname = "", email = "", alias = "", cellNumber = "";
    private boolean isKitchenStaff = false, isStaff = false, isStudent = false, isCustomer = false, isVerified = false, isComplete = false, isActive = false;

    public static UserItem UserCustomer(Customer customer) {
        return UserCustomer(customer.getUserId(), customer.getName(), customer.getSurname(), customer.getEmail(), customer.getCellNumber(), customer.getStudent(), customer.getEmailVerifiedStatus(), customer.isComplete(), customer.getAccountActive());
    }

    public static UserItem UserCustomer(String userId, String name, String surname, String email, String cellNumber, boolean isStudent, boolean isVerified, boolean isComplete, boolean isActive) {
        UserItem userItem = new UserItem();
        userItem.setCustomer(true);
        userItem.setUserId(userId == null ? "NULL" : userId);
        userItem.setName(name == null ? "NULL" : name);
        userItem.setSurname(surname == null ? "NULL" : surname);
        userItem.setEmail(email == null ? "NULL" : email);
        userItem.setCellNumber(cellNumber == null ? "NULL" : cellNumber);
        userItem.setStudent(isStudent);
        userItem.setVerified(isVerified);
        userItem.setComplete(isComplete);
        userItem.setActive(isActive);
        return userItem;
    }

    public static UserItem UserStaff(Staff staff) {
        return UserStaff(staff.getUserId(), staff.getName(), staff.getSurname(), staff.getLoginAlias(), staff.getEmail(), staff.getCellNumber(), staff.getKitchenStaffStatus(), staff.getAccountActive());
    }

    public static UserItem UserStaff(String userId, String name, String surname, String alias, String email, String cellNumber, boolean isKitchenStaff, boolean isActive) {
        UserItem userItem = new UserItem();
        userItem.setStaff(true);
        userItem.setAlias(alias == null ? "NULL" : alias);
        userItem.setUserId(userId == null ? "NULL" : userId);
        userItem.setName(name == null ? "NULL" : name);
        userItem.setSurname(surname == null ? "NULL" : surname);
        userItem.setEmail(email == null ? "NULL" : email);
        userItem.setCellNumber(cellNumber == null ? "NULL" : cellNumber);
        userItem.setKitchenStaff(isKitchenStaff);
        userItem.setActive(isActive);
        return userItem;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAlias() {
        return alias;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public boolean isKitchenStaff() {
        return isKitchenStaff;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public boolean isCustomer() {
        return isCustomer;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setKitchenStaff(boolean kitchenStaff) {
        isKitchenStaff = kitchenStaff;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public void setCustomer(boolean customer) {
        isCustomer = customer;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static List<UserItem> sort(List<UserItem> unsortedList) {
        List<UserItem> sortedList = new ArrayList<>();

        int size = unsortedList.size();
        UserItem smallestItem = null;
        System.out.printf("Starting sort\n");
        while (size > 0) {
            System.out.printf("New comparison iteration\n");
            for (int i = 0; i < unsortedList.size(); i++) {
                if (smallestItem == null)
                    smallestItem = unsortedList.get(i);
                else {
                    String smallestItemString = smallestItem.getUserId();
                    String currentItemString = unsortedList.get(i).getUserId();
                    int ii = 0;
                    ii = smallestItemString.compareToIgnoreCase(currentItemString);
                    System.out.printf("Comparing: %s with %s -> %d\n", smallestItemString, currentItemString, ii);
                    if (ii > 0)
                        smallestItem = unsortedList.get(i);
                }
            }
            sortedList.add(smallestItem);
            unsortedList.remove(smallestItem);
            smallestItem = null;
            size--;
        }
        System.out.printf("Done\n");
        return sortedList;
    }

    public static int compare(UserItem userItem1, UserItem userItem2) {
        int i = new NumberAwareStringComparator().compare(userItem1.getUserId(), userItem2.getUserId());
        return i;
    }
}
