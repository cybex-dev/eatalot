package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class RedeemedVouchers extends Model {
    @Id
    @GeneratedValue
    @Constraints.Required
    private Long voucherCode;

    @Constraints.Required
    private String voucherId;

    @Constraints.Required
    private Long userId;

    @Constraints.Required
    private Date redeemedOn;

    public static Finder<Long, RedeemedVouchers> find = new Finder<Long, RedeemedVouchers>(RedeemedVouchers.class);

    public RedeemedVouchers(){}

    public RedeemedVouchers(@Constraints.Required String voucherId, @Constraints.Required Long userId, @Constraints.Required Date redeemedOn) {
        this.voucherId = voucherId;
        this.userId = userId;
        this.redeemedOn = redeemedOn;
    }

    public Long getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(Long voucherCode) {
        this.voucherCode = voucherCode;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getRedeemedOn() {
        return redeemedOn;
    }

    public void setRedeemedOn(Date redeemedOn) {
        this.redeemedOn = redeemedOn;
    }
}
