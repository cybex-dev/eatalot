package models.User;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by cybex on 2017/07/13.
 */

// TODO: 2017/07/13 Add fields for suburb and city for larger projects
@Entity
public class Address extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String addressId;
    @Constraints.Required
    private String unitNumber;
    @Constraints.Required
    private String streetName;
    private String communityName;
    private Boolean isCommunity;

    public Address(@Constraints.Required String addressId, @Constraints.Required String unitNumber, @Constraints.Required String streetName, String communityName, Boolean isCommunity) {
        this.addressId = addressId;
        this.unitNumber = unitNumber;
        this.streetName = streetName;
        this.communityName = communityName;
        this.isCommunity = isCommunity;
    }

    public static Finder<String, Address> find = new Finder<String, Address>(Address.class);

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
}
