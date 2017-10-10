package models.User;


import javax.validation.constraints.Pattern;

/**
 * Created by cybex on 2017/07/24.
 */
public class UserLoginInfo {

//    @Constraints.Required
//    @Pattern(regexp = ".+[@].+[.].+", message = "Please check your loginId address")
//    @Constraints.Email
    private String loginId;

//    @Constraints.Required
//    @Constraints.MinLength(message = "Minimum length is 8", value = 8)
    @Pattern(regexp = "(\\S){8,}", message = "password.require_length")
    private String password;

    private Boolean bRememberMe = Boolean.FALSE;

    public UserLoginInfo(){}

    public UserLoginInfo(String email, String password, Boolean bRememberMe) {
        this.loginId = email;
        this.password = password;
        this.bRememberMe = bRememberMe;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getRememberMe() {
        return bRememberMe;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRememberMe(Boolean bRememberMe) {
        this.bRememberMe = bRememberMe;
    }
}
