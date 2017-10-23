package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import models.User.Customer.Customer;
import play.data.format.Formats;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
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
        super.insert();
    }

    public Payment setCash(Boolean cash) {
        isCash = cash;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Double getAmount() {
        return amount;
    }

    public Boolean getCash() {
        return isCash;
    }
}
