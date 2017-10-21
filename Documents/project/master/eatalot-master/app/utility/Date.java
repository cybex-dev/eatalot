package utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by dylan on 2017/10/14.
 */
public class Date {

    public static java.util.Date readDate(String tbr) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date;
        return format.parse(tbr);
    }

    public static java.util.Date readTime(String tbr) throws ParseException {
        DateFormat format = new SimpleDateFormat("hh-MM");
        java.util.Date time;
        return format.parse(tbr);
    }

    public static java.util.Date readDateTime(String tbr) throws ParseException {
        DateFormat format = new SimpleDateFormat("hh-MM-dd-MM-yyyy");
        java.util.Date datetime;
        return format.parse(tbr);
    }
}
