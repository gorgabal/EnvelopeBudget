package data.structs;

public class Account {
    public int id;
    public String name;
    public String description;

    public Account(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Account(){};
}
