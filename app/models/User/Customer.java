package models.User;

import io.ebean.Finder;
import models.Order.OrderSchedule;
import models.Order.OrderScheduleItem;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import java.util.Optional;

@Entity
public class Customer extends User {

    @Constraints.Required
    private String addressId;
    private Boolean isStudent = false;
    private Boolean emailVerified = false;
    private boolean isComplete = false;
    private Double balance = 0.00;

    public Customer(){}

    public Customer(Long userId, String name, String surname, String email, String cellNumber, String password, String addressId, Boolean isStudent, Boolean emailVerified) {
        super(userId, name, surname, email, cellNumber, password);
        this.addressId = addressId;
        this.isStudent = isStudent;
        this.emailVerified = emailVerified;
    }

    public static final Finder<String, Customer> find = new Finder<String, Customer>(Customer.class);


    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
                if (super.getUserId() != null)
            save();
    }


    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String address) {
        this.addressId = address;
                if (super.getUserId() != null)
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
                if (super.getUserId() != null)
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
                if (super.getUserId() != null)
            save();
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void addFunds(Double value) {
        balance += value;
                if (super.getUserId() != null)
            save();
    }

    public void pay(Double value) {
        balance -= value;
    }

    public String  getBalance(){
        return (balance == null) ? "0.00" : String.valueOf(balance);
    }

    public CustomerInfo getUserInfo(){
        OrderSchedule orderSchedule = OrderSchedule.find.query().where().ilike("userId", getUserId()).findOne();
        boolean isActive = false;
        int count = 0;
        if (orderSchedule != null){
            isActive = orderSchedule.isActive();
            count = OrderScheduleItem.find.query().where().ilike("orderSchedId", orderSchedule.getOrderSchedId()).findCount();
        }
        return new CustomerInfo(getUserId(), getName(), getSurname(), isComplete(), isStudent(), getBalance(), count, isActive);
    }

    public static boolean Authenticate(String id, String token) {
        Optional<Customer> customer = Customer.find.query().where().idEq(id).and().eq("token", token).findOneOrEmpty();
        return customer.isPresent();
    }
}
