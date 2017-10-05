package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Voucher extends Model{

    @Id
    @GeneratedValue
    @Constraints.Required
    private Long voucherId;

    @Constraints.Required
    private String voucherCode;

    @Constraints.Required
    private Double value;

    public Voucher() {}

    public Voucher(@Constraints.Required String voucherCode, @Constraints.Required Double value) {
        this.voucherCode = voucherCode;
        this.value = value;
    }

    public static Finder<Long , Voucher> find = new Finder<Long , Voucher>(Voucher.class);

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
