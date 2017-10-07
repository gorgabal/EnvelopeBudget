package envelopeBudget.data;

public class EnvelopeMonth {
    public Integer month; // 0-11
    public Integer year; // YYYY

    public EnvelopeMonth(int year, int month) {
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String result = "";
        result += year.toString();
        result += month.toString();
        return result;
    }
}
