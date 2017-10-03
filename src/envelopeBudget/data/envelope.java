package envelopeBudget.data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class envelope {
    private String name;
    private String description;
    private int budgeted;
    private Calendar date;

    public envelope(String name, String description, int budgeted, Date year_month) {
        this.name = name;
        this.description = description;
        this.budgeted = budgeted;
        this.date = new GregorianCalendar();
        this.date.setTime(year_month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBudgeted() {
        return budgeted;
    }

    public void setBudgeted(int budgeted) {
        this.budgeted = budgeted;
    }

    public String ID() {
        String output = "";
        output += date.get(Calendar.YEAR);
        output += date.get(Calendar.MONTH);
        output += this.name;
        return output;
    }

    public int getMonth() {
        return date.get(Calendar.MONTH);
    }

    public int getYear() {
        return date.get(Calendar.YEAR);
    }

    public String toString() {
        String result = this.ID() + " " + this.getBudgeted();
        return result;
    }
}
