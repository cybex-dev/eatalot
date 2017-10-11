package models.User.Admin;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "admin")
public class Admin extends Model {

    @Id
    @Constraints.Required
    private String adminId;
    @Constraints.Required
    private String alias;
    @Constraints.Required
    private String password;
    @Constraints.Required
    private String token;

    public static Finder<String, Admin> find = new Finder<String, Admin>(Admin.class);

    public Admin(@Constraints.Required String adminId, @Constraints.Required String alias, @Constraints.Required String password, @Constraints.Required String token) {
        this.adminId = adminId;
        this.alias = alias;
        this.password = password;
        this.token = token;
    }

    public void setToken(@Constraints.Required String token) {
        this.token = token;
        save();
    }

    public String getAdminId() {
        return adminId;
    }

    @Override
    public void insert() {
        adminId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public String getAlias() {
        return alias;
    }
}
