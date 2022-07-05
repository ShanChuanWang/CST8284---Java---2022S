package assignment1.Action.sec301;

import java.lang.reflect.Field;

/**
 * This is the ActionDriver2 class for this program.
 * This means that it just runs the application with a method main.
 *
 * @author Shuai Wang
 * @version 1.0
 * @since Jun 13, 2022
 */
public class ActionDriver2 {
    /**
     * Reflection is used to in this method to exam if the occasionalAction class and
     * rareAction class are the subclass of Action class and have extra fields.
     * @param args Command line arguments are not used by this program.
     * @throws Exception if class is not found.
     */
    public static void main(String[] args) throws Exception {
        Class<?> occasionalActionClass = Class.forName("assignment1.Action.sec301.OccasionalAction");
        Class<?> occasionalActionSuperClass = occasionalActionClass.getSuperclass();
        Class<?> rareActionClass = Class.forName("assignment1.Action.sec301.RareAction");
        Class<?> rareActionSuperClass = rareActionClass.getSuperclass();

        System.out.println("OccasionalAction is subclass of Action: " +(occasionalActionSuperClass == Action.class));
        System.out.println("Expected: true");

        System.out.println("RareAction is subclass of Action: " + (rareActionSuperClass == Action.class));
        System.out.println("Expected: true");

        Field[] occasionalActionFields = occasionalActionClass.getFields();

        System.out.println("OccasionalAction have no extra fields: " + (occasionalActionFields.length == 0));
        System.out.println("Expected: true");

        Field[] rareActionFields = occasionalActionClass.getFields();

        System.out.println("RareAction have no extra fields: " + (rareActionFields.length == 0));
        System.out.println("Expected: true");
    }
}
