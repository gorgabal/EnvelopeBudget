package envelopeBudget.main;

import java.sql.Date;

public class Main {


    static boolean DEBUG = true;

    public static void main(String[] args) {
        /*
        if (DEBUG) {
            boolean success = testrun();
            if (success) {
                System.out.println("Test succeeded!");
            } else {
                System.out.println("Test Failed!");
            }
        }
        */
    }

    //todo rewrite when the rest is kinda done.
    public static boolean testrun() {
        /*

        //test evelopes
        Manager man = new Manager();

        man.setBudget("expenses", "An budget to test budgets", 10);
        man.setBudget("groceries", "An budget to test budgets", 150);
        man.setBudget("fun", "An budget to test budgets", 50);


        try {
            System.out.println(man.getBudgetsFromName("expenses"));
            System.out.println(man.getBudgetsFromName("groceries"));
            System.out.println(man.getBudgetsFromName("fun"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        // todo test accounts and recordes


        try {
            //this does not seem to produce the correct results, need to test this more thouroughly
            man.createAccount("TestBank", "An account to test stuff", 5);
            man.createAccount("Cash", "My physical money", 50);

            man.getAccount("TestBank").addRecord(3, man.getBudgetsFromName("groceries"), "Albert Hein");
            man.getAccount("Cash").addRecord(15, man.getBudgetsFromName("fun"), "Drinks at the odessa");

            System.out.println(man.getAccount("TestBank").getRecordsUntilDate(new Date(System.currentTimeMillis())).toString());
            System.out.println(man.getAccount("Cash").getRecordsUntilDate(new Date(System.currentTimeMillis())).toString());

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

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
