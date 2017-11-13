package data.structs;

import java.util.Date;

public class Goal {

    public int ID;
    public Date deadline;
    GOAL_TYPE goaltype;

    public enum GOAL_TYPE {
        BY_DATE, PER_MONTH, REGULAR
    }

    public Goal(int ID, Date deadline, GOAL_TYPE goaltype) {
        this.ID = ID;
        this.deadline = deadline;
        this.goaltype = goaltype;
    }

    public Goal(){};
}
