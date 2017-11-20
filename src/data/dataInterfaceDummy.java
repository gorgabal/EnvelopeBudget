package data;

import data.structs.*;

import java.util.Calendar;
import java.util.Date;

import static data.structs.Goal.GOAL_TYPE.*;


public class dataInterfaceDummy implements dataInterface {

    private Account dummyAccount;
    private Category dummyCategory;
    private Goal dummygoal;
    private Record dummyRecord;
    private Envelope dummyEnvelope;

    public dataInterfaceDummy() {
        Calendar cal = Calendar.getInstance();
        dummyAccount = new Account(0 , "Main Bank Account", "This is a dummy account to demenstrate some UI elements");
        dummyCategory = new Category(0, "Rent","An catogory to be able to pay the rent!", false);
        dummygoal = new Goal(0, cal.getTime(), REGULAR);
        dummyEnvelope = new Envelope(1,cal.get(Calendar.MONTH),dummygoal,dummyCategory);
        dummyRecord = new Record(cal.getTime(),5,dummyAccount,dummyCategory,"","");
    }

    @Override
    public int addTransaction(Date date, int money, int account, String description, int category) {
        return 0;
    }

    @Override
    public int adjustTransaction(int id, Date date, int money, int account, String description, int category) {
        return 0;
    }


    public Record[] getTransactions(int accountID, int categoryID, Date begin, Date end, TYPE type) {
        Record[] recs = new Record[0];
        recs[0] = new Record(new Date(System.currentTimeMillis()),10,dummyAccount,dummyCategory,"beedschappen", "supermarkt" );
        return recs;
    }

    @Override
    public Record[] getTransactions() {
        return getTransactions(-1,-1,new Date(0),new Date(Long.MAX_VALUE),TYPE.ALL);
    }

    @Override
    public int getAccountID(String accountName) {
        return 0;
    }

    @Override
    public int getCategoryID(String categoryName) {
        return 0;
    }

    @Override
    public int getRecordID(Record rec) {
        return 0;
    }

    @Override
    public int createCategory(String name, String description, boolean hidden) {
        return 0;
    }

    @Override
    public int modifyCategory(Category cat) {
        return 0;
    }

    @Override
    public Category getCategory(int ID) {
        return dummyCategory;
    }

    @Override
    public String[] getCategories() {
        String[] result = new String[0];
        result[0] = dummyCategory.name;
        return result;
    }

    @Override
    public void setMoneyInEnvelope(int category, int month, int year, int money) {

    }

    @Override
    public void setEnvelopeGoal(int cat, int month, int year, Goal goal) {

    }

    @Override
    public void setEnvelope(Envelope env) {

    }

    @Override
    public int getMoneyInEnvelope(int category, int month, int year) {
        return 5;
    }

    @Override
    public int createAccount(String name, String description, int initialValue) {
        return 0;
    }

    @Override
    public int adjustAccount(Account acc) {
        return 0;
    }

    @Override
    public Account getAccount(int id) {
        return null;
    }

    @Override
    public int toBeBudgetted(int year, int month) {
        return 0;
    }

    @Override
    public int totalMoney() {
        return 50;
    }

    @Override
    public int moneyLeftFromBudget(int BudgetID) {
        return 0;
    }

    @Override
    public String getTopAccount(int category_ID) {
        return dummyAccount.name;
    }

    @Override
    public String getBottemAccount(int category_id) {
        return dummyAccount.name;
    }
}
