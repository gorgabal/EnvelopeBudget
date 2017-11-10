package data.structs;

import java.util.Date;

public class Goal {

    public int ID;
    public Date deadline;
    GOAL_TYPE goaltype;

    enum GOAL_TYPE {
        BY_DATE, PER_MONTH, REGULAR
    }
}
