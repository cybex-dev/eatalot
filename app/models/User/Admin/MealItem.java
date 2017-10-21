package models.User.Admin;

import models.Order.Meal;

public class MealItem {
    private String mealId;
    private String mealDescription;
    private double price;
    private boolean isActive;

    public MealItem(String mealId, String mealDescription, double price, boolean isActive) {
        this.mealId = mealId;
        this.mealDescription = mealDescription;
        this.price = price;
        this.isActive = isActive;
    }

    public static MealItem build(Meal meal){
        return new MealItem(meal.getMealId(), meal.getDescription(), meal.getCost(), meal.isActive());
    }

    public String getMealId() {
        return mealId;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public double getPrice() {
        return price;
    }

    public boolean isActive() {
        return isActive;
    }
}
