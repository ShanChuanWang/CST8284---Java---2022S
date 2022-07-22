package cst8284_301_lab7;
import org.w3c.dom.ls.LSOutput;


/**
 * SalariedProgrammer concrete class extends abstract class Programmer.
 * @author Shuai Wang
 * @version 1.0
 * @since July 19, 2022
 *
 */

public class SalariedProgrammer extends Programmer  {
  private double weeklySalary;

  //constructor
  /** 
   * constructor with arguments
   * @param firstName, first name
   * @param lastName, last name
   * @param ssn, social security number
   * @param weeklySalary, weekly salary
   */
  public SalariedProgrammer(String firstName, String lastName, String ssn, double weeklySalary) {
  super(firstName, lastName, ssn);

  if (weeklySalary < 0.0) {
    throw new IllegalArgumentException(
       "Weekly salary must be >= 0.0");
  }

  this.weeklySalary = weeklySalary;
  }

  //set salary
  /**
   * to set weekly salary
   * @param weeklySalary, double weekly salary
   */
  public void setWeeklySalary(double weeklySalary) {
  if (weeklySalary < 0.0) {
    throw new IllegalArgumentException(
       "Weekly salary must be >= 0.0");
  }

  this.weeklySalary = weeklySalary;
  }

  //return salary
  /**
   * to get weekly salary
   * @return double, weekly salary
   */
  public double getWeeklySalary() {
  return weeklySalary;
  }

  //calculate earnings; override abstract method earnings in Programmer

  //MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
  //PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

  @Override
  public double earnings() {
  return getWeeklySalary();
  }

  //return String representation of SalariedProgrammer object

  //TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
  //START
  // INSERT YOUR CODE
  /**
   * Override the original toString method
   * @return String, representing of SalariedProgrammer object
   */
  @Override
  public String toString() {
    String result = "salaried programmer: ";
    result += super.toString();
    result += String.format("%s: $%,.2f", "weekly salary", getWeeklySalary());
    return result;
  }
  
  /**
   * Override the method from interface Payme
   * @return double, the mount of payment
   */
  @Override
  public double getPaymentAmount() {
    return getWeeklySalary();
  }
  //END
}

