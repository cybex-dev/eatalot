package models.Order;

public class MealOrderItem {
    public Double discount;
    public String mealOrderId;
    public String mealName;
    public int qty;
    public Double price, total;
    public String mealType;

    public MealOrderItem(String mealOrderId, Double discount, String mealType, String mealName, int qty, Double price) {
        this.mealOrderId = mealOrderId;
        this.mealName = mealName;
        this.qty = qty;
        this.mealType = mealType;
        this.discount = discount;
        this.price = price;
        this.total = price * qty;
    }

    public String getOrderId() {
        return mealOrderId;
    }


    public String getMealName() {
        return mealName;
    }

    public int getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public String getMealType(){
        return mealType;
    }

    public Double getTotal() {
        return total;
    }

    public Double getDiscount() {
        return discount;
    }

    public String getMealOrderId() {
        return mealOrderId;
    }
}
