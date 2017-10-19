package models.Finance;

public class PaymentItemDetail {
    public String paymentId;
    public Boolean isCash;
    public Double amount;
    public String deliveryStaffName;
    public String orderId;

    public PaymentItemDetail(String paymentId, Boolean isCash, Double amount, String deliveryStaffName, String orderId) {
        this.paymentId = paymentId;
        this.isCash = isCash;
        this.amount = amount;
        this.deliveryStaffName = deliveryStaffName;
        this.orderId = orderId;
    }
}
