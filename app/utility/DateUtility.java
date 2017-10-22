package utility;

import io.ebeaninternal.server.lib.util.Str;
import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by dylan on 2017/10/14.
 */
public class  DateUtility {

    public static Date readDate(String tbr) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.parse(tbr);
    }

    public static Date readTime(String tbr) throws ParseException {
        DateFormat format = new SimpleDateFormat("hh-MM");
        return format.parse(tbr);
    }

    public static LocalDateTime readDateTime(String date, String time) throws ParseException {
        LocalDate localDate = LocalDate.parse(date);
        LocalTime localTime = LocalTime.parse(time);
        return LocalDateTime.of(localDate, localTime);
    }

    /**
     * Check if passed date is at least one hour after the current time.
     * @param tbv to be verified
     * @return
     */
    public static boolean verifyDate(LocalDateTime tbv){
        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date()); // sets calendar time/date
        cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
        Date date = cal.getTime(); // returns new date object, one hour in the future

        LocalDateTime cur = convertToLocalDateTime(date);

        return cur.compareTo(tbv) <= 0;
    }

    public static Date convertToDate(LocalDateTime tbc){
        Instant instant = tbc.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public static LocalDateTime convertToLocalDateTime(Date tbc){
        Instant instant = Instant.ofEpochMilli(tbc.getTime());
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
