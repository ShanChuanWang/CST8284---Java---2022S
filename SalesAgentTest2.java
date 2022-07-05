package CST8284_301_Lab5;

/**
 * This program is the tests for the SalesAgent class including the subclasses.
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 24, 2022
 */
public class SalesAgentTest2 {
	
	/**
	 * This is the entry point for the application. Four objects are created using contructors.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		SalesAgent salesAgent = new SalesAgent("Peter", 56);
		System.out.println(salesAgent);

		SalesAgent anotherSalesAgent = new SalesAgent("John", 48);
		System.out.println(anotherSalesAgent);

		SalesSupervisor salesSupervisor = new SalesSupervisor("Ifoma", 53, "Toronto");
		System.out.println(salesSupervisor);

		SalesChief salesChief = new SalesChief("Shuai", 37, "Ottawa");
		System.out.println(salesChief);
	}
}