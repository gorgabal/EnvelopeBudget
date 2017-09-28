package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import javax.naming.directory.AttributeInUseException;
import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class manager {


    private Map<String, envelope> budgets; //mapping YYYYMM{BudgetName}
    private Node accounts;
    private ArrayList<String> budgetNames; //contains the names of all the budgets.



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
    envelope[] getBudgets(int month) {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromAccount(String name, Date start, Date end) {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromAccount(String name) {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromBudget(String name, Date begin, Date end) {
        throw new NotImplementedException("Needs Implementation!");
    }

    record[] getRecordsFromBudget(String name) {
        throw new NotImplementedException("Needs Implementation!");
    }
}

