package data;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Account {
    public String name;
    public String description;
    public ArrayList<Record> records;


    public Account(String name, String description, int initialValue) {
        this.name = name;
        this.description = description;
        this.records = new ArrayList<>();
        if (initialValue != 0) {
            records.add(new Record(new Date(System.currentTimeMillis()), initialValue, this, Envelope.noBudget, "Initial Value", name));
        }
    }

    public int value() {
        int result = 0;
        for (Record rec : records) {
            result += rec.amount;
        }
        return result;
    }

    public Collection<? extends Record> getRecordsUntilDate(Date date) {
        Date begin = new Date(0);
        return getRecordsFromDate(begin, date);
    }

    ArrayList<Record> getRecordsFromDate(Date begin, Date end) {
        ArrayList<Record> result = new ArrayList<>();
        for (Record rec : records) {
            if (begin.before(rec.date) && end.after(rec.date)) {
                result.add(rec);
            }
        }
        return result;
    }
}


