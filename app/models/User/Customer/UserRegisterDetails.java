package models.User.Customer;

import models.User.Address;
import models.User.Customer.Customer;
import play.data.validation.Constraints.Required;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

public class UserRegisterDetails {
    private String userId;
    @Required
    private String name;
    @Required
    private String surname;
    @Required
    @Pattern(regexp="[0]\\d{2}[- ]{0,1}\\d{3}[- ]{0,1}\\d{4}", message="error.cellphone_format")
    private String cellNumber;
    @Required
    private String unitNumber;
    @Required
    private String streetName;
    private String communityName;


    private Boolean isCommunity = Boolean.FALSE;

    public UserRegisterDetails() {
    }

    public UserRegisterDetails(String userId, String name, String surname, String mobile, String unitNumber, String streetName, String communityName, Boolean isCommunity) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.cellNumber = mobile;
        this.unitNumber = unitNumber;
        this.streetName = streetName;
        this.communityName = communityName;
        this.isCommunity = isCommunity;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public Boolean isCommunity() {
        return isCommunity;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCellNumber(String mobile) {
        this.cellNumber = mobile;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void setIsCommunity(Boolean isCommunity) {
        this.isCommunity = isCommunity;
    }

    public Boolean getIsCommunity() {
        return isCommunity;
    }

    public static Map<String, String> buildMap(Customer customer, Address address) {
        HashMap<String, String> map = new HashMap<>();
        if (customer != null) {
            map.put("userId", customer.getUserId());
            map.put("name", customer.getName() != null ? customer.getName() : "");
            map.put("surname", customer.getSurname() != null ? customer.getSurname() : "");
            map.put("cellNumber", customer.getCellNumber() != null ? customer.getCellNumber() : "");
            if (address != null) {
                map.put("unitNumber", address.getUnitNumber() != null ? address.getUnitNumber() : "");
                map.put("streetName", address.getStreetName() != null ? address.getStreetName() : "");
                map.put("communityName", address.getCommunityName() != null ? address.getCommunityName() : "");
                map.put("isCommunity", String.valueOf(address.isCommunity()));
            }
        }
        return map;
    }
}
