package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voucher extends Model{

    @Id
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Constraints.Required
    private String voucherId;

    @Constraints.Required
    private String voucherCode;

    @Constraints.Required
    private Double value;

    public Voucher() {}

    public Voucher(@Constraints.Required String voucherCode, @Constraints.Required Double value) {
        this.voucherCode = voucherCode;
        this.value = value;
    }

    public static Finder<String , Voucher> find = new Finder<String , Voucher>(Voucher.class);

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
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
