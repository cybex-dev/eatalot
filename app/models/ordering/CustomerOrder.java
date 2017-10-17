package models.ordering;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.Pair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> Customer-Management
import java.util.List;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class CustomerOrder extends Model {
    // TODO: Change orderId to string
    @Id
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    private long orderId;
=======
    private String orderId;
>>>>>>> Customer-Management

    private String statusId = "unsubmitted";
    private String userId;
    private String paymentId;
    private String mealOrderId;
<<<<<<< HEAD

    private static Finder<Long, CustomerOrder> find = new Finder<Long, CustomerOrder>(CustomerOrder.class);
=======
    public Date orderDate;

    public static Finder<String, CustomerOrder> find = new Finder<String, CustomerOrder>(CustomerOrder.class);
>>>>>>> Customer-Management

    /**
     * Finds a customer order by its orderId
     * @param orderId of order to be found
     * @return customer order
     */
    public static CustomerOrder findOrderById(long orderId){
        try {
            return find.query().where()
                    .eq("orderId", orderId)
                    .findList().get(0);
        }
        catch (NullPointerException | IndexOutOfBoundsException e){
            return null;
        }
    }

    /**
     * Find and return all orders placed by a specific user
     * @param userId of user
     * @return list of orders with given userId
     */
    public static List<CustomerOrder> findOrderByUserId(String userId){
        try{
            return find.query().where()
                    .eq("userId", userId)
                    .findList();
        }
        catch (NullPointerException e){
            return null;
        }
    }

    /**
     * Finds and return a List of all meals in a meal order
     * List is of type pair that has MealOrder object and Meal object as both may be needed
     * @return list of meals in order
     */
    public static List<Pair<MealOrder, Meal>> findAllMealsFromOrder(long orderId){
        // Find all meal orders
        List<MealOrder> lstMealOrders = MealOrder.findMealOrderByOrderId(orderId);
        List<Pair<MealOrder, Meal>> lstMeal = new ArrayList<>();

        if (lstMealOrders != null) for (MealOrder lstMealOrder : lstMealOrders)
            lstMeal.add(new Pair<>(lstMealOrder, Meal.findMealByMealId(lstMealOrder.getMealId())));
        else return null;
        return lstMeal;
    }

    public long getOrderId() {
<<<<<<< HEAD
        return orderId;
=======
        return Long.parseLong(orderId);
>>>>>>> Customer-Management
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getMealOrderId() {
        return mealOrderId;
    }

    public void setMealOrderId(String mealOrderId) {
        this.mealOrderId = mealOrderId;
    }
}
