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
    private String image;
    private double cost;
    private boolean active = false;

    public Meal(String mealId) {
        this.mealId = mealId;
    }

    public Meal(String mealId, String recipeId, String description, String type, double cost, String image) {
        this.mealId = mealId;
        this.recipeId = recipeId;
        this.description = description;
        this.type = type;
        this.cost = cost;
        this.image = image;
    }

    //todo #NOTIFY [Charles] change access from private to public, is used to query database to get results when displaying info to user
    public static Finder<String, Meal> find = new Finder<String, Meal>(Meal.class);

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

    public Meal setActive(){
        active = true;
        return this;
    }

    public boolean isActive(){
        return active;
    }

    @Override
    public String[] getTypes() {
        return new String[]{BREAKFAST, LUNCH, DINNER};
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
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
