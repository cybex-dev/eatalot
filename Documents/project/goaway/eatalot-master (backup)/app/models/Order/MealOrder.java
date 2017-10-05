package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebeaninternal.server.lib.util.Str;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by dylan on 2017/07/18.
 */
@Entity
public class MealOrder extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String mealOrderId;
    private String mealId;
    private String orderId;
    private int orderQty;

    public MealOrder() {
        this.orderQty = 0;
    }

    public MealOrder(String mealId, String orderId, int orderQty) {
//        this.mealOrderId = mealOrderId;
        this.mealId = mealId;
        this.orderId = orderId;
        this.orderQty = 0;
    }

    private static Finder<Long, MealOrder> find = new Finder<Long, MealOrder>(MealOrder.class);

    /**
     * Check if a meal is already present in current order
     * @param mealId of the meal to be order
     * @param orderId of the order which the meal is part of
     * @return the meal if present else return null
     */
    public static MealOrder findMealByMealIdAndOrderId(String mealId, String orderId){
        try {
            return find.query().where()
                    .eq("mealId", mealId)
                    .eq("orderId", orderId)
                    .findList().get(0);
        }
        catch (NullPointerException | IndexOutOfBoundsException e){
            return null;
        }
    }

    /**
     * Finds all mealOrders with given orderId
     * @param orderId of mealOrders to be found
     * @return List of mealOrders with given orderId, Return null if doesn't exist
     */
    public static List<MealOrder> findMealOrderByOrderId(String orderId){
        try {
            return find.query().where()
                    .eq("orderId", orderId)
                    .findList();
        }
        catch (NullPointerException e){
            return null;
        }
    }

    public void incrementQty(){
        this.orderQty++;
    }

    public void deductQty(){
        if(this.orderQty == 1)
            delete();
        else {
            this.orderQty--;
            update();
        }
    }

    public String getMealOrderId(){
        return mealOrderId;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
}
