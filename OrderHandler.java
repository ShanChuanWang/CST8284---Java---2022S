package cst8284_301_assignment2;
import java.io.IOException;

/**
 * OrderHandler is to show that the arrangement (order) of the catch blocks in your program is essential.
 * @author Shuai Wang
 * @version 1.0
 * @since Jul 2, 2022
 */

public class OrderHandler {
	/**
     * This is the entry point for the application.
     * @param args Command line arguments are not used by this program.
     */
    public static void main(String[] args) {
        /**
         * instantiate superclass Exception
         */
        Exception exceptionClass = new Exception();

        /**
         * instantiate subclass IOException
         */
        Exception ioExceptionClass = new IOException();
        /**
         * throw superclass
         */
        try {
            throw exceptionClass;
        }
        /**
         * catch superclass before subclass
         */
        catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * catch subclass, this will be a compilation error
         */
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * throw subclass
         */
        try {
            throw ioExceptionClass;
        }
        /**
         * catch subclass before superclass
         */
        catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * catch superclass
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
