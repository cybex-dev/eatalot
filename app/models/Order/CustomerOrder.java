package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import libs.Mailer;
import models.Finance.Payment;
import models.User.Customer.Customer;
import play.data.validation.Constraints;
import play.libs.mailer.Email;
import utility.Pair;
import utility.StatusId;

import javax.persistence.*;
import java.util.*;
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

//    @ManyToOne(cascade = CascadeType.ALL)
    private String customerUserId;
    private String paymentId;

    //todo #NOTIFY [Charles] Added date of delivery object. This is saved automatically in the database, is required to display info for user and determine the delivery time and date
    private Date deliveryDate;
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

    //todo #NOTIFY [Charles] change access from private to public, is used to query database to get results when displaying info to user
    public static Finder<Long, CustomerOrder> find = new Finder<Long, CustomerOrder>(CustomerOrder.class);

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
        orderId = String.valueOf((statusId + ThreadLocalRandom.current().nextInt(100, 1000) + customerUserId + ThreadLocalRandom.current().nextInt(100, 1000)).hashCode());
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
        notifyStatus();
        return this;
    }

    public CustomerOrder setProcessing(){
        statusId = PROCESSING;
        notifyStatus();
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

    private void notifyStatus(){
        Email email = new Email();
        String[] list = {Customer.find.byId(customerUserId).getEmail()};
        email.setTo(Arrays.asList(list));
        email.setSubject("Order: " + orderId + " status changed to " + statusId);
        email.setBodyText("Your order status has been updated to " + statusId);
        Mailer mailer = new Mailer();
        if(mailer.sendEmail(email))
            System.out.println("Email sent");
        else
            System.out.println("Email not sent");
    }

    public String getUserId() {
        return customerUserId;
    }

    public CustomerOrder setUserId(String userId) {
        this.customerUserId = userId;
        return this;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public CustomerOrder setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

//    public String getMealOrderId() {
//        return mealOrderId;
//    }
//
//    public void setMealOrderId(String mealOrderId) {
//        this.mealOrderId = mealOrderId;
//    }
}
