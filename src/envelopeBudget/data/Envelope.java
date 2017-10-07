package envelopeBudget.data;

import com.intellij.vcs.log.Hash;

import java.util.HashMap;
import java.util.Map;

public class Envelope {

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

    public int getBudget(int year, int month) {
        EnvelopeMonth enMonth = new EnvelopeMonth(year, month);
        return budgetted.get(enMonth.toString());
    }

    public void setBudget(EnvelopeMonth enMonth, int budget) {
        budgetted.put(enMonth.toString(), budget);
    }

    public String toString() {
        throw new UnsupportedOperationException("not yet implemented!"); //todo
    }
}
