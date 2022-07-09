package polylab;
/**
 * ActionProgrammer concrete class extends abstract class Programmer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

public class ActionProgrammer extends Programmer{
    private double wage; //stores the wage of the programmer per piece (each) of app created.
    private int pieces; // stores the number of pieces of apps created.

    /**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
     * @param wage, of the programmer per piece of app created
     * @param pieces, of apps created
     */
    public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber,
                            int month, int year, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, month, year);

        if (wage < 0.0) { // validate wage
            throw new IllegalArgumentException(
                    "wage must be >= 0.0");
        }
        if (pieces < 0) { // validate number of pieces
            throw new IllegalArgumentException("number of pieces of apps created must be >= 0");
        }
        this.wage = wage;
        this.pieces = pieces;
    }

    /**
     * to get wage
     * @return double, wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * to set wage amount on the creation of apps
     * @param wage, of the programmer per piece of app created
     */
    public void setWage(double wage) {
        if (wage < 0.0) { // validate wage
            throw new IllegalArgumentException(
                    "wage must be >= 0.0");
        }
        this.wage = wage;
    }

    /**
     * to get pieces of app created
     * @return double, pieces of app created
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * to set pieces of app created
     * @param pieces, of app created
     */
    public void setPieces(int pieces) {
        if (pieces < 0) { // validate number of pieces
            throw new IllegalArgumentException(
                    "number of pieces of apps created must be >= 0");
        }
        this.pieces = pieces;
    }

    /**
     * calculate earnings; override abstract method earnings in Programmer
     * @return double, earning
     */
    @Override
    public double earnings() {
        return wage * pieces;
    }

    /**
     * Override the original toString method
     * @return String, representing of ActionProgrammer object
     */
    @Override
    public String toString() {
        String result = "Action programmer: ";
        result += super.toString();
        result += String.format ("\npiece wage: $%,.2f; app created: %d",
                + getWage(), getPieces());
        return result;
    }

}
