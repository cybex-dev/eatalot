package utility;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User.Customer.Customer;
import models.User.Customer.DashboardEntries;
import play.api.mvc.Call;
import play.libs.Json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardButton {
    public String largeText = "###",
            smallText = "###";
    public Call link = new Call("#", "#", "#");
    public String cssClassMainImage = "fa-history",
            cssClassSecondaryImage = "fa-dollar",
            cssClassButtonColour = "alert-info";


    public DashboardButton(){}

    public DashboardButton(String largeText, String smallText, Call link) {
        this.largeText = largeText;
        this.smallText = smallText;
        this.link = link;
    }

    public DashboardButton(String largeText, String smallText, Call link, String cssClassMainImage, String cssClassSecondaryImage, String cssClassButtonColour) {
        this.largeText = largeText;
        this.smallText = smallText;
        this.link = link;
        this.cssClassButtonColour = cssClassButtonColour;
        this.cssClassMainImage = cssClassMainImage;
        this.cssClassSecondaryImage = cssClassSecondaryImage;
    }

    public static ArrayNode dashbuttonJsonMap(String s0, String s1, String s2, String s3) {
        ArrayNode dashButtonArray = Json.newArray();
        ObjectNode dashButton0 = Json.newObject().put("dashButton0", s0);
        ObjectNode dashButton1 = Json.newObject().put("dashButton1", s1);
        ObjectNode dashButton2 = Json.newObject().put("dashButton2", s2);
        ObjectNode dashButton3 = Json.newObject().put("dashButton3", s3);
        dashButtonArray.add(dashButton0);
        dashButtonArray.add(dashButton1);
        dashButtonArray.add(dashButton2);
        dashButtonArray.add(dashButton3);
        return dashButtonArray;
    }
}
