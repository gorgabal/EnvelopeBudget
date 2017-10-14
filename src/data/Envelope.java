package data;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Envelope {

    public static Envelope noBudget = new Envelope("No Budget", "Envelope for transactionts without a budget");
    public String name;
    public String description;
    private Map<String, Integer> budgetted = new HashMap<>(); //YYYYMM
    private Map<String, BudgetGoal> budgetGoals = new HashMap<>(); //YYYYMM

    public Envelope(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BudgetGoal getBudgetGoal(EnvelopeMonth month) {
        return budgetGoals.get(month.toString());
        //todo if current goal does not exist, look back in the previous months and return that.
    }

    public void setBudgetGoal(EnvelopeMonth date, int amount, EnvelopeMonth targetDate, BudgetGoal.budgetType type) {
        BudgetGoal budgetgoal = new BudgetGoal();
        budgetgoal.amount = amount;
        budgetgoal.month = targetDate;
        budgetgoal.budgettype = type;
        budgetGoals.put(date.toString(), budgetgoal);
    }

    /**
     * get ammount of money budgetted for specified month
     *
     * @param year  the relevant year
     * @param month the relevant month
     * @return int in cents. 100 = 1 euro.
     */
    public int getBudget(int year, int month) {
        EnvelopeMonth enMonth = new EnvelopeMonth(year, month);
        return getBudget(enMonth);
    }

    public int getBudget(EnvelopeMonth enMonth) {
        return budgetted.get(enMonth.toString());
    }

    /**
     * Gets all money budgetted.
     *
     * @return all money budgetted in space and time
     */
    public int totalBudget() {
        Calendar cal = new GregorianCalendar();
        EnvelopeMonth month = new EnvelopeMonth(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH));
        return totalBudget(month);
    }

    /**
     * Gets all money budgetted until certain date
     *
     * @return all money budgetted untill a certain date
     */
    public int totalBudget(EnvelopeMonth month) {
        throw new UnsupportedOperationException(); //todo
    }
    public void setBudget(EnvelopeMonth enMonth, int budget) {
        budgetted.put(enMonth.toString(), budget);
    }

    public String toString() {
        throw new UnsupportedOperationException("not yet implemented!"); //todo
    }
}
