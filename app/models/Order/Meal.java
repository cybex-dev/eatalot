package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.MealType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class Meal extends Model implements MealType {
    @Id
    private String mealId;
    private String recipeId;
    private String description;
    @Constraints.Required
    private String type;
    private double cost;

    public Meal(String mealId) {
        this.mealId = mealId;
    }

    public Meal(String mealId, String recipeId, String description, String type, double cost) {
        this.mealId = mealId;
        this.recipeId = recipeId;
        this.description = description;
        this.type = type;
        this.cost = cost;
    }

    private static Finder<Long, Meal> find = new Finder<Long, Meal>(Meal.class);

    /**
     * Find a meal by its mealId
     * @param mealId of meal to be found
     * @return meal, returns null if not found
     */
    public static Meal findMealByMealId(String mealId){
        try {
            return find.query().where()
                    .eq("mealId", mealId)
                    .findList()
                    .get(0);
        }
        catch (NullPointerException | IndexOutOfBoundsException e){
            return null;
        }
    }

    public static List<Meal> findMealsByType(String type){
        return find.query()
                .where()
                .eq("type", type)
                .findList();
    }

    public static List<Meal> getAllMeals(){
        return find.all();
    }

    @Override
    public MealType setBreakfast() {
        this.type = BREAKFAST;
        return this;
    }

    @Override
    public MealType setLunch() {
        this.type = LUNCH;
        return this;
    }

    @Override
    public MealType setDinner() {
        this.type = DINNER;
        return this;
    }

    @Override
    public String[] getTypes() {
        return new String[]{BREAKFAST, LUNCH, DINNER};
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
