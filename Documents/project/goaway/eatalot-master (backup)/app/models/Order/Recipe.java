package models.Order;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dylan on 2017/07/19.
 */
@Entity
public class Recipe extends Model{
    @Id
    private String recipeId;
    private int numPeopleServes;
    private double preparationTime;

    public Recipe(String recipeId, int numPeopleServes, double preparationTime) {
        this.recipeId = recipeId;
        this.numPeopleServes = numPeopleServes;
        this.preparationTime = preparationTime;
    }

    public Recipe(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public int getNumPeopleServes() {
        return numPeopleServes;
    }

    public void setNumPeopleServes(int numPeopleServes) {
        this.numPeopleServes = numPeopleServes;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }
}
