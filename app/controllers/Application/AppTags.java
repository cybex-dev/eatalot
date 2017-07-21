package controllers.Application;

/**
 * Created by cybex on 2017/07/16.
 */
public enum AppTags {

    SITENAME("EatAloT"),
    SITEURL("https://localhost/"),
    SITEDOMAIN("localhost");

    private String string;

    AppTags(String s) {
        this.string = s;
    }

    @Override
    public String toString() {
        return string;
    }
}
