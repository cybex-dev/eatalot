package models.User;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import static controllers.Application.AppTags.*;
import static controllers.Application.AppTags.Database.*;

/**
 * Created by cybex on 2017/07/08.
 */

@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)           // Gives a error [ Error injecting constructor, java.lang.NullPointerException ]
public abstract class User extends Model {

    @Id
    @Constraints.Required
    @Constraints.MinLength(10)
    @Constraints.MaxLength(10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    @Constraints.MaxLength(50)
    private String name;

    @Constraints.MaxLength(100)
    private String surname;

    @Constraints.Required
    @Constraints.MinLength(8)
    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password;

    @Constraints.Email
    @Constraints.Required
    @Pattern(regexp="[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message="Invalid email address!")
    private String email;

    @Constraints.MaxLength(10)
    @Constraints.MinLength(10)
    @Pattern( regexp = "[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message = "Invalid cellphone number, use format 0XX-XXX-XXXX")
    private String cellNumber;

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public User(){}

    public User(@Constraints.MinLength(10) @Constraints.MaxLength(10) String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.cellNumber = cellNumber;
    }

    public boolean completeCheck(){
        return (name != null &&
                !name.equals("") &&
                surname != null &&
                !surname.equals("") &&
                cellNumber != null &&
                !cellNumber.equals(""));
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(surname).append(", ").append(name).append(" {").append(email);
        stringBuilder.append("} - ");
        return stringBuilder.toString();
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

}