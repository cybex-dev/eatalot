package utility;

import java.util.Calendar;
import java.util.Date;

public class DateInterpreter {
    private Date date;
    private Calendar calendar;

    public DateInterpreter(Date date) {
        this.date = date;
        calendar = Calendar.getInstance();
        calendar.setTime(date);
    }

    public Integer getHour(){
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public Integer getMinute(){
        return calendar.get(Calendar.MINUTE);
    }

    public Integer getYear(){
        return calendar.get(Calendar.YEAR);
    }

    public Integer getMonth(){
        return calendar.get(Calendar.MONTH);
    }

    public Integer getDay(){
        return calendar.get(Calendar.DATE);
    }

    public int getWeekDay(){
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public String getWeekDayName(){
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case Calendar.MONDAY: return "Monday";
            case Calendar.TUESDAY: return "Tuesday";
            case Calendar.WEDNESDAY: return "Wednesday";
            case Calendar.THURSDAY: return "Thursday";
            case Calendar.FRIDAY: return "Friday";
            case Calendar.SATURDAY: return "Saturday";
            case Calendar.SUNDAY: return "Sunday";
        }
        return "";
    }

    public String getDateWithDayName(){
        return String.format("%d-%d-%d, %s", getYear(), getMonth(), getDay(), getWeekDay());
    }

    public String getDate(){
        return String.format("%d-%d-%d", getYear(), getMonth(), getDay());
    }

    public String getTime(){
        return String.format("%dh%d", getHour(), getMinute());
    }

    public boolean isToday() {
        DateInterpreter dateInterpreter = new DateInterpreter(new Date());
        return (getDate().equals(dateInterpreter.getDate()));
    }


}


