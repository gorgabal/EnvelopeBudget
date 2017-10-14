package data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EnvelopeMonth {
    public Integer month; // 0-11
    public Integer year; // YYYY

    public EnvelopeMonth(int year, int month) {
        this.month = month;
        this.year = year;
    }

    /**
     * creates a new envelopeMonth with the current year and month
     */
    public EnvelopeMonth() {
        Calendar cal = new GregorianCalendar();
        this.month = cal.get(Calendar.MONTH);
        this.year = cal.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        String result = "";
        result += year.toString();
        result += month.toString();
        return result;
    }

    public Date toDate() {
        return new Date(toCalendar().getTimeInMillis());
    }

    public Calendar toCalendar() {
        return new GregorianCalendar(year, month, 1);
    }
}
