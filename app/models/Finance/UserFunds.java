package models.Finance;

import play.Logger;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.util.List;

public class UserFunds implements Constraints.Validatable<ValidationError>{
    private String userId;
    private String voucherCode;

    public UserFunds(){}

    public UserFunds(String userId, String voucherValue) {
        this.userId = userId;
        this.voucherCode = voucherValue;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherValue) {
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
