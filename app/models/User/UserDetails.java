package models.User;

import models.User.Customer.Address;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import java.util.HashMap;
import java.util.Map;

public class UserDetails implements Constraints.Validatable<ValidationError> {
    private String userId;
    private String name;
    private String surname;
    private String cellNumber;
    private String unitNumber;
    private String streetName;
    private String communityName;


    private Boolean isCommunity = Boolean.FALSE;

    public UserDetails() {
    }

    public UserDetails(String userId, String name, String surname, String mobile) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.cellNumber = mobile;
    }

    public UserDetails(String userId, String name, String surname, String mobile, String unitNumber, String streetName, String communityName, Boolean isCommunity) {
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

    public static Map<String, String> buildMap(User user) {
        HashMap<String, String> map = new HashMap<>();
        if (user != null) {
            map.put("userId", user.getUserId());
            map.put("name", user.getName() != null ? user.getName() : "");
            map.put("surname", user.getSurname() != null ? user.getSurname() : "");
            map.put("cellNumber", user.getCellNumber() != null ? user.getCellNumber() : "");
        }
        if (user instanceof Staff) {
            Staff s = (Staff) user;
            map.put("alias", s.getAlias() != null ? s.getAlias() : "");
        }
        return map;
    }

    public static Map<String, String> buildMap(User user, Address address) {
        HashMap<String, String> map = new HashMap<>();
        if (user != null) {
            map.put("userId", user.getUserId());
            map.put("name", user.getName() != null ? user.getName() : "");
            map.put("surname", user.getSurname() != null ? user.getSurname() : "");
            map.put("cellNumber", user.getCellNumber() != null ? user.getCellNumber() : "");
            if (address != null) {
                map.put("unitNumber", address.getUnitNumber() != null ? address.getUnitNumber() : "");
                map.put("streetName", address.getStreetName() != null ? address.getStreetName() : "");
                map.put("communityName", address.getCommunityName() != null ? address.getCommunityName() : "");
                map.put("isCommunity", String.valueOf(address.isCommunity()));
            }
        }
        return map;
    }

    @Override
    public ValidationError validate() {
        if (isCommunity && !communityName.isEmpty()) {
            return new ValidationError("communityName", "Community/Complex name required");
        }
        return null;
    }
}
