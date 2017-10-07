package envelopeBudget.data;

import java.time.temporal.TemporalAmount;

public class BudgetGoal {
    public budgetType budgettype;
    //only relevant for AMOUNTByDATE
    public int amount;
    public EnvelopeMonth month;

    public enum budgetType {AMOUNT, AMOUNTBYDATE, MONTHLYFUNDING}
}
