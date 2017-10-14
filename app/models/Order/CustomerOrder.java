package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import models.Finance.Payment;
import play.data.validation.Constraints;
import utility.Pair;
import utility.StatusId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class CustomerOrder extends Model implements StatusId {
    @Id
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

    private String statusId = UNSUBMITTED;
    private String userId;
    private String paymentId;
//    private String aymentId;

//    private String date;
//    private String time;
//    private String mealOrderId; // Not needed


    public CustomerOrder() {
        setOrderId();
    }

    public Payment getPaymentObject(){
        return Payment.findPaymentById(paymentId);
    }

    public void updateCost(){
        List<MealOrder> mealOrders = MealOrder.findMealOrderByOrderId(orderId);
        final double[] total = {0};
        mealOrders.stream().forEach(mealOrder -> total[0] += Meal.findMealByMealId(mealOrder.getMealId()).getCost() * mealOrder.getOrderQty());
        Payment.findPaymentById(paymentId).setAmount(total[0]).update();
    }

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

    @Override
    public void insert() {
        super.insert();
    }

    private void setOrderId() {
        orderId = String.valueOf((statusId + ThreadLocalRandom.current().nextInt(100, 1000) + userId + ThreadLocalRandom.current().nextInt(100, 1000)).hashCode());
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



//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }

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

    public CustomerOrder setPending(){
        statusId = PENDING;
        return this;
    }

    public CustomerOrder setProcessing(){
        statusId = PROCESSING;
        return this;
    }

    public CustomerOrder setDelivering(){
        statusId = DELIVERING;
        return this;
    }

    public CustomerOrder setCancelle(){
        statusId = CANCELLED;
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
