package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dylan on 2017/07/19.
 */
@Entity
public class Ingredient extends Model implements Constraints.Validatable<ValidationError>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ingredientId;
    @Constraints.Required
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

    private static Finder<Long, Ingredient> find = new Finder<>(Ingredient.class);

    public Ingredient(String description, int qtyOrdered) {
        this.description = description;
        this.qtyOrdered = qtyOrdered;
    }

    public static List<Ingredient> findAllIngredients(){
        return find.all();
    }

    public static Ingredient findIngredientById(String ingredientId){
        return find.query()
                .where()
                .ilike("ingredientId", ingredientId)
                .findOne();
    }

    @Override
    public void insert() {
        String hash = description + ThreadLocalRandom.current().nextInt(100, 1000);
        ingredientId = String.valueOf(hash.hashCode());
        super.insert();
    }

    public void updateIngredientQuantity(String id, int qty){
        setQtyOrdered(qty);
        update();
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

    @Override
    public ValidationError validate() {
        if(Objects.equals(description.trim(), ""))
            return new ValidationError("invalidDesc", "Please enter a valid description.");
        return null;
    }
}
