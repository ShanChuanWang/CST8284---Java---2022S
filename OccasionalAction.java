package assignment1.Action.sec301;

/**
 * OccasionalAction is the subclass of Action.
 * Activities that occur on the same day of every month specified.
 */

public class OccasionalAction extends Action{
	
    /**
     * constructs the occasional action with 3 arguments
     * @param year the year
     * @param month the month
     * @param day the day
     */
    public OccasionalAction (int year, int month, int day) {
    	super(year, month, day );
    }

    /**
     * override the method occursOn from the superclass.
     * @param year the year
     * @param month the month
     * @param day the day
     * @return true or false
     */
    @Override
    public boolean occursOn(int year, int month, int day) {
        super.dateCheck(year, month, day);
        return (getDueDay() == day);
    }
}