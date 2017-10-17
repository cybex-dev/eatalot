package models.Finance;

import utility.DateInterpreter;

import java.util.Date;

public class PaymentItemBasic extends DateInterpreter {
    public String paymentId;
    public Boolean isCash;
    public Double amount;
    public String delivererName;

    public PaymentItemBasic(String paymentId, Boolean isCash, Date datePaid, Double amount, String delivererName) {
        super(datePaid);
        this.paymentId = paymentId;
        this.isCash = isCash;
        this.amount = amount;
        this.delivererName = delivererName;
    }
}

