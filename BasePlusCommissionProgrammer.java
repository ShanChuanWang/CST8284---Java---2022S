package cst8284_301_lab7;

/**
 * BasePlusCommissionProgrammer class extends CommissionProgrammer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 19, 2022
 */

// THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer {
  private double baseSalary; // base salary per week

  //constructor
  /**
   * onstructor with arguments
   * @param firstName, first name
   * @param lastName, last name
   * @param socialSecurityNumber, social security number
   * @param grossSales, gross sales
   * @param commissionRate, commission rates
   * @param baseSalary, base salary
   */
  public BasePlusCommissionProgrammer(String firstName, String lastName,
  String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
  super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

  if (baseSalary < 0.0) { // validate baseSalary
    throw new IllegalArgumentException("Base salary must be >= 0.0");
  }

  this.baseSalary = baseSalary;
  }

  //set base salary
  /**
   * to set base salary
   * @param baseSalary, double base salary
   */
  public void setBaseSalary(double baseSalary) {
  if (baseSalary < 0.0) { // validate baseSalary
    throw new IllegalArgumentException("Base salary must be >= 0.0");
  }

  this.baseSalary = baseSalary;
  }

  //return base salary
  /**
   * to get base salary
   * @return double, base salary
   */
  public double getBaseSalary() {
  return baseSalary;
  }

  //calculate earnings; override method earnings in CommissionProgrammer

  //MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
  //PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

  @Override
  public double earnings() {
  return getBaseSalary() + super.earnings();
  }

  //return String representation of BasePlusCommissionProgrammer object
  //@Override

  //TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
  //START
  // INSERT YOUR CODE
  /**
   * Override the original toString method
   * @return String, representing of BasePlusCommissionProgrammer object
   */
  @Override
  public String toString() {
    String result = "base-plus ";
    result += super.toString() + String.format(" %s: $%.2f", "base salary", getBaseSalary());
    return result;
  }
  
  /**
   * Override the method from interface Payme
   * @return double, the mount of payment
   */
  @Override
  public double getPaymentAmount() {
    return super.getPaymentAmount() + getBaseSalary();
  }

  //END
}



