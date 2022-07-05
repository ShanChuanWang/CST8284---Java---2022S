package assignment1.Action.sec301;

import java.lang.reflect.Field;

/**
 * This is the ActionDriver class for this program.
 * This means that it just runs the application with a method main.
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 13, 2022
 */

public class ActionDriver {

    /**
     * Reflection is used to in this method to exam if the regularAction class is the
     * subclass of Action class and has extra fields. Output the regular activity at the end.
     * @param args Command line arguments are not used by this program.
     * @throws Exception if class is not found
     */
    public static void main(String[] args) throws Exception {
        Class<?> regularActionClass = Class.forName("assignment1.Action.sec301.RegularAction");        
        Class<?> regularSuperClass = regularActionClass.getSuperclass();
        System.out.println("RegularAction is just a subclass of Action: " + (regularSuperClass == Action.class));
        System.out.println("Expected: true");

        Field[] fields = regularActionClass.getFields();
        System.out.println("RegularAction activities have no extra fields: " + (fields.length == 0));
        System.out.println("Expected: true");

        RegularAction regularAction = new RegularAction("Wash your hands");
        System.out.println("Looking at regular actions: " + regularAction);

        regularAction.occursOn(2022,2,2);
        System.out.println("Expected: true");

    }
}