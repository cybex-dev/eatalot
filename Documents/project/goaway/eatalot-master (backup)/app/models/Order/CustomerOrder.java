package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebeaninternal.server.type.ScalarTypeJsonMap;
import play.data.validation.Constraints;
import utility.Pair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class CustomerOrder extends Model {
    @Id
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    private String statusId = "unsubmitted";
    private String userId;
    private String paymentId;
//    private String mealOrderId; // Not needed



    private static Finder<Long, CustomerOrder> find = new Finder<Long, CustomerOrder>(CustomerOrder.class);

    /**
     * Finds a customer order by its orderId
     * @param orderId of order to be found
     * @return customer order
     */
    public static CustomerOrder findOrderById(String orderId){
        try {
            return find.query().where()
                    .eq("orderId", orderId)
                    .findList().get(0);
        }
        catch (NullPointerException | IndexOutOfBoundsException e){
            return null;
        }
    }

    public static List<CustomerOrder> findAllOrders(){
        return find.query()
                .where()
                .not()
                .eq("statusId", "unsubmitted")
                .findList();
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
     * List is of type pair that has MealOrders object and Meal object as both may be needed
     * @return list of meals in order
     */
    public static List<Pair<MealOrder, Meal>> findAllMealsFromOrder(String orderId){
        // Find all meal orders
        List<MealOrder> lstMealOrders = MealOrder.findMealOrderByOrderId(orderId);
        List<Pair<MealOrder, Meal>> lstMeal = new ArrayList<>();

        if (lstMealOrders != null) for (MealOrder lstMealOrder : lstMealOrders)
            lstMeal.add(new Pair<>(lstMealOrder, Meal.findMealByMealId(lstMealOrder.getMealId())));
        else return null;
        return lstMeal;
    }

    public static List<CustomerOrder> findAllPendingOrders(){
        return  find.query()
                .where()
                .eq("statusId", "pending")
                .findList();
    }


    public static List<CustomerOrder> findAllProcessingOrders() {
        return find.query()
                .where()
                .eq("statusId", "processing")
                .findList();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatusId() {
        return statusId;
    }

    public CustomerOrder setStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CustomerOrder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public CustomerOrder setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

//    public String getMealOrderId() {
//        return mealOrderId;
//    }
//
//    public void setMealOrderId(String mealOrderId) {
//        this.mealOrderId = mealOrderId;
//    }
}
