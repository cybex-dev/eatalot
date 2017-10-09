package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderScheduleItem extends Model {
    @Id
    @Constraints.Required
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderSchedItemId;
    @Constraints.Required
    private String orderId;
    @Constraints.Required
    private String orderSchedId;

    public OrderScheduleItem(String orderSchedItemId, @Constraints.Required String orderId, @Constraints.Required String orderSchedId) {
        this.orderSchedItemId = orderSchedItemId;
        this.orderId = orderId;
        this.orderSchedId = orderSchedId;
    }

    public static Finder<String, OrderScheduleItem> find = new Finder<>(OrderScheduleItem.class);

    public String getOrderSchedItemId() {
        return orderSchedItemId;
    }

    public void setOrderSchedItemId(String orderSchedItemId) {
        this.orderSchedItemId = orderSchedItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderSchedId() {
        return orderSchedId;
    }

    public void setOrderSchedId(String orderSchedId) {
        this.orderSchedId = orderSchedId;
    }
}
