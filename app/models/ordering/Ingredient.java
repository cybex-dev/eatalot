package models.ordering;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dylan on 2017/07/19.
 */
@Entity
public class Ingredient extends Model {
    @Id
    private String ingredientId;
    private String description;
    private int qtyOrdered;

    public Ingredient(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Ingredient(String ingredientId, String description, int qtyOrdered) {
        this.ingredientId = ingredientId;
        this.description = description;
        this.qtyOrdered = qtyOrdered;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
}
