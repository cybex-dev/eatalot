package models.Finance;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebeaninternal.server.lib.util.Str;
import play.data.format.Formats;
import play.data.validation.Constraints;
import scala.xml.dtd.REQUIRED;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.Date;

/**
 * Created by cybex on 2017/07/14.
 */
@Entity
public class Payment extends Model {
    @Id
    @Constraints.Required
    @GeneratedValue
    private String paymentId;
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date date;
    @Constraints.Required
    private Date time;
    @Constraints.Required
    private Double amount;
    private Boolean isCash;

    // Needs foreign key to order.
    @Constraints.Required
    private String orderId;

    public static Finder<String, Payment> find = new Finder<>(Payment.class);

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

    public Payment setDate(Date date) {
        this.date = date;
        return this;
    }

    public Payment setTime(Date time) {
        this.time = time;
        return this;
    }

    public Payment setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Payment setCash(Boolean cash) {
        isCash = cash;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
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

    public Boolean getCash() {
        return isCash;
    }

    public String getOrderId() {
        return orderId;
    }
}
