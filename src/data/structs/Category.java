package data.structs;

public class Category {
    public int ID;
    public String name;
    public String description;
    public boolean hidden;

    public Category(int ID, String name, String description, boolean hidden) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.hidden = hidden;
    }
}
