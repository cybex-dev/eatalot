package models.User;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StaffOrderInteraction extends Model {
    @Id
    @Constraints.Required
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String staffOrderInteractionId;

    private String staffId;
    private String orderId;
    private Date placed, startProcessing, finishProcessing, startedDelivery, finishedDelivery;

    public static Finder<String, StaffOrderInteraction> find = new Finder<String, StaffOrderInteraction>(StaffOrderInteraction.class);

    public StaffOrderInteraction(String staffId, String orderId) {
        this.staffId = staffId;
        this.orderId = orderId;
    }

    public String getStaffOrderInteractionId() {
        return staffOrderInteractionId;
    }

    public void setStaffOrderInteractionId(String staffOrderInteractionId) {
        this.staffOrderInteractionId = staffOrderInteractionId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getPlaced() {
        return placed;
    }

    public void setPlaced(Date placed) {
        this.placed = placed;
    }

    public Date getStartProcessing() {
        return startProcessing;
    }

    public void setStartProcessing(Date startProcessing) {
        this.startProcessing = startProcessing;
    }

    public Date getFinishProcessing() {
        return finishProcessing;
    }

    public void setFinishProcessing(Date finishProcessing) {
        this.finishProcessing = finishProcessing;
    }

    public Date getStartedDelivery() {
        return startedDelivery;
    }

    public void setStartedDelivery(Date startedDelivery) {
        this.startedDelivery = startedDelivery;
    }

    public Date getFinishedDelivery() {
        return finishedDelivery;
    }

    public void setFinishedDelivery(Date finishedDelivery) {
        this.finishedDelivery = finishedDelivery;
    }
}
