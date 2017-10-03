package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import javax.xml.soap.Node;
import java.util.*;

public class manager {


    static private envelope noBudget;
    private Map<String, envelope> budgets = new HashMap<>(); //mapping YYYYMM{BudgetName}
    private ArrayList<account> accounts = new ArrayList<>();
    private ArrayList<String> budgetNames = new ArrayList<>(); //contains the names of all the budgets.

    public manager() {

    }

    /**
     * @param name Name of the account you want information on
     * @return The current value of that account
     */
    public int getAccountValue(String name) {
        throw new NotImplementedException("Needs Implementation!");
    }

    /**
     * @return The difference of all money available, and all money budgetted
     */
    int toBudget() {
        throw new NotImplementedException("Needs Implementation!");
    }

    void createAccount(String name) {
        createAccount(name, 0);
    }

    void createAccount(String name, int initialValue) {
        throw new NotImplementedException("Needs implementation!");
    }

    void createBudget(String name) throws Exception {
        createBudget(name, "", 0);
    }

    void createBudget(String name, String description, int initialValue) throws Exception {
        if (!budgetNames.contains(name)) {
            budgetNames.add(name);
        }

        envelope newBudget = new envelope(name, description, initialValue, new Date(System.currentTimeMillis()));
        if (budgets.containsKey(newBudget.ID()) == false) {
            budgets.put(newBudget.ID(), newBudget);
        } else {
            throw new Exception("Budget with ID " + newBudget + " is already stored. discarding this one");
        }
    }

    /**
     * @param month The month, from 1-12, for which you want budget information
     * @return An array of envelopes, containing this months budget information
     */
    ArrayList<envelope> getBudgets(int month, int year) {
        ArrayList<envelope> result = new ArrayList<>();

        Iterator<envelope> iter = budgets.values().iterator();
        while (iter.hasNext()) {
            envelope current = iter.next();
            if (current.getMonth() == month && current.getYear() == year) {
                result.add(current);
            }
        }

        return result;
    }

    boolean setBudget(String name, Integer month, Integer year, int money) {
        String lookupKey = year.toString() + month.toString() + name;
        envelope envelopeSet = budgets.get(lookupKey);
        if (budgetNames.contains(name) == false | envelopeSet == null) {
            return false;
        } else {
            budgets.get(lookupKey).setBudgeted(money);
            return true;
        }

    }


    record[] getRecordsFromAllAccounts() {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromBudget(String name, Date begin, Date end) {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromBudget(String name) {
        throw new NotImplementedException("Needs Implementation!");
    }


    public ArrayList<account> getAccounts() {
        throw new NotImplementedException("Needs Implementation!");
    }

    public account getAccount(String name) {
        throw new NotImplementedException("Needs Implementation!");
    }

    public envelope noEnvelope() {
        throw new NotImplementedException("Needs implementation!");

    }
}

