package envelopeBudget.data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class envelope {
    private String name;
    private String description;
    private int budgetted;
    private Calendar date;

    public envelope(String name, String description, int budgetted, Date year_month) {
        this.name = name;
        this.description = description;
        this.budgetted = budgetted;
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

    public int getBudgetted() {
        return budgetted;
    }

    public void setBudgetted(int budgetted) {
        this.budgetted = budgetted;
    }

    public String ID() {
        String output = "";
        output += date.get(Calendar.YEAR);
        output += date.get(Calendar.MONTH);
        output += this.name;
        return output;
    }
}
