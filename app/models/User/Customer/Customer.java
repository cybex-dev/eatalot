package models.User.Customer;

import io.ebean.Finder;
import models.Finance.Payment;
import models.Order.OrderSchedule;
import models.Order.OrderScheduleItem;
import models.User.Address;
import models.User.User;
import models.ordering.CustomerOrder;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer extends User {

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private OrderSchedule orderSchedule;

    private Boolean isStudent = false;
    private Boolean emailVerified = false;
    private boolean isComplete = false;
    private Double balance = 0.00;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CustomerOrder> orders = new ArrayList<>();

    public Customer(){}

    public Customer(String userId, String name, String surname, String email, String cellNumber, String password, Address address, Boolean isStudent, Boolean emailVerified) {
        super(userId, name, surname, email, cellNumber, password);
        this.address = address;
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

    public Address getAddress(){
        return address;
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
                address.isComplete());
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
                c.address.equals(address));
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


    public static boolean Authenticate(String id, String token) {
        Optional<Customer> customer = Customer.find.query().where().idEq(id).and().eq("token", token).findOneOrEmpty();
        return customer.isPresent();
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<CustomerOrder> getOrders() {
        return orders;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderSchedule getOrderSchedule() {
        return orderSchedule;
    }
}
