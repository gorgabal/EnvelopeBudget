package envelopeBudget.data;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.commons.lang.NotImplementedException;

import java.util.*;

public class Manager {


    private ArrayList<Envelope> budgets = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    public Manager() {
        budgets.add(new Envelope("No Budget", "Special envelope for holding non-categorized transactions"));
    }

    /**
     * @param name Name of the Account you want information on
     * @return The current value of that Account
     */
    public int getAccountValue(String name) {
        //todo implement this!
        throw new NotImplementedException("Needs Implementation!");
    }

    /**
     * @param name the name of the Account you want to get
     * @return null if none found, else the relevant Account
     */
    private Account getAccountFromName(String name) throws Exception {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).name == name) {
                return accounts.get(i);
            }
        }
        //if none found
        throw new Exception("Element not Found!");

    }

    /**
     * @return The difference of all money available, and all money budgetted
     */
    int toBudget() {
        throw new UnsupportedOperationException(); //todo

    }

    void createAccount(String name) {
        createAccount(name, "", 0);
    }

    /**
     * Create a new account
     *
     * @param name         the name of the account
     * @param description  optional description
     * @param initialValue starting value.
     */
    void createAccount(String name, String description, int initialValue) {
        Account newAccount = new Account(name, description, initialValue);
        accounts.add(newAccount);
    }

    /**
     * sets a new budget
     * @param name The name of the budget you want to create or adjust
     * @param month In which month do you want to adjust it?
     * @param year In which year do you want to adjust it
     * @param money How much money do you want to be in the budget?
     */
    void setBudget(String name, String description, Integer month, Integer year, int money) {
        for (Envelope e : budgets) {
            if (e.name == name) {
                e.setBudget(new EnvelopeMonth(year, month), money);
                return;
            }
        }

        budgets.add(new Envelope(name, description));
        setBudget(name, description, month, year, money); //should reach return statement in the if above.
    }


    Record[] getRecordsFromAllAccounts() {
        ArrayList<Record> result = new ArrayList<>();
        ArrayList<Account> accounts = getAccounts();
        for (Account acc : accounts) {
            result.addAll(acc.records);
        }
        return (Record[]) result.toArray();
    }

    Record[] getRecordsFromBudget(Envelope name, Date begin, Date end) {
        throw new UnsupportedOperationException(); //todo
    }

    Record[] getRecordsFromDate(Account name, Date begin, Date end) {
        throw new UnsupportedOperationException();//todo
    }

    Record[] getRecordsFromBudget(String name) {
        throw new UnsupportedOperationException(); //todo
    }


    public ArrayList<Account> getAccounts() {
        throw new UnsupportedOperationException(); //todo
    }

    public Account getAccount(String name) {
        throw new UnsupportedOperationException(); //todo
    }

    public Envelope noEnvelope() {
        return getBudgetsFromName("No Budget");
    }

    public Envelope getBudgetsFromName(String name) {
        for (Envelope e : budgets) {
            if (e.name == name) {
                return e;
            }
        }
        return null;
    }
}

