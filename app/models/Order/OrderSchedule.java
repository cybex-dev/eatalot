package models.Order;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.Transaction;
import models.Finance.Payment;
import models.ordering.CustomerOrder;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.libs.streams.Accumulator;
import scala.compat.java8.collectionImpl.Accumulator$;
import utility.RandomString;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    private String userId;
    @Constraints.Required
    private String title;
    //    @Constraints.Required
//    @Formats.DateTime(pattern="dd/MM/yyyy")
//    private Date date;
    private Boolean isActive = false;

    public static Finder<String, OrderSchedule> find = new Finder<>(OrderSchedule.class);

    public OrderSchedule(@Constraints.Required String userId, @Constraints.Required String title, boolean isActive) {
        this.userId = userId;
        this.title = title;
        this.isActive = isActive;
    }

    public static OrderSchedule getOrderScheduleByUserId(String userId) {
        return find.all().stream().filter(orderSchedule -> orderSchedule.getUserId().equals(userId)).findFirst().orElse(null);
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
    }

    public String getOrderSchedId() {
        return orderSchedId;
    }

    public void setOrderSchedId(String orderSchedId) {
        this.orderSchedId = orderSchedId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public void insert() {
        orderSchedId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }

}
