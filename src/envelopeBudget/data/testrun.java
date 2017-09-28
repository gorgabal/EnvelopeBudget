package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import java.util.Calendar;

public class testrun {

    public static void main(String[] args) {

        //test code
        manager man = new manager();

        try {
            man.createBudget("expenses", "An budget to test other budgets", 0);
            if (man.setBudget("expenses", Calendar.SEPTEMBER, 2017, 50) == false) {
                System.out.println("Failed to set budget!");
            }
            String output = man.getBudgets(Calendar.SEPTEMBER, 2017).toString();
            System.out.println(output);
        } catch (Exception e) {
            System.out.println("Budgets Failed test!");
            e.printStackTrace();
        }

    }


}
