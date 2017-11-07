package data;

public class Category {
    public final int ID;
    public final String name;
    public final String description;
    public final boolean hidden;

    public Category(int ID, String name, String description, boolean hidden) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }
}
