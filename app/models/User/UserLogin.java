package models.User;

/**
 * Created by cybex on 2017/07/24.
 */
public class UserLogin {
    private String email;
    private String password;

    public UserLogin(){}

    public UserLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
