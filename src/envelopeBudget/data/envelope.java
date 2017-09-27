package envelopeBudget.data;

import java.util.Date;

public class envelope {
    private String name;
    private String description;
    private Date month;
    private int budgetted;

    public envelope(String name, String description, Date month, int budgetted) {
        this.name = name;
        this.description = description;
        this.month = month;
        this.budgetted = budgetted;
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

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public int getBudgetted() {
        return budgetted;
    }

    public void setBudgetted(int budgetted) {
        this.budgetted = budgetted;
    }
}
