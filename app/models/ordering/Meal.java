package models.ordering;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.PagedList;
import io.ebean.SqlQuery;
import io.ebeaninternal.server.lib.util.Str;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class Meal extends Model{
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

    public static Finder<String, Meal> find = new Finder<String, Meal>(Meal.class);

    public static List<Meal> findMealsByType(String type){
        return find.query().where()
                .ilike("type","%" + type + "%")
                .setFirstRow(0)
                .setMaxRows(20)
                .findPagedList()
                .getList();
    }

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

    public static List<Meal> getAllMeals(){
        return find.all();
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
