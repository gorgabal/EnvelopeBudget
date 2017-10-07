package envelopeBudget.data;

import java.time.temporal.TemporalAmount;

public class budgetGoal {
    public budgetType budgettype;
    //only relevant for AMOUNTByDATE
    public int amount;
    public int month;

    public enum budgetType {AMOUNT, AMOUNTBYDATE, MONTHLYFUNDING}
}
