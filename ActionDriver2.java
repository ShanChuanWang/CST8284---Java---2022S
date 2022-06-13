package CST8284_301_Assignment1;

import java.lang.reflect.Field;

public class ActionDriver2 {

    public static void main(String[] args) throws Exception{
        Class occasionalActionClass = Class.forName("CST8284_301_Assignment1.OccasionalAction");
        Class occasionalActionSuperClass = occasionalActionClass.getSuperclass();
        Class rareActionClass = Class.forName("CST8284_301_Assignment1.RareAction");
        Class rareActionSuperClass = rareActionClass.getSuperclass();

        if (occasionalActionSuperClass == Action.class) {
            System.out.println("OccasionalAction is subclass of Action: true");
            System.out.println("Expected: true");
        } else {
            System.out.println("Error message");
        }

        if (rareActionSuperClass == Action.class) {
            System.out.println("RareAction is subclass of Action: true");
            System.out.println("Expected: true");
        } else {
            System.out.println("Error message");
        }

        Field[] occasionActionFields = occasionalActionClass.getFields();
        if (occasionActionFields.length == 0) {
            System.out.println("OccasionalAction have no extra fields: true");
            System.out.println("Expected: true");
        }

        Field[] rareActionFields = occasionalActionClass.getFields();
        if (rareActionFields.length == 0) {
            System.out.println("RareAction have no extra fields:true");
            System.out.println("Expected: true");
        }

//        RegularAction regularAction = new RegularAction();
//        Method occursOn = occasionalActionClass.getDeclaredMethod("occursOn", int.class, int.class, int.class);
//        String expectedAction = "Wash your hands";
//        System.out.print("Looking at regular actions: ");
//        occursOn.invoke(regularAction, 2018, 12, 20);
//        System.out.println("Expected: " + expectedAction);
//        System.out.println("true");
//        System.out.println("Expected: true");

    }
}
