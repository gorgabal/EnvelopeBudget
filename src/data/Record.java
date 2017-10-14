package data;

import java.util.Date;

class Record {
    public Date date;
    public int amount;
    public Account account;
    public Envelope category;
    public String description;
    public String benefit;
    public boolean reconsiled;

    public Record(Date date, int amount, Account account, Envelope category, String description, String benefit) {
        this.date = date;
        this.amount = amount;
        this.account = account;
        this.category = category;
        this.description = description;
        this.benefit = benefit;
        this.reconsiled = false;
    }
}
