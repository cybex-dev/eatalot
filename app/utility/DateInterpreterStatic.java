package utility;

import java.util.Calendar;
import java.util.Date;

public class DateInterpreterStatic {

    private static Calendar getCalender(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Integer getHour(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static Integer getMinute(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.MINUTE);
    }

    public static Integer getYear(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.YEAR);
    }

    public static Integer getMonth(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.MONTH);
    }

    public static Integer getDay(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.DATE);
    }

    public static int getWeekDay(Date date){
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static String getWeekDayName(Date date){
        Calendar calendar = getCalender(date);
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY: return "Sunday";
            case Calendar.MONDAY: return "Monday";
            case Calendar.TUESDAY: return "Tuesday";
            case Calendar.WEDNESDAY: return "Wednesday";
            case Calendar.THURSDAY: return "Thursday";
            case Calendar.FRIDAY: return "Friday";
            case Calendar.SATURDAY: return "Saturday";
        }
        return "";
    }

    public static String getDateWithDayName(Date date){
        return String.format("%d-%d-%d, %s", getYear(date), getMonth(date), getDay(date), getWeekDay(date));
    }

    public static String getDate(Date date){
        return String.format("%d-%d-%d", getYear(date), getMonth(date), getDay(date));
    }

    public static String getTime(Date date){
        return String.format("%dh%d", getHour(date), getMinute(date));
    }

    public static boolean isToday(Date date) {
        return (getDate(date).equals(DateInterpreterStatic.getDate(new Date())));
    }
}
