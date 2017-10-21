package models.User;

import io.ebean.Finder;
import io.ebean.Model;
import models.User.Customer.Customer;
import play.data.validation.Constraints;
import utility.IdGenerator;
import utility.RandomString;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Pattern;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by cybex on 2017/07/08.
 */

@MappedSuperclass
public abstract class User extends Model {

    @Id
    private String userId;

    private String name;

    private String surname;

    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password;

    @Pattern(regexp="[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message="Invalid email address!")
    private String email;

    @Pattern( regexp = "[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message = "Invalid cellphone number, use format 0XX-XXX-XXXX")
    private String cellNumber;

    private String token;

    private Boolean isActive;

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public User(){
        userId = IdGenerator.generate();
    }



    public User( @Constraints.Required String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.cellNumber = cellNumber;
    }

    public boolean completeCheck(){
        return (getName() != null &&
                !getName().equals("") &&
                getSurname() != null &&
                !getSurname().equals("") &&
                getCellNumber() != null &&
                !getCellNumber().equals(""));
    }

    //// TODO: 2017/08/14
    public boolean isSafePassword(){
        return true;
    }

    /**
     * Deep comparison on user object. Ignores userId field
     * @param obj user object to compare
     * @return true if object data is equal
     */
    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        return (u.userId.equals(userId) &&
                u.cellNumber.equals(cellNumber) &&
                u.surname.equals(surname) &&
                u.name.equals(name) &&
                u.email.equals(email));
    }

    public void setToken(String token) {
        this.token = token;
            save();
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(surname).append(", ").append(name).append(" {").append(email);
        stringBuilder.append("} - ");
        return stringBuilder.toString();
    }

    public String getUserId() {
        return String.valueOf(userId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        save();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        save();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        save();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        save();
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
        save();
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void fill(User user) {
        if (!this.name.equals(user.name))
            this.name = user.name;
        if (!this.surname.equals(user.surname))
            this.surname = user.surname;
        if (!this.cellNumber.equals(user.cellNumber))
            this.cellNumber = user.cellNumber;
        if (!this.email.equals(user.email))
            this.email = user.email;
        if (this.isActive != user.isActive)
            this.isActive = user.isActive;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}