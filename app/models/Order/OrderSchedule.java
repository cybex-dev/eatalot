package models.Order;

import io.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by cybex on 2017/07/13.
 */

@Entity
public class OrderSchedule extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderSchedId;
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date date;
    @Constraints.Required
    private Object orderId; // TODO: 2017/07/13 get Order object's orderId
    @Constraints.Required
    private String time;

    public OrderSchedule(Date date, Object orderId) {
        this.date = date;
        this.orderId = orderId;
        time = getOrderTime();
    }

    private String getOrderTime(){
        DateFormat time = new SimpleDateFormat("hh:mm");
        time.setTimeZone(TimeZone.getTimeZone("Africa/Johannesburg"));
        return time.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {// TODO: 2017/07/13 fix up
        Object order = null,
                compOrder = null;
        //order = getOrder(orderId) // TODO: 2017/07/13 Complete when order class has been implemented
        //compOrder = getOrder(orderId)
        OrderSchedule o = (OrderSchedule) obj;
        return (order.equals(compOrder) &&
        o.getDate().equals(date) &&
        o.time.equals(time));
    }

    @Override
    public String toString() {
        return super.toString();// TODO: 2017/07/13 fix up
    }
}
