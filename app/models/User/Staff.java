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

    private Boolean isKitchenStaff;

    private String alias;

    public static Finder<String, Staff> find = new Finder<String, Staff>(Staff.class);

    public Staff(){
        super();
    }

    public Staff(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber, @Constraints.Required Boolean isKitchenStaff, String alias) {
        super(userId, name, surname, password, email, cellNumber);
        this.isKitchenStaff = isKitchenStaff;
        this.alias = alias;
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

    public boolean isDeliveryStaff() {
        return !isKitchenStaff;
    }

    public Boolean getKitchenStaff() {
        return isKitchenStaff;
    }

    public String getAlias() {
        return alias;
    }

    public static boolean Authenticate(String id, String token, boolean isKitchenStaff) {
        Optional<Staff> staff = Staff.find.query().where()
                .idEq(id).and()
                .eq("token", token)
                .eq("is_kitchen_staff", isKitchenStaff)
                .findOneOrEmpty();
        return staff.isPresent();
    }

    public void setKitchenStaff(Boolean kitchenStaff) {
        isKitchenStaff = kitchenStaff;
    }

    public void setAlias(String alias) {
        this.alias = alias;
        save();
    }

    public void fill(Staff staff){
        super.fill(staff);
        if (this.isKitchenStaff != staff.isKitchenStaff)
            this.isKitchenStaff = staff.isKitchenStaff;
        if (!this.alias.equals(staff.alias))
            this.alias = staff.alias;
        if (!this.getPassword().equals(staff.getPassword())) {
            this.setPassword(staff.getPassword());
        }
    }

}
