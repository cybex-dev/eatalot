package models.Finance;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cybex on 2017/07/14.
 */
@Entity
public class Payment extends Model {
    @Id
    @Constraints.Required
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentId;
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date date;
    @Constraints.Required
    private Date time;
    @Constraints.Required
    private Double amount;
    private Boolean isCash;

    public static Finder<String, Payment> find = new Finder<>(Payment.class);

    public Payment(@Constraints.Required String paymentId, @Constraints.Required Date date, @Constraints.Required Double amount, Boolean isCash) {
        this.paymentId = paymentId;
        this.date = date;
        this.amount = amount;
        this.isCash = isCash;
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
}
