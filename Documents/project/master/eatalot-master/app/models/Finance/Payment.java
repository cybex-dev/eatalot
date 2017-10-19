package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import models.User.Customer.Customer;
import play.data.format.Formats;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.*;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by cybex on 2017/07/14.
 */
@Entity
@Table(name = "payment")
public class Payment extends Model {
    @Id
    @Constraints.Required
    private String paymentId;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private String customerUserId;

    //TODO: I changed date & time to string, Date objects don't save right in database.
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private String date;
//    private Date date;
    @Constraints.Required
    private String time;
//    private Date time;

    @Constraints.Required
    private Double amount;
    private Boolean isCash;
    private Boolean isPaid;

    public Payment() {
        setPaymentId();
    }

    //TODO: Proper id generation, this one is shit
    private void setPaymentId(){
        paymentId = String.valueOf(String.valueOf((
                ThreadLocalRandom.current().nextInt(10, 1000)
                + ThreadLocalRandom.current().nextInt(10, 1000)
                + ThreadLocalRandom.current().nextInt(100, 1000))).hashCode());

    }



    // Needs foreign key to order.
    @Constraints.Required
    private String orderId;

    public static Finder<String, Payment> find = new Finder<>(Payment.class);

    public Payment(@Constraints.Required String paymentId, @Constraints.Required Date date, @Constraints.Required Double amount, Boolean isCash, Boolean isPaid) {
        this.paymentId = paymentId;
    }

    public static Payment findPaymentById(String paymentId){
        return find.query()
                .where()
                .eq("paymentId", paymentId)
                .findOne();
    }

    public Payment(String orderId) {
        this.orderId = orderId;
        paymentId = String.valueOf(orderId.hashCode());
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //    public Payment setDate(Date date) {
//        this.date = date;
//        return this;
//    }
//
//    public Payment setTime(Date time) {
//        this.time = time;
//        return this;
//    }

    public Payment setAmount(Double amount) {
        this.amount = amount;
        this.isCash = isCash;
        this.isPaid= isPaid;
        return this;
    }

    public Boolean isCash() {
        return isCash;
    }

    public boolean isPaid(){
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
        if (paymentId != null)
            save();
    }

    public void setIsCashPayment(boolean isCashPayment){
        isCash = isCashPayment;
        if (paymentId != null)
            save();
    }

    @Override
    public void insert() {
        paymentId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }

    public Payment setCash(Boolean cash) {
        isCash = cash;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    //    public Date getDate() {
//        return date;
//    }
//
//    public Date getTime() {
//        return time;
//    }

    public Double getAmount() {
        return amount;
    }

    public Boolean getCash() {
        return isCash;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }
}
