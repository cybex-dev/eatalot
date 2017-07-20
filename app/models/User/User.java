package models.User;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by cybex on 2017/07/08.
 */

@Entity
public class User extends Model {

    @Id
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    private String userId;

    private String name;
    private String surname;

    @Constraints.Required
    private String password;

    @Constraints.Email
    @Constraints.Required
    private String email;

    @Constraints.Required
    @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}")
    private String cellNumber;
    private Boolean emailVerified = false;

    private String CRSFToken;

    public static Finder<String, User> find = new Finder<String, User>(User.class);
    private String token;

    public User(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber, Boolean emailVerified) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.cellNumber = cellNumber;
        this.emailVerified = emailVerified;
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
                u.email.equals(email) &&
                u.emailVerified.equals(emailVerified));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(surname).append(", ").append(name).append(" {").append(email);
        if (!emailVerified)
            stringBuilder.append("*");
        stringBuilder.append("} - ");
        return stringBuilder.toString();
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getCRSFToken() {
        return CRSFToken;
    }
}