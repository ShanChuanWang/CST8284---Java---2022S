
package polylab;


//Programmer abstract superclass.

public abstract class Programmer  {
private final String firstName;
private final String lastName;
private final String socialSecurityNumber;

//constructor
public Programmer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year) {
this.firstName = firstName;                                    
this.lastName = lastName;                                    
this.socialSecurityNumber = socialSecurityNumber;         
} 

//return first name

//TO DO: INSERT YOUR CODE HERE


//return last name

//TO DO: INSERT YOUR CODE HERE 


//return social security number

//TO DO: INSERT YOUR CODE HERE


//return birth date  // 

//TO DO: INSERT YOUR CODE HERE


//return String representation of Programmer object
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %s", 
  getFirstName(), getLastName(), 
  "social security number", getSocialSecurityNumber(), 
  "birth month and year", getBirthDate());
} 

/**abstract method must be overridden by concrete subclasses */

public abstract double earnings(); 
} 


