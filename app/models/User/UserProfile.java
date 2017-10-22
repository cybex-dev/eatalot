package models.User;

import controllers.Application.AppTags;
import libs.Mailer;
import models.User.Admin.Admin;
import models.User.Customer.Address;
import models.User.Customer.Customer;
import play.Logger;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.io.Serializable;
import java.util.Date;

/**
 * Class used to edit user profile
 */

public class UserProfile extends UserDetails implements Serializable, Constraints.Validatable<ValidationError> {

//    @Constraints.MinLength(8)
//    @Constraints.Required
//    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String password;
    //    @Constraints.MinLength(8)
//    @Constraints.Required
//    @Pattern(regexp="[\\S]{8,}", message="Check password length, minimum length of 8\nCheck that no spaces are used")
    private String confirmPassword;

    private String alias;

    public UserProfile() {
    }

    public UserProfile(String userId, String name, String surname, String mobile, String unitNumber, String streetName, String communityName, Boolean isCommunity, @Constraints.Min(8) @Constraints.Required String password, @Constraints.Min(8) @Constraints.Required String confirmPassword) {
        super(userId, name, surname, mobile, unitNumber, streetName, communityName, isCommunity);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserProfile(String userId, AppTags.AppCookie.UserType userType) {
        super.setUserId(userId);
        fill(userId, userType);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void fill(String userId, AppTags.AppCookie.UserType userType) {
        switch (userType) {
            case ADMIN: {
                setUserId(userId);
                Admin admin = Admin.find.byId(userId);
                if (admin == null)
                    return;
                setPassword(admin.getPassword());
                confirmPassword = admin.getPassword();
                break;
            }
            case CUSTOMER: {
                try {
                    Customer c = Customer.find.byId(userId);
                    if (c == null)
                        return;
                    Address a = c.getAddress();
                    if (a == null)
                        return;
                    c.setComplete(false);
                    setUserId(userId);
                    setName(c.getName());
                    setSurname(c.getSurname());
                    setCellNumber(c.getCellNumber());
                    setPassword(c.getPassword());
                    confirmPassword = c.getPassword();
                    super.setCommunityName(a.getCommunityName());
                    super.setStreetName(a.getStreetName());
                    super.setUnitNumber(a.getUnitNumber());
                    super.setIsCommunity(a.isCommunity());
                } catch (Exception x) {
                    Logger.warn(x.toString());
                    return;
                }
                break;
            }
            case DELIVERY:
            case KITCHEN: {
                Staff staff = Staff.find.byId(userId);
                if (staff == null)
                    return;
                setUserId(userId);
                setName(staff.getName());
                setSurname(staff.getSurname());
                setCellNumber(staff.getCellNumber());
                setAlias(staff.getLoginAlias());
                setPassword(staff.getPassword());
                confirmPassword = staff.getPassword();
                break;
            }
        }
    }

    public void save(AppTags.AppCookie.UserType userType) {

        String id = super.getUserId();
        switch (userType) {
            case CUSTOMER: {
                Customer c = Customer.find.byId(id);
                if (c == null)
                    return;
                c.setName(getName());
                c.setSurname(getSurname());
                c.setCellNumber(getCellNumber());

                if (!passwordsEmpty() && !c.getPassword().equals(getPassword())) {
                    c.setPassword(getPassword());
                    Mailer.SendPasswordChange(c.getName().concat(" ").concat(getSurname()), c.getEmail(), new Date().toString().replace(':', '-').replace(' ', '_'));
                }

                Address a = c.getAddress();
                if (a == null)
                    return;
                a.setUnitNumber(getUnitNumber());
                a.setStreetName(getStreetName());
                a.setIsCommunity(isCommunity());
                a.setCommunityName(getCommunityName());

                a.update();
                c.update();
            }

            case KITCHEN:
            case DELIVERY: {
                Staff staff = Staff.find.byId(id);
                if (staff == null)
                    return;

                if (userType == AppTags.AppCookie.UserType.DELIVERY &&
                        staff.getKitchenStaffStatus())
                    return;
                staff.setName(getName());
                staff.setSurname(getSurname());
                staff.setCellNumber(getCellNumber());
                staff.setLoginAlias(getAlias());

                if (!passwordsEmpty() && !staff.getPassword().equals(getPassword())) {
                    staff.setPassword(getPassword());
                    Mailer.SendPasswordChange(staff.getName().concat(" ").concat(getSurname()), staff.getEmail(), new Date().toString().replace(':', '-').replace(' ', '_'));
                }

                staff.save();
            }

            case ADMIN: {
                Admin admin = Admin.find.byId(id);
                if (admin == null)
                    return;
                admin.setPassword(getPassword());
                admin.save();
            }
        }
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public boolean passwordsEmpty(){
        boolean pw = (password == null || password.isEmpty()),
                confPw = (confirmPassword== null || confirmPassword.isEmpty());
        return pw && confPw;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
