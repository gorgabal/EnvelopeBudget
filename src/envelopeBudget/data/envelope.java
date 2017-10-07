package envelopeBudget.data;

import com.intellij.ide.ui.EditorOptionsTopHitProvider;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

//todo make envelope class so that it contains the budgets for sereval dates, but only one class per budget name.
public class envelope {
    public String name;
    public String description;
    private Map<String, int> budgetted; //YYYYMM
    private Map<String, budgetGoal> budgetGoals; //YYYYMM

    public envelope(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public budgetGoal(int year, int month) {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public setBudgetGoal(int year, int month, int amount,) {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public static String date(int year, int month) {
        String result = "";
        result += ((String) year);
        result += ((String) month);
        return result;
    }

    public int getBudget(int year, int month) {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public void setBudget(int year, int month, int budget, budgetGoal.budgetType type) {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    public String toString() {
        throw new UnsupportedOperationException("not yet implemented!");
    }
}
