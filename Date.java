
package CST8284_301_Lab6;

// THIS IS LAB 6 -  Date.java
//Date class declaration.

public class Date {
 private int month; // 1-12
 private int year; // any year


 //constructor: confirm proper value for month given the year
 public Date(int month, int year) {
  // check if month in range
  if (month <= 0 || month > 12) {
     throw new IllegalArgumentException(
        "month (" + month + ") must be 1-12");
  }

  this.month = month;
  this.year = year;

  System.out.printf(
     "Date object constructor for date %s%n", this);
 }


 // TO DO: COMPLETE THIS PORTION OF THE CODE (add get methods)!!!!!!!
 //START
 //INSERT CODE
 //END

 public int getMonth() {
  return month;
 }

 public int getYear() {
  return year;
 }


 // TO DO: ALSO COMPLETE THIS PORTION OF THE CODE!!!!
 // You are required to insert code to return a String of the form month/year.

 // START
 //INSERT CODE
 //END
 @Override
 public String toString() {
  return ( + "l"  );
 }
}

