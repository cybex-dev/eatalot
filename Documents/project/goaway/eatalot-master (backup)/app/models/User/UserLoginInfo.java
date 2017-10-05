package models.User;


import play.data.validation.Constraints;
import javax.validation.constraints.Pattern;

/**
 * Created by cybex on 2017/07/24.
 */
public class UserLoginInfo {

    @Constraints.Required
//    @Pattern(regexp = ".+[@].+[.].+", message = "Please check your email address")
    @Constraints.Email
    private String email;

    @Constraints.Required
    @Constraints.MinLength(message = "Minimum length is 8", value = 8)
    @Pattern(regexp = "(\\S){8,}", message = "password.require_length")
    private String password;

    private Boolean bRememberMe = Boolean.FALSE;

    public UserLoginInfo(){}

    public UserLoginInfo(String email, String password, Boolean bRememberMe) {
        this.email = email;
        this.password = password;
        this.bRememberMe = bRememberMe;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getbRememberMe() {
        return bRememberMe;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setbRememberMe(Boolean bRememberMe) {
        this.bRememberMe = bRememberMe;
    }
}
