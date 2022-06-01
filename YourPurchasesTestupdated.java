package lab4;


import org.junit.Test;
import org.junit.Assert;

public class YourPurchasesTestupdated
{
   private static final double EPSILON = 1E-12;

   @Test public void twoPurchases()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
   }
   

   // YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR 
   // WHILE YOU DEMO, MODIFY THIS TEST CASE SUITE TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
   // IMPROVE THIS CODE BY ADDING JUST ONE MORE TEST CASE (NOT ALREADY STATED IN THIS CODE)
   // RUN AND DEMO YOUR NEW TEST CASE SUITE 
   
   // ADD NEW TEST CASES HERE!!!
   // USE A DIFFERENT ASSERTION (NOT assertEquals) IN AT LEAST ONE OF YOUR TESTS.
   /**
    * this is to test if the change is right or not.
    * customer does 2 purchases and the pays 2 dollars,
    * the corrct change is 0.5 and the test result should be correct (true).
    */
   @Test public void rightCalculation() {
	   YourPurchases customer1 = new YourPurchases();
	   customer1.recordPurchase(0.7);
	   customer1.recordPurchase(0.8);
	   customer1.receivePayment(2, 0, 0, 0, 0);
	   double correctChange = 0.5;
	   boolean result;
	   if (correctChange == customer1.giveChange()) {
		   result = true;
	   } else {result = false;}
	   Assert.assertTrue("reulst is true", result);
	}
   
   /**
    * this is to test if 2 objects are the same. The result is false.
    */
   @Test public void objectCheck() {
	   YourPurchases customer2 = new YourPurchases();
	   YourPurchases customer3 = new YourPurchases();
	   Assert.assertSame("they are not the same", customer2, customer3);
   }
   
   
}