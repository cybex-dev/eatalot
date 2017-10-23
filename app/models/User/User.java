package models.User;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.IdGenerator;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Pattern;

/**
 * Created by cybex on 2017/07/08.
 */

@MappedSuperclass
public abstract class User extends Model {

    @Id
    private String userId;

    private String name = "";

    private String surname = "";

//    @Pattern(regexp = "[\\S]{8,}", message = "Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password = "";

//    @Pattern(regexp = "[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message = "Invalid email address!")
    private String email = "";

    //@Pattern(regexp = "[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message = "Invalid cellphone number, use format 0XX-XXX-XXXX")
    private String cellNumber = "";

    private String token = "";

    private Boolean accountActive = false;

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public User() {
    }

    public void generateId() {
        userId = IdGenerator.generate();
    }


    public User(@Constraints.Required String userId, String name, String surname, @Constraints.Required String password, @Constraints.Email @Constraints.Required String email, @Constraints.Required @Constraints.Pattern("[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}") String cellNumber) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.cellNumber = cellNumber;
    }

    public boolean completeCheck() {
        return (getName() != null &&
                !getName().equals("") &&
                getSurname() != null &&
                !getSurname().equals("") &&
                getCellNumber() != null &&
                !getCellNumber().equals(""));
    }

    /**
     * Deep comparison on user object. Ignores userId field
     *
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

    public void fill(User user) {
        if (!this.name.equals(user.name))
            this.name = user.name;
        if (!this.surname.equals(user.surname))
            this.surname = user.surname;
        if (!this.cellNumber.equals(user.cellNumber))
            this.cellNumber = user.cellNumber;
        if (!this.email.equals(user.email))
            this.email = user.email;
        if (this.accountActive != user.accountActive)
            this.accountActive = user.accountActive;
        if (this.password.isEmpty())
            this.setPassword(user.password);
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getAccountActive() {
        return accountActive;
    }

    public void setAccountActive(Boolean accountActive) {
        this.accountActive = accountActive;
    }
}