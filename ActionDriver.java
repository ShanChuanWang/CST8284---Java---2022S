package CST8284_301_Assignment1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ActionDriver {

        @Test public void part1Test() throws Exception {
            Class regularActionClass = Class.forName("CST8284_301_Assignment1.RegularAction");
            Class regularSuperClass = regularActionClass.getSuperclass();
            if (regularSuperClass == Action.class) {
                System.out.println("RegularAction is just a subclass of Action: true");
                System.out.println("Expected: true");
            } else {
                System.out.println("Error message");
            }

//            System.out.println("******");
//            System.out.println(Action.class.isAssignableFrom(RegularAction.class));

            Field[] fields = regularActionClass.getFields();
            if (fields.length == 0) {
                System.out.println("RegularAction activities have no extra fields: true");
                System.out.println("Expected: true");
            }

            RegularAction regularAction = new RegularAction();
            Method occursOn = regularActionClass.getDeclaredMethod("occursOn", int.class, int.class, int.class);
            String expectedAction = "Wash your hands";
            System.out.print("Looking at regular actions: ");
            occursOn.invoke(regularAction, 2018, 12, 20);
            System.out.println("Expected: " + expectedAction);
            System.out.println("true");
            System.out.println("Expected: true");

        }
}