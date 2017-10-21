package controllers.Finance;

import annotations.Routing.CustomersDeliveryOnly;
import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import models.Finance.Payment;
import models.Finance.RedeemedVouchers;
import models.Finance.UserFunds;
import models.Finance.Voucher;
import models.Order.CustomerOrder;
import models.User.Customer.Customer;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import views.html.Finance.UserFinance.AddFunds;

import javax.inject.Inject;
import javax.persistence.NonUniqueResultException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static controllers.Application.AppTags.*;



public class UserFinance extends Controller {

    @Inject
    FormFactory formFactory;

    @With(RequiresActive.class)
    @CustomersOnly
    public Result addFunds(){
        Form<UserFunds> userFundsForm = formFactory.form(UserFunds.class);
        return ok(AddFunds.render(userFundsForm));
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public Result doAddFunds(){
        Form<UserFunds> form = formFactory.form(UserFunds.class).bindFromRequest();
        if (form.hasErrors()){
            flash().put(FlashCodes.danger.toString(), "Please try again!");
            return badRequest(AddFunds.render(form));
        }
        UserFunds userFunds = form.get();
        try {
            List<RedeemedVouchers> voucherIdList = RedeemedVouchers.find.query().where().eq("voucherId", userFunds.getVoucherCode()).findList();
            if (voucherIdList.size() != 0){
                flash().put(FlashCodes.danger.toString(), "Voucher has already been redeemed");
                return badRequest(AddFunds.render(formFactory.form(UserFunds.class)));
            }
            String s = session().get(AppCookie.user_id.toString());
            String code = userFunds.getVoucherCode();
            RedeemedVouchers redeemedVoucher = new RedeemedVouchers(code, s, new Date());
            redeemedVoucher.save();
            Voucher voucher = null;
            try {
                voucher = Voucher.find.query().where().ilike("voucherCode", userFunds.getVoucherCode()).findOne();
            }
            catch (NonUniqueResultException e){
                Logger.warn("Exception: " + e.toString() + " UserFunds::validate\nCode : " + userFunds.getVoucherCode() + " has multiple occurances!");
            }
            flash().put(FlashCodes.success.toString(), Locale.Currency.ZAR.toString() + String.valueOf(voucher.getValue()) + " has been added to your account");
            Customer c = Customer.find.byId(session().get(AppCookie.user_id.toString()));
            c.addFunds(voucher.getValue());
            c.save();
            return ok(AddFunds.render(formFactory.form(UserFunds.class)));
        }
        catch (Exception x){
            x.printStackTrace();
            flash().put(FlashCodes.danger.toString(), "An error occured, please try again!");
            return internalServerError(AddFunds.render(form));
        }
    }

    /**
     * Assumes payment entity already exists
     *
     * Defines basic behavoiour of customer paying
     *
     * Accepts inputs used for processing payment.
     * @param orderId order Id
     * @param cashPayment boolean cash payment
     * @return true if payment has been made, false if unsuccessful (insuffiecient funds or error)
     */

    @With(RequiresActive.class)
    @CustomersDeliveryOnly
    public boolean payMeal(String orderId, boolean cashPayment){
        Payment payment = Payment.find.byId(CustomerOrder.find.byId(Long.parseLong(orderId)).getPaymentId());
        payment.setIsCashPayment(cashPayment);
        payment.setPaid(true);
        return true;
    }
}
