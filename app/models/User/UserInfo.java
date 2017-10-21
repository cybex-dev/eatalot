package models.User;

public class UserInfo {
    public String userId, name, surname, email;

    public UserInfo() {

    }

    public UserInfo(String userId, String name, String surname, String email) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
