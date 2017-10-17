package utility;

import io.ebeaninternal.server.lib.util.Str;

/**
 * Created by dylan on 2017/10/14.
 */
public class SubmitOrderForm {
    private String day;
    private String month;
    private String year;
    private String time;
    private Boolean isCash;

    public SubmitOrderForm() {
    }

    public SubmitOrderForm(String day, String month, String year, String time, Boolean isCash) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.isCash = isCash;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getCash() {
        return isCash;
    }

    public void setCash(Boolean cash) {
        isCash = cash;
    }
}
