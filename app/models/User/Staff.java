package models.User;

import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.MappedSuperclass;

/**
 * Created by cybex on 2017/07/13.
 */

@MappedSuperclass
public class Staff extends User {

    private String userId;
    @Constraints.Required
    private Boolean isKitchenStaff;

    public static Finder<String, Staff> find = new Finder<String, Staff>(Staff.class);

    public Staff(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber, String userId1, @Constraints.Required Boolean isKitchenStaff) {
        super(userId, name, surname, password, email, cellNumber, false);
        this.userId = userId1;
        this.isKitchenStaff = isKitchenStaff;
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
}
