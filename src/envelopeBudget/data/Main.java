package envelopeBudget.data;

import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;

public class Main {

    static boolean DEBUG = true;

    public static void main(String[] args) {
        if (DEBUG) {
            boolean success = testrun();
            if (success) {
                System.out.println("Test succeeded!");
            } else {
                System.out.println("Test Failed!");
            }
        }
    }

    //todo rewrite when the rest is kinda done.
    public static boolean testrun() {
        /*
        //todo test evelopes
        Manager man = new Manager();

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

        // todo test accounts and recordes

        man.createAccount("Checkings");
        man.createAccount("Credit Card", -10);
        man.getAccounts().iterator();
        Iterator<Account> accounts = man.getAccounts().iterator();
        while (accounts.hasNext()) {
            Account a = accounts.next();
            System.out.println(a.getName() + ": " + a.getValue());
        }

        man.getAccount("Checkings").addRecord(new Date(System.currentTimeMillis()), 50, "whopie", "Cash", man.noEnvelope());
        man.getAccount("Credit Card").addRecord(new Date(System.currentTimeMillis()), -30, "payed off credit card", "evil credit company", man.noEnvelope());

        int creditValue = man.getAccount("Checkings").getValue();
        int card = man.getAccount("Credit Card").getValue();

        System.out.println("Checkings: " + creditValue + ", credit:" + card);


        // todo test envelopes in combination with accounts and records.

*/
        return true; // assumes that no exeptions has occured.
    }


}

// todo implement budget goals
// todo implement accounts and records
// todo implement RESTful api
