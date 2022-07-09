package polylab;
/**
 * CommissionProgrammer class extends Programmer
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

public class CommissionProgrammer extends Programmer {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	/**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
     * @param grossSales, gross sales
     * @param commissionRate, commisino rates
     */
	public CommissionProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**
	 * to set gross sales amount on the creation of apps
	 * @param grossSales, amount on the creation of apps
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/**
	 * to get gross sales amount
	 * @return double, gross sales
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**
	 * to set commission rate
	 * @param commissionRate, commission rate
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/**
	 * to get commission rate
	 * @return double, comission rate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * calculate earnings; override abstract method earnings in Programmer
	 * @return double, earning
	 */
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	/**
	 * Override the original toString method
	 * @return String, representing of CommissionProgrammer object
	 */
	@Override
	public String toString() {
		String result = "commission programmer: ";
		result += super.toString();
		result += String.format("\ngross sales: $%,.2f; commission rate: %.2f",
				getGrossSales(), getCommissionRate());
		return result;
	}
}

