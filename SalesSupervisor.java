package CST8284_301_Lab5;

/**
 * this class is the subclass of class SalesAgent
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 24, 2022
 */

public class SalesSupervisor extends SalesAgent {
    private String location;

    /**
     * This portion constructs a SalesAgent object.
     * @param name the name of the Sales Agent
     * @param age the age of the Sales Agent
     */
    public SalesSupervisor(String name, int age) {
        super(name, age);
    }

    /**
     * This portion constructs a SalesAgent object
     * @param name the name of the Sales Agent
     * @param age the age of the Sales Agent
     * @param location the location of sales Agent
     */
    public SalesSupervisor (String name, int age, String location) {
        this(name, age);
        this.location = location;
    }

    /**
     * this method is to override the toString method
     * @return Returns the string representation of the object.
     */
    @Override
    public String toString() {
        return "Sales supervisor [super=" + super.toString() +
                ",location: " + location +"]";
    }
}