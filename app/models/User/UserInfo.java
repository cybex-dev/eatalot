package models.User;

public class UserInfo {
    private Long userId;
    private String name, surname, balance;
    private boolean isComplete, isStudent;

    public UserInfo(){}

    public UserInfo(Long userId, String name, String surname, boolean isComplete, Boolean isStudent, String balance) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.isComplete = isComplete;
        this.isStudent = isStudent;
        this.balance = balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public static UserInfo fill(Long uId) {
        Customer customer = Customer.find.byId(uId);
        return new UserInfo(uId, customer.getName(), customer.getSurname(), customer.isComplete(), customer.isStudent(), String.valueOf(customer.getBalance()));
    }
}
