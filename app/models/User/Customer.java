package models.User;

import com.sun.org.apache.xpath.internal.operations.Bool;
import controllers.Application.AppTags;
import io.ebean.Finder;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Customer extends User {

    private Long addressId;
    private Boolean isStudent = false;
    private Boolean emailVerified = false;
    @Constraints.Required
    private String token;

    public Customer(){}

    public Customer(Long userId, String name, String surname, String email, String cellNumber, String password, Long addressId, Boolean isStudent, Boolean emailVerified) {
        super(userId, name, surname, email, cellNumber, password);
        this.addressId = addressId;
        this.isStudent = isStudent;
        this.emailVerified = emailVerified;
    }

    public static final Finder<Long, Customer> find = new Finder<Long, Customer>(Customer.class);

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getToken() {
        return token;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long address) {
        this.addressId = address;
    }

    public Address getAddress(){
        return Address.find.byId(addressId);
    }

    public Boolean isStudent() {
        return this.isStudent;
    }

    public void setStudent(Boolean status) {
        this.isStudent = status;
    }

    /**
     * Checks all values of the Customer, returns true if the user's profile is complete
     * @return
     */
    public boolean isComplete(){
        return (super.isComplete() &&
                emailVerified &&
                Address.find.byId(addressId).isComplete());
    }

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
                c.addressId.equals(addressId));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isStudent)
            stringBuilder.append("[S]");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    public boolean isVerified() {
        return emailVerified;
    }
}
