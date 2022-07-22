package cst8284_301_lab7;
// THIS IS A CODE FILE FOR LAB 7. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

/**
 * HourlyProgrammer class extends Programmer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 19, 2022
 *
 */

public class HourlyProgrammer extends Programmer{
  private double wage; // wage per hour
  private double hours; // hours worked for week

  //constructor
  /**
   * constructor with arguments
   * @param firstName, first name
   * @param lastName, last name
   * @param ssn, social security number
   * @param wage, wage
   * @param hours, hours
   */
  public HourlyProgrammer(String firstName, String lastName,
    String ssn, double wage, double hours) {
    super(firstName, lastName, ssn);

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

  //set wage
  /**
   * to set wate
   * @param wage, double wage
   */
  public void setWage(double wage) {
  if (wage < 0.0) { // validate wage
    throw new IllegalArgumentException(
       "Hourly wage must be >= 0.0");
  }

    this.wage = wage;
  }

  //return wage
  /**
   * to get wage
   * @return dboule, wage
   */
  public double getWage() {
  return wage;
  }

  //set hours worked
  /**
   * to set hours
   * @param hours, double hours
   */
  public void setHours(double hours) {
  if ((hours < 0.0) || (hours > 168.0)) { // validate hours
    throw new IllegalArgumentException(
       "Hours worked must be >= 0.0 and <= 168.0");
  }

  this.hours = hours;
  }

  //return hours worked
  /**
   * to get hours
   * @return doube, hours
   */
  public double getHours() {
  return hours;
  }

  //calculate earnings; override abstract method earnings in Programmer

  //MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
  //PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

  @Override
  public double earnings() {
  if (getHours() <= 40) { // no overtime
    return getWage() * getHours();
  }
  else {
    return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;}
  }

  //return String representation of HourlyProgrammer object

  //TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
  //START
  // INSERT YOUR CODE
  /**
   * Override the original toString method
   * @return String, representing of HourlyProgrammer object
   */
  @Override
  public String toString() {
    String result = "hourly programmer: ";
    result += super.toString();
    result += String.format ("hourly wage: $%,.2f; hours worked: %.2f",
            + getWage(), getHours());
    return result;
  }
  
  /**
   * Override the method from interface Payme
   * @return double, the mount of payment
   */
  @Override
  public double getPaymentAmount() {
    if (getHours() <= 40) { // no overtime
      return getWage() * getHours();
    }
    else {
      return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
  }
  //END
}

