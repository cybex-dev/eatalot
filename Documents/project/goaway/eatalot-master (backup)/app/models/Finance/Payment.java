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
    @GeneratedValue
    private Long paymentId;
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date date;
    @Constraints.Required
    private Date time;
    @Constraints.Required
    private Double amount;
    private Boolean isCash;

    public static Finder<String, Payment> find = new Finder<>(Payment.class);

    public Payment(@Constraints.Required Long paymentId, @Constraints.Required Date date, @Constraints.Required Double amount, Boolean isCash) {
        this.paymentId = paymentId;
        this.date = date;
        this.amount = amount;
        this.isCash = isCash;
    }
}
