package assignment1.Action.sec301;

/**
 * RegularAction is the subclass of Action.
 * Regular action activity occurs every day.
 */

public class RegularAction extends Action{
    /**
     * Constructs a regular action with a description.
     * @param description the description
     */
    public RegularAction (String description) {
        setDescription(description);
    }

    /**
     * override the method occursOn from the superclass.
     * @param year the year
     * @param month the month
     * @param day the day
     * @return true
     */
    @Override
    public boolean occursOn(int year, int month, int day) {
        super.dateCheck(year, month, day);
        return true;
    }
}

