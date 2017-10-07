package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;
import java.util.Date;

public class account {
    private String name;
    private String description;
    private ArrayList records;


    public account(String name, String description, int initialValue) {
        this.name = name;
        this.description = description;
        this.records = new ArrayList<>();
        if (initialValue != 0) {
            throw new NotImplementedException("Initial Value not yet implemented!"); //todo
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getValue() {
        throw new NotImplementedException("Value calculation not implemented yet!");
    }//todo

    public void addRecord(Date date, int amount, String description, String benefit, envelope category) {
    }
}

