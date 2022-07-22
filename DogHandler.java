package cst8284_301_assignment2;
import java.io.IOException;

/**
 * DogHandler demonstrates the use of the catch block using catch (Exception exception).
 * * @author Shuai Wang
 * @version 1.0
 * @since Jul 2, 2022
 */

public class DogHandler {
    /**
     * inner class ExceptionDog extends Exception
     */
    public class ExceptionDog extends Exception { }

    /**
     * inner class ExceptionPuppy extends ExceptionDog
     */
    public class ExceptionPuppy extends ExceptionDog { }

    /**
     * method1 to throw and catch ExceptionDog
     */
    public static void method1() {
        DogHandler dogHandler = new DogHandler();
        try {
            throw dogHandler.new ExceptionDog();
        }
        /**
         * catch the exception of type Exception
         */
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method2 to throw and catch ExceptionPuppy
     */
    public static void method2() {
        DogHandler dogHandler = new DogHandler();
        try {
            throw dogHandler.new ExceptionPuppy();
        }
        /**
         * catch the exception of type Exception
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * method3 to throw and catch NullPointerException
     */
    public static void method3() {
        try {
            throw new NullPointerException();
        }
        /**
         * catch the exception of type Exception
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * method4 to throw and catch IOException
     */
    public static void method4() {
        try {
            throw new IOException();
        }
        /**
         * catch the exception of type Exception
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * this program is to call all 4 methods
     * @param args Command line arguments are not used by this program.
     */
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
