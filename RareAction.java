package assignment1.Action.sec301;
/**
 * RareAction is the subclass of Action.
 * Activities for RareAction occurs on a particular date of the year specified.
 */

public class RareAction extends Action{

    /**
     * constructs the rare action with 3 arguments
     * @param year the year
     * @param month the month
     * @param day the day
     */
	public RareAction (int year, int month, int day) {
		super(year, month, day);
		
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
        if (getDueMonth() == month && getDueDay() == day) {
            return true;
        } else {
            return false;
        }
    }
}