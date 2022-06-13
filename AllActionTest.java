package CST8284_301_Assignment1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * In this file, you are required to write code for your Part 3.
 * The reason for this class is to demonstrate the Action class and subclasses.
 * You must fill an array of action objects
 * (hint: check the sample output file provided for you) with
 * different action activities.
 * A user of this system should be able to input a date of their choice and
 * retrieve an output of all activities that would occur on that date.
 * You should reuse the Action class and RegularAction classes from
 * Part I of your solution and then the OccasionalAction
 * and RareAction classes from your Part 2.
 */


public class AllActionTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int year;
      int month;
      int day;
      boolean flag = true;

      while (flag) {
         System.out.print("Enter a date (like 2018 01 30): ");
         year = scanner.nextInt();
         month = scanner.nextInt();
         day = scanner.nextInt();
         scanner.nextLine();
         System.out.printf("There are your actions on %02d/%02d/%4d%n", day, month, year);

      }


//      SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy MM dd");
//      try {
//         dateFormat1(dateInput);
//      }
//      catch (
//
//      );

   }
}
