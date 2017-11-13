package data.structs;

public class Envelope {
    public int ID;
    public int month;
    public Goal goal;
    public Category category;

    public Envelope(int ID, int month, Goal goal, Category category) {
        this.ID = ID;
        this.month = month;
        this.goal = goal;
        this.category = category;
    }

    public Envelope(){};
}
