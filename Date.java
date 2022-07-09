package polylab;
/**
 * THIS IS LAB 6 - Date.java
 * @author Professor
 */

public class Date {
	private int month; // 1-12
	private int year; // any year

	/**
	 * constructor: confirm proper value for month given the year
	 * @param month, monht
	 * @param year, year
	 */
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
	
	/**
	 * to get month
	 * @return int, month
	 */
	public int getMonth() {
		return month;
		}
	/**
	 * to get year
	 * @return int, year
	 */
	public int getYear() {
		return year;
		}
	/**
	  * override the original toString method to return the form month/year
	  * @return String of the form month/year
	  */
	@Override
	public String toString() {
		String result= getMonth() + "/" + getYear();
		return result;
		}
}

