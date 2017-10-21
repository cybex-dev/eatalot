package models.Finance;

import io.ebean.Finder;
import io.ebean.Model;
import utility.IdGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount extends Model{
    @Id
    private String discountId;
    private String description;
    private double percentage;
    private boolean enabled = true;

    public Discount(){
        this.discountId = IdGenerator.generate();
    }

    public Discount(String description, double percentage) {
        this.discountId = IdGenerator.generate();
        this.description = description;
        this.percentage = percentage;
    }

    public static Finder<String, Discount> find = new Finder<String, Discount>(Discount.class);

    public String getDiscountId() {
        return discountId;
    }

    public String getDescription() {
        return description;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void fill(Discount discount){
        if (!this.description.equals(discount.description))
            this.description = discount.description;
        if (this.percentage != discount.percentage)
            this.percentage = discount.percentage;
        if (this.enabled != discount.enabled)
            this.enabled = discount.enabled;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }
}
