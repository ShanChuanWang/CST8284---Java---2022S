
/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Shuai Wang
 * @version 1.0
 * @since May 25, 2022
 */
public class TestDemo {

    /**
     * This is the entry point for the application, it instantiates 4 Cars
     * and 4 Bicycles to show-case the constructors. Anonymous objects are used and
     * each one is only retained long enough to call method create report on
     * each. No variable names were used, just new Constructor().methodCall().
     * @param args Command line arguments are not used by this program.
     */

    public static void main(String[] args) {

        System.out.println("Just creating 4 cars\n");
        System.out.println("Car1");
        Car car1 = new Car();
        System.out.println(car1.createReport());
        System.out.println("\n");

        System.out.println("Car2");
        Car car2 = new Car("Car2");
        System.out.println(car2.createReport());
        System.out.println("\n");

        System.out.println("Car3");
        Car car3 = new Car("car3", true);
        System.out.println(car3.createReport());
        System.out.println("\n");

        System.out.println("Car4");
        Car car4 = new Car("car4", true, 9.5);
        System.out.println(car4.createReport());
        System.out.println("\n");

        System.out.println("Just creating 4 Bicycles\n");
        System.out.println("bicycle1");
        Bicycle bicycle1 = new Bicycle();
        System.out.println(bicycle1.createReport());
        System.out.println("\n");

        System.out.println("bicycle2");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        System.out.println(bicycle2.createReport());
        System.out.println("\n");

        System.out.println("bicycle3");
        Bicycle bicycle3 = new Bicycle("bicycle3", true);
        bicycle3.setVariety("bicycle3");
        System.out.println(bicycle3.createReport());
        System.out.println("\n");

        System.out.println("bicycle4");
        Bicycle bicycle4 = new Bicycle("bicycle4", true, 7);
        bicycle4.setVariety("bicycle4");
        bicycle4.setElectric(true);
        System.out.println(bicycle4.createReport());
        System.out.println("\n");
    }

}
