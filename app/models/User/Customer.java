package models.User;

import com.sun.org.apache.xpath.internal.operations.Bool;
import controllers.Application.AppTags;
import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Customer extends User {

    @Constraints.Required
    private String addressId;
    private Boolean isStudent = false;
    private Boolean emailVerified = false;
    @Constraints.Required
    private String token;
    private boolean isComplete = false;
    private Double balance = 0.00;

    public Customer(){}

    public Customer(String userId, String name, String surname, String email, String cellNumber, String password, String addressId, Boolean isStudent, Boolean emailVerified) {
        super(userId, name, surname, email, cellNumber, password);
        this.addressId = addressId;
        this.isStudent = isStudent;
        this.emailVerified = emailVerified;
    }

    public static final Finder<String, Customer> find = new Finder<String, Customer>(Customer.class);

    public void setToken(String token) {
        this.token = token;
        save();
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        save();
    }

    public String getToken() {
        return token;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String address) {
        this.addressId = address;
        save();
    }

    public Address getAddress(){
        return Address.find.byId(addressId);
    }

    public Boolean isStudent() {
        return this.isStudent;
    }

    public void setStudent(Boolean status) {
        this.isStudent = status;
        save();
    }

    /**
     * Checks all values of the Customer, returns true if the user's profile is complete
     * @return
     */
    public boolean completeCheck(){
        return isComplete = (super.completeCheck() &&
                emailVerified &&
                Address.find.byId(addressId).isComplete());
    }

    /**
     * Deep comparison with customer object. Ignores userId check.
     * @param obj customer object to compare
     * @return true if all data equates
     */
    @Override
    public boolean equals(Object obj) {
        Customer c = (Customer) obj;
        return (super.equals(obj) &&
                c.isStudent.equals(isStudent) &&
                c.addressId.equals(addressId));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isStudent)
            stringBuilder.append("[S]");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    public boolean isVerified() {
        return emailVerified;
    }

    public void setComplete(boolean complete) {
        this.isComplete = complete;
        save();
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void addFunds(Double value) {
        balance += value;
        save();
    }

    public void pay(Double value) {
        balance -= value;
    }

    public String  getBalance(){
        return (balance == null) ? "0.00" : String.valueOf(balance);
    }

    public UserInfo getUserInfo(){
        return new UserInfo(getUserId(), getName(), getSurname(), isComplete(), isStudent(), getBalance());
    }
}
