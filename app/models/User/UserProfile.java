package models.User;

import models.User.Customer.Customer;
import models.User.Customer.UserRegisterDetails;
import play.Logger;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.io.Serializable;

/**
 * Class used to edit user profile
 */

public class UserProfile extends UserRegisterDetails implements Serializable, Constraints.Validatable<ValidationError> {

    // TODO: 2017/08/18 Add support for sectino updates and passowrd changes (with old password as test)
//    @Constraints.MinLength(8)
//    @Constraints.Required
//    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password;
//    @Constraints.MinLength(8)
//    @Constraints.Required
//    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String confirmPassword;

    public UserProfile(){}

    public UserProfile(String userId, String name, String surname, String mobile, String unitNumber, String streetName, String communityName, Boolean isCommunity, @Constraints.Min(8) @Constraints.Required String password, @Constraints.Min(8) @Constraints.Required String confirmPassword) {
        super(userId, name, surname, mobile, unitNumber, streetName, communityName, isCommunity);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserProfile(String userId) {
        get(userId);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void get(String userId) {
        if (userId == null)
            return;
        try {
            Customer c = Customer.find.byId(userId);
            if (c == null)
                return;
            Address a = Address.find.byId(c.getAddressId());
            if (a == null)
                return;
            setName(c.getName());
            setSurname(c.getSurname());
            setCellNumber(c.getCellNumber());
            setPassword(c.getPassword());
            super.setCommunityName(a.getCommunityName());
            super.setStreetName(a.getStreetName());
            super.setUnitNumber(a.getUnitNumber());
            super.setIsCommunity(a.isCommunity());
        }
        catch (Exception x){
            Logger.warn(x.toString());
            return;
        }
        return;
    }

    public void save() {
        // TODO: 2017/08/18 add support for passsword
        String id = getUserId();
        Customer c = Customer.find.byId(id);
        if (c == null)
            return;
        c.setName(getName());
        c.setSurname(getSurname());
        c.setCellNumber(getCellNumber());
        c.setPassword(getPassword());

        Address a = Address.find.byId(c.getAddressId());
        if (a == null)
            return;
        a.setUnitNumber(getUnitNumber());
        a.setStreetName(getStreetName());
        a.setIsCommunity(isCommunity());
        a.setCommunityName(getCommunityName());

        a.update();
        c.update();
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

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
