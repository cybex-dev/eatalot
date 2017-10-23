package models.User.Customer;

import io.ebean.Finder;
import models.Finance.Payment;
import models.Order.CustomerOrder;
import models.Order.OrderSchedule;
import models.User.User;
import utility.StatusId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Entity
@Table(name = "customer")
public class Customer extends User implements StatusId{

    private Boolean student = false;
    private Boolean emailVerifiedStatus = false;
    private boolean complete = false;
    private Double accBalance = 0.00;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private OrderSchedule orderSchedule;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CustomerOrder> orders = new ArrayList<>();

    public Customer() {
        super();
    }

    public Customer init(){
        if (address == null)
            address = new Address();
        if (orderSchedule == null)
            orderSchedule = new OrderSchedule();
        return this;
    }

    public Customer(String userId, String name, String surname, String email, String cellNumber, String password, Address address, Boolean student, Boolean emailVerified) {
        super(userId, name, surname, email, cellNumber, password);
        this.address = address;
        this.student = student;
        this.emailVerifiedStatus = emailVerified;
    }

    public static final Finder<String, Customer> find = new Finder<String, Customer>(Customer.class);

    public Address getAddress() {
        return address;
    }

    public int countActiveOrders(){
        return orders.stream().filter(customerOrder -> !customerOrder.getStatusId().equals(UNSUBMITTED)
                && !customerOrder.getStatusId().equals(COMPLETE)
                && !customerOrder.getStatusId().equals(CANCELLED)).collect(Collectors.toList()).size();
    }

    /**
     * Checks all values of the Customer, returns true if the user's profile is complete
     *
     * @return
     */
    public boolean completeCheck() {
        return (super.completeCheck() &&
                getEmailVerifiedStatus() &&
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
                c.student.equals(student) &&
                c.address.equals(address));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (student)
            stringBuilder.append("[S]");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }


    public void addFunds(Double value) {
        accBalance += value;
            save();
    }

    public void pay(Double value) {
        accBalance -= value;
        save();
    }


    public static boolean Authenticate(String id, String token) {
        Optional<Customer> customer = Customer.find.query().where().idEq(id).and().eq("token", token).findOneOrEmpty();
        if (customer.isPresent())
            return customer.get().getAccountActive();
        return false;
    }

    public List<Payment> getPayments() {
        return null;
    }

    public List<CustomerOrder> getOrders() {
        return null;
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
        if (this.emailVerifiedStatus != editedCustomer.emailVerifiedStatus)
            this.emailVerifiedStatus = editedCustomer.emailVerifiedStatus;
        if (this.student != editedCustomer.student)
            this.student = editedCustomer.student;
        if (this.complete != editedCustomer.complete)
            this.complete = editedCustomer.complete;
        if (!this.accBalance.equals(editedCustomer.accBalance))
            this.accBalance = editedCustomer.accBalance;

    }

    public void setAccBalance(Double accBalance) {
        this.accBalance = accBalance;
    }

    public Double getAccBalance() {
        return accBalance;
    }

    public String getAccBalanceString() {
        return (accBalance == null) ? "0.00" : String.valueOf(accBalance);
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public static Customer findCustomerByUserId(String userId){
        return find.query().where().eq("userId", userId).findOne();
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Boolean getEmailVerifiedStatus() {
        return emailVerifiedStatus;
    }

    public void setEmailVerifiedStatus(Boolean emailVerifiedStatus) {
        this.emailVerifiedStatus = emailVerifiedStatus;
    }
}
