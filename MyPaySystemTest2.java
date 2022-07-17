package polylab;

/**
 * This is the MyPaySystemTest class for this program.
 * This means that it just runs the application with a method main.
 * @author Shuai Wang
 * @version 1.0
 * @since July 6, 2022
 */

import java.util.Scanner;
/**
 * This program uses Scanner to obtain user input
 */

public class MyPaySystemTest2 {
    /**
     * This is the entry point for the application. A programmer array is created using polymorphism.
     * A for-each loop is used to show the results.
     * @param args Command line arguments are not used by this program.
     */
    public static void main(String[] args) {
        int month;
        /**
         * create subclass objects
         */
        SalariedProgrammer salariedProgrammer = new SalariedProgrammer(
                "Emmanuel", "Okoro", "123-11-4567", 6, 1992, 500.00);
        HourlyProgrammer hourlyProgrammer = new HourlyProgrammer(
                "Mary", "Cheng", "890-22-1234", 12, 1981, 16.75, 40);
        CommissionProgrammer commissionProgrammer = new CommissionProgrammer(
                "Martha", "Peter", "567-33-8901", 9, 1983, 23000, .06);
        BasePlusCommissionProgrammer basePlusCommissionProgrammer = new BasePlusCommissionProgrammer(
                "John", "Mark", "234-44-5678", 3, 1978, 9000, .04, 300);
        ActionProgrammer actionProgrammer = new ActionProgrammer(
                "Shuai", "Wang", "123-456-789", 8, 1985, 28.9, 8);

        System.out.println("Programmers are processed individually:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedProgrammer, "earned", salariedProgrammer.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                hourlyProgrammer, "earned", hourlyProgrammer.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                commissionProgrammer, "earned", commissionProgrammer.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                basePlusCommissionProgrammer,
                "earned", basePlusCommissionProgrammer.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                actionProgrammer, "earned", actionProgrammer.earnings());

        /**
         * create and initialize the programmer array
         */
        Programmer[] programmer = new Programmer[]
                {salariedProgrammer, hourlyProgrammer, commissionProgrammer,
                        basePlusCommissionProgrammer, actionProgrammer};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current month (1 - 12): ");
        month = scanner.nextInt();

        System.out.println("Programmers processed polymorphically:\n");
        /**
         * generically process each element in array
         */
        for (Programmer currentProgrammer : programmer) {
            System.out.println(currentProgrammer);// invokes toString

            // determine whether element is a BasePlusCommissionProgrammer
            if (currentProgrammer instanceof BasePlusCommissionProgrammer) {
                // downcast Programmer reference to
                // BasePlusCommissionProgrammer reference
                BasePlusCommissionProgrammer programmers =
                        (BasePlusCommissionProgrammer) currentProgrammer;

                double oldBaseSalary = programmers.getBaseSalary();
                programmers.setBaseSalary(1.10 * oldBaseSalary);
                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f\n",
                        programmers.getBaseSalary());
            }

            /**
             * to determine if this is the month of the programmer's birthday, add $500 to his salary
             * otherwise just state what this programmer currently earned.
             */
            if (month == currentProgrammer.getBirthDate().getMonth()) {
                System.out.printf("earned: $%,.2f plus $500 birthday bonus\n", currentProgrammer.earnings());
            } else {
                System.out.printf("earned: $%,.2f\n", currentProgrammer.earnings());
            }
            System.out.println();
        }

        /**
         * get type name of each object in programmers array
         */
        for (int j = 0; j < programmer.length; j++) {
            System.out.printf("Programmer %d is a %s\n", j,
                    programmer[j].getClass().getName());
        }
    }
}
