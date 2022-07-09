package polylab;
/**
 * BasePlusCommissionProgrammer class extends CommissionProgrammer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer{
	private double baseSalary; // base salary per week
	
	/**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
     * @param grossSales, gross sales
     * @param commissionRate, commisino rates
	 * @param baseSalary, base salary
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber,
				month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**
	 * to set base salary
	 * @param baseSalary, base salary
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}

	/**
	 * to get base salary
	 * @return double, base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	/**
	 * calculate earnings; override abstract method earnings in CommissionProgrammer
	 * @return double, earning
	 */
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	/**
	 * Override the original toString method
	 * @return String, representing of BasePlusCommissionProgrammer object
	 */
	@Override
	public String toString() {
		String result = "base-salaried ";
		result += super.toString() + String.format("; base salary: $%.2f", getBaseSalary());
		return result;
	}
}


