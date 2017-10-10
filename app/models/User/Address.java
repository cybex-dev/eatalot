package models.User;

import controllers.Application.AppTags;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import scala.App;
import utility.RandomString;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by cybex on 2017/07/13.
 */

// TODO: 2017/07/13 Add fields for suburb and city for larger projects
@Entity
public class Address extends Model {

    @Id
    @Constraints.Required
    private String addressId;

    @Constraints.Required
    private String unitNumber;
    @Constraints.Required
    private String streetName;
    private String communityName = "";
    private Boolean isCommunity = Boolean.FALSE;

    public Address(){}

    public Address(@Constraints.Required String addressId, @Constraints.Required String unitNumber, @Constraints.Required String streetName, String communityName, Boolean isCommunity) {
        this.addressId = addressId;
        this.unitNumber = unitNumber;
        this.streetName = streetName;
        this.communityName = communityName;
        this.isCommunity = isCommunity;
    }

    public static Finder<String, Address> find = new Finder<String, Address>(Address.class);

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Boolean isCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(Boolean community) {
        isCommunity = community;
    }

    public boolean isComplete(){
        return ((addressId != null) &&
                streetName != null &&
                !streetName.equals("") &&
                unitNumber != null &&
                !unitNumber.equals("") &&
                ((!isCommunity) || (communityName != null && !communityName.equals(""))));
    }

    /**
     * Compares current address data to parameter address data. Ignores addressId comparison.
     * @param obj address to compare to
     * @return true if address data matches
     */
    @Override
    public boolean equals(Object obj) {
        Address a = (Address) obj;
        return (a.communityName.equals(communityName) &&
                a.streetName.equals(streetName) &&
                a.unitNumber.equals(unitNumber) &&
                a.isCommunity.equals(isCommunity));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unit: ").append(unitNumber);
        if (isCommunity)
            stringBuilder.append(" Community: ").append(communityName).append(", ");
        stringBuilder.append("Street: ").append(streetName);
        return stringBuilder.toString();
    }

    public String getAddressId() {
        return String.valueOf(addressId);
    }

    @Override
    public void insert() {
        addressId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }
}
