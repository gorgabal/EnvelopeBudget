package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import java.util.Date;

public class manager {

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

