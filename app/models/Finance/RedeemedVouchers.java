package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "redeemed_vouchers")
public class RedeemedVouchers extends Model {
    @Id
    @Constraints.Required
    private String voucherCode;

    @Constraints.Required
    private String voucherId;

    @Constraints.Required
    private String userId;

    @Constraints.Required
    private Date redeemedOn;

    public static Finder<String, RedeemedVouchers> find = new Finder<String, RedeemedVouchers>(RedeemedVouchers.class);

    public RedeemedVouchers(){}

    public RedeemedVouchers(@Constraints.Required String voucherId, @Constraints.Required String userId, @Constraints.Required Date redeemedOn) {
        this.voucherId = voucherId;
        this.userId = userId;
        this.redeemedOn = redeemedOn;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getRedeemedOn() {
        return redeemedOn;
    }

    public void setRedeemedOn(Date redeemedOn) {
        this.redeemedOn = redeemedOn;
    }

    @Override
    public void insert() {
        voucherCode = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }
}
