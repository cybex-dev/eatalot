package models.User;

import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.MappedSuperclass;

/**
 * Created by cybex on 2017/07/08.
 */

@MappedSuperclass
public class Customer extends User {

    private String userId;

    @Constraints.Required
    private Address address;
    private Boolean isStudent = false;

    public Customer(String userId, String name, String surname, String email, String cellNumber, String password, String userId1, @Constraints.Required Address address, Boolean isStudent) {
        super(userId, name, surname, email, cellNumber, password, false);
        this.userId = userId1;
        this.address = address;
        this.isStudent = isStudent;
    }

    public static final Finder<String, Customer> find = new Finder<String, Customer>(Customer.class);

    /**
     * Deep comparison with customer object. Ignores userId check.
     * @param obj customer object to compare
     * @return true if all data equates
     */
    @Override
    public boolean equals(Object obj) {
        Customer c = (Customer) obj;
        return (super.equals(obj) &&
                c.isStudent.equals(isStudent) &&
                c.address.equals(address));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isStudent)
            stringBuilder.append("[S]");
        stringBuilder.append(super.toString()).append(" | ").append(address.toString()).append(" |");
        return stringBuilder.toString();
    }
}
