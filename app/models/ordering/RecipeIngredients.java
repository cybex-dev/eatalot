package models.ordering;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dylan on 2017/07/19.
 */
@Entity
public class RecipeIngredients extends Model{
    @Id
    private String recipeId;
    private String ingredientId;
    private int qtyRequired;

    public RecipeIngredients(String recipeId, String ingredientId, int qtyRequired) {
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
        this.qtyRequired = qtyRequired;
    }

    public RecipeIngredients(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getQtyRequired() {
        return qtyRequired;
    }

    public void setQtyRequired(int qtyRequired) {
        this.qtyRequired = qtyRequired;
    }
}
