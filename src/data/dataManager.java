package data;

import data.structs.Category;
import data.structs.*;

import java.util.Date;

public interface dataManager {

    /**
     * Records an transaction,
     *
     * @param date        transaction date
     * @param money       1 = 1 cent, 100 = one unit/euro/dollar
     * @param account     the id of the account to write to
     * @param description short description of the transaction
     * @param category    id of the relevant category. 0 if no category present
     * @return the transactions ID, or -1 if it failed.
     */
    int addTransaction(Date date, int money, int account, String description, int category);

    int adjustTransaction(int id, Date date, int money, int account, String description, int category);

    /**
     * Get a selection of transactions
     *
     * @param accountID  the accountID you want the transaction from. -1 to not filter on accounts
     * @param categoryID the categoryID you want the transaction from. -1 to not filter on category
     * @param begin      The startdate of your search. Beginning of time if you want everything
     * @param end        the enddate of your search, end of time if you want everything. (note: do not actually create the end of times, humanity needs to live ;) )
     * @param type       only income, expenses, or all?
     * @return An array of records that has the result of your query.
     */
    Record[] getTransactions(int accountID, int categoryID, Date begin, Date end, TYPE type);

    Record[] getTransactions(); //get all transactions

    int getAccountID(String accountName);

    int getCategoryID(String categoryName);

    int getRecordID(Record rec);

    int createCategory(String name, String description, boolean hidden);

    int modifyCategory(Category cat);

    Category getCategory(int ID);

    String[] getCategories();

    void setMoneyInEnvelope(int category, int month, int year, int money);

    void setEnvelopeGoal(int cat, int month, int year, Goal goal);

    void setEnvelope(Envelope env);

    int getMoneyInEnvelope(int category, int month, int year);

    int createAccount(String name, String description, int initialValue);

    int adjustAccount(Account acc);

    Account getAccount(int id);

    int toBeBudgetted(int year, int month);
    int totalMoney();
    int moneyLeftFromBudget(int BudgetID);

    String getTopAccount(int category_ID);
    String getBottemAccount(int category_id);

    enum TYPE {
        INCOME, EXPENSE, ALL
    }

    // I hope this will be able to accomadate for all use cases, we will see.
}
