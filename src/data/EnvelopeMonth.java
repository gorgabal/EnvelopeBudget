package data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EnvelopeMonth {
    private Calendar cal;

    public EnvelopeMonth(int year, int month) {
        cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);
    }

    /**
     * creates a new envelopeMonth with the current year and month
     */
    public EnvelopeMonth() {
        cal = new GregorianCalendar();
    }

    public EnvelopeMonth(Calendar cal) {
        this.cal = cal;
    }

    public EnvelopeMonth(long time) {
        cal = new GregorianCalendar();
        cal.setTimeInMillis(time);
    }

    public Integer getMonth() {
        return cal.get(Calendar.MONTH);
    }

    public Integer getYear() {
        return cal.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        String result = "";
        result += getYear().toString();
        result += getMonth().toString();
        return result;
    }

    public Date toDate() {
        return new Date(toCalendar().getTimeInMillis());
    }

    public Calendar toCalendar() {
        return cal;
    }

    public void setPreviousMonth() {
        cal.add(Calendar.MONTH, -1);
    }

    public void setNextMonth() {
        cal.add(Calendar.MONTH, 1);
    }
}
