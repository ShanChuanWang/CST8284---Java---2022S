package polylab;

/**
 * Programmer abstract superclass.
 * @author Professor
 */

public abstract class Programmer {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    /**
     * constructor with arguments
     * @param firstName, first name
     * @param lastName, last name
     * @param socialSecurityNumber, social security number
     * @param month, birth month
     * @param year, birth year
     */
    public Programmer(String firstName, String lastName,
    String socialSecurityNumber, int month, int year) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    birthDate = new Date(month, year);
    }

    /**
     * to get first name
     * @return String, firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * to get last name
     * @return String, lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * to get social security number
     * @return String, socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * to get the month of the birthdate
     * @return String, month of the birthdate
     */
    public int getBirthDate() {
        return birthDate.getMonth();
    }

    /**
     * Override the original toString method
     * @return String, representing Programmer object
     */
    @Override
    public String toString() {
    return String.format("%s %s\n%s: %s\n%s: %s",
      getFirstName(), getLastName(),
      "social security number", getSocialSecurityNumber(),
      "birth month and year", getBirthDate());
    }
    /**
     * abstract method must be overridden by concrete subclasses
     * @return nothing
     */
    public abstract double earnings();
} 


