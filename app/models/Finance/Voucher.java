package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Voucher extends Model{

    @Id
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

    @Override
    public void insert() {
        voucherId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }
}
