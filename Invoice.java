package cst8284_301_lab7;

/**
 * class Invoice implements Interface Payme
 * @author professor
 *
 */

//LAB 7 - CST8284
//LAB 7: Invoice.java

//This is the Invoice class which is an UNRELATED CLASS to Programmer

//The Invoice class implements Payme interface. NO MODIFICATION IS REQUIRED HERE!!!

public class Invoice implements Payme {

	 private String partNumber;
	 private String partDescription;
	 private int quantity;
	 private double pricePerItem;
	
	 //four-argument constructor
	 /**
	  * four-argument constructor
	  * @param part, part
	  * @param description, description
	  * @param count, count
	  * @param price, price
	  */
	 public Invoice(String part, String description, int count, double price) {
		  partNumber = part;
		  partDescription = description;
		  setQuantity(count); // validate and store quantity
		  setPricePerItem(price); // validate and store price per item
	 }
	
	 //set part number
	 /**
	  * to set part number
	  * @param part, String part number
	  */
	 public void setPartNumber(String part) {
		 partNumber = part; // should validate
	 }
	
	 //get part number
	 /**
	  * to get part number
	  * @return String, part number
	  */
	 public String getPartNumber() {
		 return partNumber;
	 }
	
	 //set description
	 /**
	  * to set part description
	  * @param description, String part description
	  */
	 public void setPartDescription(String description) {
		 partDescription = description; // should validate
	 }
	
	 //get description
	 /**
	  * to get part description
	  * @return String, part description
	  */
	 public String getPartDescription() {
		 return partDescription;
	 }
	
	 //set quantity
	 /**
	  * to set quantity
	  * @param count, int quantity
	  */
	 public void setQuantity(int count) {
		 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	 }
	
	 //get quantity
	 /**
	  * to get quantity
	  * @return int, quantity
	  */
	 public int getQuantity() {
		 return quantity;
	 }
	 
	 //set price per item
	 /**
	  * to set price per item
	  * @param price, double price per item
	  */
	 public void setPricePerItem(double price) {
		 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	 }
	
	 //get price per item
	 /**
	  * to get price per item
	  * @return double, price per item
	  */
	 public double getPricePerItem() {
		 return pricePerItem;
	 }
	
	 //return String representation of Invoice object
	 @Override
	 public String toString() {
		  return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
		     "invoice", "part number", getPartNumber(), getPartDescription(),
		     "quantity", getQuantity(), "price per item", getPricePerItem());
	 }
	
	 //method required to carry out contract with interface Payme
	 @Override
	 public double getPaymentAmount() {
		 return getQuantity() * getPricePerItem(); // calculate total cost
	 }
}


