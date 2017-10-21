package models.User.Admin;

import models.Finance.Discount;

public class DiscountItem {
    private String id, description;
    private double percentage;
    private boolean enabled;

    public DiscountItem(String id, String description, double percentage, boolean enabled) {
        this.id = id;
        this.description = description;
        this.percentage = percentage;
        this.enabled = enabled;
    }

    public static DiscountItem build(Discount discount){
        return new DiscountItem(discount.getDiscountId(), discount.getDescription(), discount.getPercentage(), discount.isEnabled());
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPercentage() {
        return percentage;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
