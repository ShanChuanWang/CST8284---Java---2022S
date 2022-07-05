package CST8284_301_Lab5;

/**
 * This program is the tests for the SalesAgent class including the subclass.
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 24, 2022
 */
public class SalesAgentTest{
	
	/**
	 * This is the entry point for the application. Two objects are created using contructors.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		SalesAgent salesAgent = new SalesAgent("Andrew", 42);
		System.out.println(salesAgent);
	
		SalesSupervisor salesSupervisor = new SalesSupervisor("James", 26, "Perth");
		System.out.println(salesSupervisor);
	}
}  