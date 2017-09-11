package models.Finance;

import play.Logger;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.util.List;

public class UserFunds implements Constraints.Validatable<ValidationError>{
    private Long userId;
    private String voucherCode;

    public UserFunds(){}

    public UserFunds(Long userId, String voucherValue) {
        this.userId = userId;
        this.voucherCode = voucherValue;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVoucherValue() {
        return voucherCode;
    }

    public void setVoucherValue(String voucherValue) {
        this.voucherCode = voucherValue;
    }


    @Override
    public ValidationError validate() {
        List<Voucher> voucherCodes = Voucher.find.query().where().ilike("voucherCode", voucherCode).findList();
        if (voucherCodes.size() == 0)
            return new ValidationError("voucherCode", "Invalid Voucher Code");
        if (voucherCodes.size() > 1)
            Logger.warn("UserFunds::validate\nCode : " + voucherCode + " has multiple occurances!");
        return null;
    }
}
