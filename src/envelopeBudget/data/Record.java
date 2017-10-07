package envelopeBudget.data;

import java.util.Date;

class Record {
    private Date date;
    private int amount;
    private Account account;
    private Envelope category;
    private String description;
    private String benefit;
    private boolean reconsiled;

    public Record(Date date, int amount, Account account, Envelope category, String description, String benefit) {
        this.date = date;
        this.amount = amount;
        this.account = account;
        this.category = category;
        this.description = description;
        this.benefit = benefit;
        this.reconsiled = false;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Envelope getCategory() {
        return category;
    }

    public void setCategory(Envelope category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public boolean isReconsiled() {
        return reconsiled;
    }

    public void setReconsiled(boolean reconsiled) {
        this.reconsiled = reconsiled;
    }
//todo create constructor and changer
}
