package utility;

import play.api.mvc.Call;

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
}
