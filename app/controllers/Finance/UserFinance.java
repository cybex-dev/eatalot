package controllers.Finance;

import annotations.Routing.CustomersDeliveryOnly;
import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.RequiresActive;
import models.Finance.Payment;
import models.Finance.RedeemedVouchers;
import models.Finance.UserFunds;
import models.Finance.Voucher;
import models.User.Customer.Customer;
import models.ordering.CustomerOrder;
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

import static controllers.Application.AppTags.*;



public class UserFinance extends Controller {

    @Inject
    FormFactory formFactory;

    @With(RequiresActive.class)
    @CustomersOnly
    public Result addFunds(){
        if (!Session.checkExistingSession(session())){
            Result result = renderDefaultPage();
            Http.Flash flash = result.flash();
            return result;
        }
        Form<UserFunds> userFundsForm = formFactory.form(UserFunds.class);
        HashMap<String, String> map = new HashMap<>();
        map.put("userId", Session.User.Customer.extract(session(),Session.User.id.toString()));
        userFundsForm.bind(map);
        return ok(AddFunds.render(userFundsForm));
    }

    @With(RequiresActive.class)
    @CustomersOnly
    public Result doAddFunds(){
        Form<UserFunds> form = formFactory.form(UserFunds.class).bindFromRequest();
        if (form.hasGlobalErrors()){
            flash().put(FlashCodes.warning.toString(), "Please try again!");
            return badRequest(AddFunds.render(form));
        }
        UserFunds userFunds = form.get();
        try {
            if (RedeemedVouchers.find.query().where().ilike("voucherId", userFunds.getVoucherCode()).findList().size() != 0){
                flash().put(FlashCodes.warning.toString(), "Voucher has already been redeemed");
                HashMap<String, String> map = new HashMap<>();
                map.put("userId", Session.User.Customer.extract(session(),Session.User.id.toString()));
                return badRequest(AddFunds.render(formFactory.form(UserFunds.class).bind(map)));
            }
            RedeemedVouchers redeemedVoucher = new RedeemedVouchers(userFunds.getVoucherCode(), userFunds.getUserId(), new Date());
            redeemedVoucher.save();
            Voucher voucher = null;
            try {
                voucher = Voucher.find.query().where().ilike("voucherCode", userFunds.getVoucherCode()).findOne();
            }
            catch (NonUniqueResultException e){
                Logger.warn("Exception: " + e.toString() + " UserFunds::validate\nCode : " + userFunds.getVoucherCode() + " has multiple occurances!");
            }
            flash().put(FlashCodes.success.toString(), Locale.Currency.ZAR.toString() + String.valueOf(voucher.getValue()) + " has been added to your account");
            HashMap<String, String> map = new HashMap<>();
            map.put("userId", Session.User.Customer.extract(session(),Session.User.id.toString()));
            Customer c = Customer.find.byId(AppCookie.extract(request(), AppCookie.user_id));
            c.addFunds(voucher.getValue());
            c.save();
            return ok(AddFunds.render(formFactory.form(UserFunds.class).bind(map)));
        }
        catch (Exception x){
            flash().put(FlashCodes.warning.toString(), "An error occured, please try again!");
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
        Payment payment = Payment.find.byId(CustomerOrder.find.byId(orderId).getPaymentId());
        payment.setIsCashPayment(cashPayment);
        payment.setPaid(true);
        return true;
    }
}
