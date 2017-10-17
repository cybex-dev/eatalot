package utility;

import play.api.mvc.Call;

import java.util.HashMap;
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

    public static Map<String, String> dashbuttonJsonMap(String s0, String s1, String s2, String s3) {
        Map<String, String> map = new HashMap<>();
        map.put("dashButton0", s0);
        map.put("dashButton1", s1);
        map.put("dashButton2", s2);
        map.put("dashButton3", s3);
        return map;
    }
}
