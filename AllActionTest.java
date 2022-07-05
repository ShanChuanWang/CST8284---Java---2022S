package assignment1.Action.sec301;

import java.util.Scanner;

/**
 * This is the AllActionTest class for this program.
 * This means that it just runs the application with a method main.
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 13, 2022
 */

public class AllActionTest {

   /**
    * This is the entry point for the application. An array of action objects are created
    * and filled with 5 actions. A while loop is used to show the results of each input date.
    * @param args Command line arguments are not used by this program.
    * @throws Exception if class is not found.
    */

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int year;
      int month;
      int day;
      boolean flag = true;
      Action[] actions = new Action[5];

      while (flag) {
         System.out.print("Enter a date (like 2018 01 30): ");
         year = scanner.nextInt();
         month = scanner.nextInt();
         day = scanner.nextInt();
         scanner.nextLine();
         System.out.printf("There are your actions on %02d/%02d/%4d%n", month, day, year);
         /**
          * index 0 stands for the regular action occurs every day
          */
         actions[0]= new RegularAction("Wash your hands.");
         System.out.println(actions[0]);
         /**
          * index 1 stands for the 1st occasional action occurs on the 1st of every month
          */
         actions[1] = new OccasionalAction(year, month, 1);
         if (actions[1].occursOn(year, month, day)) {
            actions[1].setDescription("Take a PCR test.");
            System.out.println(actions[1]);
         }
         /**
          * index 2 stands for the 2nd occasional action occurs on the 15th of every month
          */
         actions[2] = new OccasionalAction(year, month, 15);
         if (actions[2].occursOn(year, month, day)) {
            actions[2].setDescription("Get a booster shot.");
            System.out.println(actions[2]);
         }
         /**
          * index 3 stands for the rare action occurs on Dec 7th
          */
         actions[3] = new RareAction(year, 12, 7);
         if (actions[3].occursOn(year, month, day)) {
            actions[3].setDescription("Wear a mask.");
            System.out.println(actions[3]);
         }
         /**
          * index 4 stands for another regular action occurs every day
          */
         actions[4]= new RegularAction("Sit two meters apart.");
         System.out.println(actions[4]);
         System.out.println();
      }
   }
} // end
