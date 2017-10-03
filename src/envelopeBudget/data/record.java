package envelopeBudget.data;

import java.util.Date;
import java.util.UUID;

class record {
    private Date date;
    private int amount;
    private envelopeBudget.data.account account;
    private envelope category;
    private String description;
    private String benefit;
    private boolean reconsiled;

    public record( Date date, int amount, envelopeBudget.data.account account, envelope category, String description, String benefit) {
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

    public envelopeBudget.data.account getAccount() {
        return account;
    }

    public void setAccount(envelopeBudget.data.account account) {
        this.account = account;
    }

    public envelope getCategory() {
        return category;
    }

    public void setCategory(envelope category) {
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
