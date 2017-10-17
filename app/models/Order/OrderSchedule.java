package models.Order;

import io.ebean.Finder;
import io.ebean.Model;
import models.User.Customer.Customer;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by cybex on 2017/07/13.
 * <p>
 * Reflects a single or schedule only, no duplicates will be held
 */

@Entity
@Table(name = "order_schedule")
public class OrderSchedule extends Model {

    @Id
    @Constraints.Required
    private String orderSchedId;
    @Constraints.Required
    private String title;

    private Boolean isActive = false;

    public static Finder<String, OrderSchedule> find = new Finder<>(OrderSchedule.class);

    private void generateId() {
        orderSchedId = new RandomString(16, ThreadLocalRandom.current()).nextString();
    }

    public OrderSchedule(@Constraints.Required String title, boolean isActive) {
        this.title = title;
        this.isActive = isActive;
    }

    public static OrderSchedule getOrderScheduleByUserId(String userId) {
        return Customer.find.byId(userId).getOrderSchedule();
    }

    public boolean clearSchedule() {
        final AtomicBoolean deleted = new AtomicBoolean(true);
        getScheduledOrders().forEach(orderScheduleItem -> {
            if (!orderScheduleItem.delete())
                deleted.set(false);

        });
        return deleted.get();
    }

    public boolean hasScheduledOrders() {
        return getScheduledOrders().size() != 0;
    }

    public List<OrderScheduleItem> getScheduledOrders() {
        return OrderScheduleItem.find.query().where().ilike("orderSchedId", orderSchedId).findList();
    }

    public OrderSchedule() {
        generateId();
    }

    public String getOrderSchedId() {
        return orderSchedId;
    }

    public void setOrderSchedId(String orderSchedId) {
        this.orderSchedId = orderSchedId;
        save();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        save();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
        save();
    }

    @Override
    public void insert() {
        orderSchedId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }

}
