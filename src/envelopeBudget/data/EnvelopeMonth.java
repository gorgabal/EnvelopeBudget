package envelopeBudget.data;

public class EnvelopeMonth {
    public int month; // 0-11
    public int year; // YYYY

    public EnvelopeMonth(int year, int month) {
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String result = "";
        result += ((String) year);
        result += ((String) month);
        return result;
    }
}
