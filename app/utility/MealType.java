package utility;

/**
 * Created by dylan on 2017/10/07.
 */
public interface MealType {
    String BREAKFAST = "Breakfast";
    String LUNCH = "Lunch";
    String DINNER = "Dinner";

    MealType setBreakfast();

    MealType setLunch();

    MealType setDinner();

    String[] getTypes();

    String getType();
}
