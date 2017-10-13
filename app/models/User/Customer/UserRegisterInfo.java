package models.User.Customer;

import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import javax.validation.constraints.Pattern;

public class UserRegisterInfo implements Constraints.Validatable<ValidationError> {

    @Constraints.Required
    @Constraints.Email
//    @Pattern(regexp=".+[@].+[.].+", message="Invalid loginId address!")
    private String loginId;
    @Constraints.Required
    @Constraints.MinLength(8)
    @Pattern(regexp = "[\\S]{8,}", message = "Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password;
    //    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String confirmPassword;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean match() {
        return (password.equals(confirmPassword));
    }

    //https://www.playframework.com/documentation/2.6.x/JavaForms#partial-form-validation-via-groups
    @Override
    public ValidationError validate() {
        if (!password.equals(confirmPassword))
            return new ValidationError("confirmPassword", "Passwords do not match");
        String p = password;
        p = p.replace("[^a-z]", "");
        if (p.length() == 0)
            return new ValidationError("password", "Password requires atleast 1 upper case letter");
        p = p.replace("[^A-Z]", "");
        if (p.length() == 0)
            return new ValidationError("password", "Password requires atleast 1 special character, e.g. !,@,#,$,etc");
        return null;
    }
}
