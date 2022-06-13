package CST8284_301_Assignment1; /**
   In this file you will provide the code solution for Part 2. 
   You are required to create a subclass named RareAction.
   Activities for RareAction occurs on a particular date of the year specified.
*/

// YOUR CODE STARTS HERE!!!
public class RareAction extends Action{

    @Override
    public void occursOn(int year, int month, int day) {
        final int[] DAYS_PER_MONTH =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        if (day <= 0 || (day > DAYS_PER_MONTH[month] && !(month == 2 && month == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year)");
        }

        if ((month == 2 && day == 29 && !(year % 400 ==0 || (year % 4 == 0 || year % 100 == 0)))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year)");
        }

        super.setDescription("Wash your hands");
        System.out.println(super.toString());
    }
}