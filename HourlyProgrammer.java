package polylab;

/**
 * HourlyProgrammer class extends Programmer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	/**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
	 * @param wage, wage
	 * @param hours, hours
	 */
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	}

	/**
	 * to set wage
	 * @param wage, wage
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}
		this.wage = wage;
	}

	/**
	 * to get wage
	 * @return double, wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * to set hours worked
	 * @param hours, hours worked
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

	/**
	 * to get hours worked
	 * @return double, hours worked
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * calculate earnings; override abstract method earnings in Programmer
	 * @return double, earning
	 */
	@Override
	public double earnings() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		}
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	/**
	 * Override the original toString method
	 * @return String, representing of HourlyProgrammer object
	 */
	@Override
	public String toString() {
		String result = "hourly programmer: ";
		result += super.toString();
		result += String.format ("\nhourly wage: $%,.2f; hours worked: %.2f",
				+ getWage(), getHours());
		return result;
	}
}

