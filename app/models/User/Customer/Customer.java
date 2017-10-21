package models.User.Customer;

import io.ebean.Finder;
import models.Finance.Payment;
import models.Order.CustomerOrder;
import models.Order.OrderSchedule;
import models.User.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "customer")
public class Customer extends User {

    private Boolean isStudent = false;
    private Boolean emailVerified = false;
    private boolean isComplete = false;
    private Double balance = 0.00;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private OrderSchedule orderSchedule;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CustomerOrder> orders = new ArrayList<>();

    public Customer() {
        if (address == null)
            address = new Address();
        if (orderSchedule == null)
            orderSchedule = new OrderSchedule();
    }

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
            save();
    }

    public Address getAddress() {
        return address;
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
     *
     * @return
     */
    public boolean completeCheck() {
        return (super.completeCheck() &&
                getEmailVerified() &&
                address.isComplete());
    }

    public boolean isProfileComplete() {
        boolean userComplete = super.completeCheck(),
                addressComplete = address.isComplete();
        return (userComplete && addressComplete);
    }

    /**
     * Deep comparison with customer object. Ignores userId check.
     *
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
        save();
    }

    public String getBalance() {
        return (balance == null) ? "0.00" : String.valueOf(balance);
    }

    public double getBalanceNumeric(){
        return balance;
    }

    public static boolean Authenticate(String id, String token) {
        Optional<Customer> customer = Customer.find.query().where().idEq(id).and().eq("token", token).findOneOrEmpty();
        if (customer.isPresent())
            return customer.get().getActive();
        return false;
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

    public void setOrderSchedule(OrderSchedule orderSchedule) {
        this.orderSchedule = orderSchedule;
    }

    public static Customer findCustomerByEmail(String email) {
        return find.query().where().eq("email", email).findOne();
    }

    public static List<DashboardEntries> getDashboardEntries() {
        return null;
    }

    public void fill(Customer editedCustomer) {
        super.fill(editedCustomer);
        if (this.emailVerified != editedCustomer.emailVerified)
            this.emailVerified = editedCustomer.emailVerified;
        if (this.isStudent != editedCustomer.isStudent)
            this.isStudent = editedCustomer.isStudent;
        if (this.isComplete != editedCustomer.isComplete)
            this.isComplete = editedCustomer.isComplete;
        if (!this.balance.equals(editedCustomer.balance))
            this.balance = editedCustomer.balance;
    }

    public Boolean getStudent() {
        return isStudent;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
