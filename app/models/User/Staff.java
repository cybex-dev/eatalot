package models.User;

import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Optional;

/**
 * Created by cybex on 2017/07/13.
 */

@Entity
@Table(name = "staff")
public class Staff extends User {

    private Boolean kitchenStaffStatus = true;

    private String loginAlias = "";

    public static Finder<String, Staff> find = new Finder<String, Staff>(Staff.class);

    public Staff() {
        super();
    }

    public Staff(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber, @Constraints.Required Boolean bKitchenStaff, String alias) {
        super(userId, name, surname, password, email, cellNumber);
        this.kitchenStaffStatus = bKitchenStaff;
        this.loginAlias = alias;
    }

    @Override
    public boolean equals(Object obj) {
        Staff s = (Staff) obj;
        return super.equals(obj) &&
                s.kitchenStaffStatus.equals(kitchenStaffStatus);
    }

    @Override
    public String toString() {
        return super.toString() + " [ " + (kitchenStaffStatus ? "Kitchen" : "Delivery") + " ]";
    }

    public static boolean Authenticate(String id, String token, boolean isKitchenStaff) {
        Optional<Staff> staff = Staff.find.query().where()
                .idEq(id).and()
                .eq("token", token)
                .eq("is_kitchen_staff", isKitchenStaff)
                .findOneOrEmpty();
        return staff.isPresent();
    }

    public void fill(Staff staff) {
        super.fill(staff);
        if (this.kitchenStaffStatus != staff.kitchenStaffStatus)
            this.kitchenStaffStatus = staff.kitchenStaffStatus;
        if (!this.loginAlias.equals(staff.loginAlias))
            this.loginAlias = staff.loginAlias;
        if (!this.getPassword().equals(staff.getPassword())) {
            this.setPassword(staff.getPassword());
        }
    }

    public boolean getDeliveryStaff(){
        return !kitchenStaffStatus;
    }

    public String getLoginAlias() {
        return loginAlias;
    }

    public void setLoginAlias(String loginAlias) {
        this.loginAlias = loginAlias;
    }

    public Boolean getKitchenStaffStatus() {
        return kitchenStaffStatus;
    }

    public void setKitchenStaffStatus(Boolean kitchenStaffStatus) {
        this.kitchenStaffStatus = kitchenStaffStatus;
    }
}
