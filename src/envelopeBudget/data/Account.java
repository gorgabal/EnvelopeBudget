package envelopeBudget.data;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;

public class Account {
    public String name;
    public String description;
    public ArrayList records;


    public Account(String name, String description, int initialValue) {
        this.name = name;
        this.description = description;
        this.records = new ArrayList<>();
        if (initialValue != 0) {
            throw new NotImplementedException("Initial Value not yet implemented!"); //todo
        }
    }

    }


