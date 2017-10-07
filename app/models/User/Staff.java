package models.User;

import controllers.Application.AppTags;
import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 * Created by cybex on 2017/07/13.
 */

@Entity
public class Staff extends User {

    @Constraints.Required
    private Boolean isKitchenStaff;
    @Constraints.Required
    private String token;

    public static Finder<String, Staff> find = new Finder<String, Staff>(Staff.class);

    public Staff(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber, @Constraints.Required Boolean isKitchenStaff) {
        super(userId, name, surname, password, email, cellNumber);
        this.isKitchenStaff = isKitchenStaff;
    }

    public Boolean isKitchenStaff() {
        return isKitchenStaff;
    }

    @Override
    public boolean equals(Object obj) {
        Staff s = (Staff) obj;
        return super.equals(obj) &&
                s.isKitchenStaff.equals(isKitchenStaff);
    }

    @Override
    public String toString() {
        return super.toString() + " [ " + (isKitchenStaff ? "Kitchen" : "Delivery") + " ]";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isDeliveryStaff() {
        return !isKitchenStaff;
    }
}
