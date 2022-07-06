package CST8284_301_Lab6;

//CommissionProgrammer.java
//CommissionProgrammer class extends Programmer.

public class CommissionProgrammer extends Programmer {
  private double grossSales; // gross weekly sales
  private double commissionRate; // commission percentage

  //constructor
  public CommissionProgrammer(String firstName, String lastName,
  String socialSecurityNumber, int month, int year,
  double grossSales, double commissionRate) {
  super(firstName, lastName, socialSecurityNumber, month, year);

  if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
    throw new IllegalArgumentException(
       "Commission rate must be > 0.0 and < 1.0");
  }

  if (grossSales < 0.0) { // validate
    throw new IllegalArgumentException("Gross sales must be >= 0.0");
  }

  this.grossSales = grossSales;
  this.commissionRate = commissionRate;
  }

  //set gross sales amount on the creation of apps
  public void setGrossSales(double grossSales) {
  if (grossSales < 0.0) { // validate
    throw new IllegalArgumentException("Gross sales must be >= 0.0");
  }

  this.grossSales = grossSales;
  }

  //return gross sales amount
  public double getGrossSales() {
  return grossSales;
  }

  //set commission rate
  public void setCommissionRate(double commissionRate) {
  if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
    throw new IllegalArgumentException(
       "Commission rate must be > 0.0 and < 1.0");
  }

  this.commissionRate = commissionRate;
  }

  //return commission rate
  public double getCommissionRate() {
  return commissionRate;
  }

  //calculate earnings; override abstract method earnings in Programmer

  @Override
  public double earnings() {
  return getCommissionRate() * getGrossSales();
  }



  //return String representation of CommissionProgrammer object

  @Override
  public String toString() {
    String result = super.toString();
    result += String.format("\ngross sales: $%,.2f; commission rate: %.2f",
            getGrossSales(), getCommissionRate());
    return result;
  }

  //TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.
  //START
  // INSERT YOUR CODE
  //END

}

