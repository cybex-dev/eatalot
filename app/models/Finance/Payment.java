package models.Finance;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
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
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date date;
    @Constraints.Required
    private Date time;
    @Constraints.Required
    private Double amount;
    private Boolean isCash;
    private Boolean isPaid;



    public static Finder<String, Payment> find = new Finder<>(Payment.class);

    public Payment(){}

    public Payment(@Constraints.Required String paymentId, @Constraints.Required Date date, @Constraints.Required Double amount, Boolean isCash, Boolean isPaid) {
        this.paymentId = paymentId;
        this.date = date;
        this.amount = amount;
        this.isCash = isCash;
        this.isPaid= isPaid;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }

    public Double getAmount() {
        return amount;
    }

    public Boolean isCash() {
        return isCash;
    }

    public String getPaymentId() {
        return paymentId;
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
}
