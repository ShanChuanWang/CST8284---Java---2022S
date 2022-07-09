package polylab;

/**
 * SalariedProgrammer concrete class extends abstract class Programmer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;

	/**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
	 * @param weeklySalary, weekly salary
	 */
	public SalariedProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

	 this.weeklySalary = weeklySalary;
	}

	/**
	 * to set weekly salary
	 * @param weeklySalary, weekly salary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}
	
	/**
	 * to get weekly salary
	 * @return double, weekly salary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	/**
	 * calculate earnings; override abstract method earnings in Programmer
	 * @return double, earning
	 */
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	/**
	 * Override the original toString method
	 * @return String, representing of SalariedProgrammer object
	 */
	@Override
	public String toString() {
		String result = "salaried programmer: ";
		result += super.toString();
		result += String.format("\nweekly salary: $%.2f", getWeeklySalary());
		return result;
	}
}

