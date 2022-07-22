package cst8284_301_lab7;
// LAB 7: PaymeInterfaceTest.java

//This is the test for interface Payme.

/**
 * This is the PaymeInterfaceTest class for this program.
 * This means that it just runs the application with a method main.
 * @author Shuai Wang
 * @version 1.0
 * @since July 19, 2022
 *
 */

public class PaymeInterfaceTest  {
	/**
	 * This is the entry point for the application. A Payme array is created using polymorphism.
     * A for-each loop is used to show the results.
	 * @param args, Command line arguments are not used by this program.
	 */
    public static void main(String[] args) {
        // TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE
        // CREATE SIX-ELEMENTS Payme array HERE
        // START CODE
    	/**
         * create subclass objects
         */
        Invoice invoice1 = new Invoice("22776","steering",3,300);
        Invoice invoice2 = new Invoice("33442","cruise",5,90.99);
        SalariedProgrammer salariedProgrammer = new SalariedProgrammer(
                "Chioma", "Chidimma", "345-67-8901", 320.00);
        HourlyProgrammer hourlyProgrammer = new HourlyProgrammer(
                "Cheng", "Lui", "234-56-7890", 18.95,40);
        CommissionProgrammer commissionProgrammer = new CommissionProgrammer(
                "Matthew", "Goodman", "123-45-6789", 16500,  .44);
        BasePlusCommissionProgrammer basePlusCommissionProgrammer = new BasePlusCommissionProgrammer(
                "Ramjeet", "Patel", "102-34-5678", 1200, .04, 720);

        // END CODE

        // TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
        // CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
        // LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

        // START CODE
        /**
         * create and initialize the array using Interface Payme
         */
        Payme[] paymeObjects = new Payme[] {invoice1, invoice2, salariedProgrammer,
                hourlyProgrammer, commissionProgrammer, basePlusCommissionProgrammer};

        // END CODE

        System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

        /**
         * generically process each element in array
         */
        for (Payme currentPayme : paymeObjects) {
            // output currentPayme and its appropriate payment amount
            System.out.printf("%s\n", currentPayme.toString());

            if (currentPayme instanceof BasePlusCommissionProgrammer) {
            // downcast Payme reference to
            // BasePlusCommissioProgrammer reference
                BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

                double oldBaseSalary = programmer.getBaseSalary();
                programmer.setBaseSalary(1.10 * oldBaseSalary);
                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
              programmer.getBaseSalary());
            }

            // TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR
            // OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED
            /**
             * using Polymophism to run the method of each class
             */
            System.out.printf("%s: $%,.2f\n\n", "payment due",currentPayme.getPaymentAmount());
            // START CODE
            // END CODE
        }
    }
}


