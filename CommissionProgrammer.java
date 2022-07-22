package cst8284_301_lab7;

/**
 * CommissionProgrammer class extends Programmer
 * @author Shuai Wang
 * @version 1.0
 * @since July 19, 2022
 */
// THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.

public class CommissionProgrammer extends Programmer {
	  private double grossSales; // gross weekly sales
	  private double commissionRate; // commission percentage
	
	  //constructor
	  /**
	   * constructor with arguments
	   * @param firstName, first name
	   * @param lastName, last name
	   * @param ssn, social insurance number
	   * @param grossSales, gross sales
	   * @param commissionRate, commission rate
	   */
	  public CommissionProgrammer(String firstName, String lastName,
	  String ssn, double grossSales, double commissionRate) {
	  super(firstName, lastName, ssn);
	
	  if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		  throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	  }
	
	  if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	  }
	
	  this.grossSales = grossSales;
	  this.commissionRate = commissionRate;
	  }
	
	  //set gross sales amount on the creation of apps
	  /**
	   * to set gross sales amount
	   * @param grossSales, grosssale
	   */
	  public void setGrossSales(double grossSales) {
	  if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
	  }
	
	  this.grossSales = grossSales;
	  }
	
	  //return gross sales amount
	  /**
	   * to get gross sales
	   * @return double, gross sales
	   */
	  public double getGrossSales() {
	  return grossSales;
	  }
	
	  //set commission rate
	  /**
	   * to set commission rate
	   * @param commissionRate, double, commonission rate
	   */
	  public void setCommissionRate(double commissionRate) {
		  if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			  throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	  }
	
	  this.commissionRate = commissionRate;
	  }
	
	  //return commission rate
	  /**
	   * to get commission rate
	   * @return double, commission rate
	   */
	  public double getCommissionRate() {
	  return commissionRate;
	  }
	
	  //calculate earnings; override abstract method earnings in Programmer.
	
	  //MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	  //PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
	  /**
	   * Override the original toString method
	   * @return String, representing of CommissionProgrammer object
	   */
	  @Override
	  public double earnings() {
		  return getCommissionRate() * getGrossSales();
	  }
	
	  //return String representation of CommissionProgrammer object
	  /**
	   * Override the original toString method
	   * @return String, representing of CommissionProgrammer object
	   */
	  @Override
	  public double getPaymentAmount() {
		  return getCommissionRate() * getGrossSales();
	  }
	  //TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
	  //START
	  // INSERT YOUR CODE
	  /**
	   * Override the method from interface Payme
	   * @return double, the mount of payment
	   */
	  @Override
	  public String toString() {
		  String result = "commission programmer: ";
		  result += super.toString();
		  result += String.format("%s: $%,.2f; %s: %.2f;",
	        "gross sales", getGrossSales(), "commission rate", getCommissionRate());
		  return result;
	  }
}

