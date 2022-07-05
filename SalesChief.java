package CST8284_301_Lab5;

/**
 * this class is the subclass of class SalesSupervisor
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 24, 2022
 */

public class SalesChief extends SalesSupervisor{

    /**
     * This portion constructs a SalesAgent object.
     * @param name the name of the Sales Agent
     * @param age  the age of the Sales Agent
     */
    public SalesChief(String name, int age) {
        super(name, age);
    }

    /**
     * This portion constructs a SalesAgent object
     * @param name the name of the Sales Agent
     * @param age the age of the Sales Agent
     * @param location the location of sales Agent
     */
    public SalesChief (String name, int age, String location) {
        super(name, age, location);
    }

    /**
     * this method is to override the toString method
     * @return Returns the string representation of the object.
     */
    @Override
    public String toString() {
        return "Sales Chief [super=" + super.toString() +"]";
    }

}
