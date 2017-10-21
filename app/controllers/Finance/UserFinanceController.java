package controllers.Finance;

import annotations.Routing.AdminOnly;
import annotations.Routing.CustomersDeliveryOnly;
import annotations.Routing.CustomersOnly;
import annotations.SessionVerifier.RequiresActive;
import controllers.Application.AppTags;
import controllers.User.routes;
import models.Finance.*;
import models.Order.CustomerOrder;
import models.User.Customer.Customer;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import play.routing.JavaScriptReverseRouter;
import views.html.Finance.Discount.viewDiscount;
import views.html.Finance.UserFinance.AddFunds;

import javax.inject.Inject;
import javax.persistence.NonUniqueResultException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static controllers.Application.AppTags.*;



public class UserFinanceController extends Controller {

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

    @With(RequiresActive.class)
    @AdminOnly
    public Result addDiscount(){
        Form<Discount> discountForm = formFactory.form(Discount.class);
        return ok(viewDiscount.render(discountForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result editDiscount(String discountId){
        Discount discount = Discount.find.byId(discountId);
        Form<Discount> discountForm = formFactory.form(Discount.class).fill(discount);
        return ok(viewDiscount.render(discountForm));
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result updateDiscount(){
        Form<Discount> discountForm = formFactory.form(Discount.class).bindFromRequest();
        if (discountForm.hasErrors()){
            flash().put(FlashCodes.danger.toString(), "Please check fields");
            return badRequest(viewDiscount.render(discountForm));
        }
        Discount editedDiscount = discountForm.get();
        String id = editedDiscount.getDiscountId();
        Discount discount = null;
        if (id != null && !id.isEmpty()) {
            discount = Discount.find.byId(id);
            discount.fill(editedDiscount);
        }
        else {
            discount = new Discount(editedDiscount.getDescription(), editedDiscount.getPercentage());
            discount.setEnabled(editedDiscount.isEnabled());
        }
        discount.save();
        flash().put(FlashCodes.success.toString(), "Discount \'" + discount.getDescription() + "\' updated!");
        return redirect(controllers.User.routes.AdminController.manageDiscounts());
    }

    @With(RequiresActive.class)
    @AdminOnly
    public Result removeDiscount(String discountId){
        Discount discount = Discount.find.byId(discountId);
        if (discount == null){
            flash().put(FlashCodes.danger.toString(), "Failed to delete discount!");
            return badRequest();
        }
        String discountName = discount.getDescription();
        discount.delete();
        flash().put(FlashCodes.success.toString(), "Discount \'" + discountName + "\' deleted!");
        return ok();
    }

    public Result financeJSRoutes() {
        return ok(
                JavaScriptReverseRouter.create(Routes.FinanceJSRoutes.toString(),null
//                        routes.javascript.UserFinanceController.addDiscount(),
//                        routes.javascript.UserFinanceController.updateDiscount(),
//                        routes.javascript.UserFinanceController.editDiscount(),
//                        routes.javascript.UserFinanceController.removeDiscount()
                )
        ).as("text/javascript");
    }
}
