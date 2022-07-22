package cst8284_301_lab7;

/**
 * Programmer abstract superclass.
 * @author Professor
 */

// LAB 7: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATIONS ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	//three-argument constructor
	/**
	 * constructor with arguments
	 * @param first, first name
	 * @param last, last name
	 * @param ssn, social security number
	 */
	public Programmer(String first, String last, String ssn) {
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	}
	
	/**
	 * to get first name
	 * @return String, first name
	 */
	public String getFirstName() {
	  return firstName;
	 }
	/**
	 * to get last name
	 * @return String, last name
	 */
	 public String getLastName() {
	  return lastName;
	 }
	 /**
	  * to get social security number
	  * @return String, social security number
	  */
	 public String getSocialSecurityNumber() {
	  return socialSecurityNumber;
	 }
	
	 /** CHANGES ARE REQUIRED IN THIS SECTION. THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
	  * IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
	  */
	
	 //return String representation of Programmer object
	 @Override
	 public String toString() {
	   return String.format("%s %s\n%s: %s\n",
	           getFirstName(), getLastName(),
	           "social security number", getSocialSecurityNumber());
	 }
	
	 // Note: We do NOT implement Payme method getPaymentAmount() here.
	 // THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....?? //abstract
	 /**
	  * abstract method
	  * @return no return
	  */
	 public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
}