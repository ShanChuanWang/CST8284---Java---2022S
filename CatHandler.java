package cst8284_301_assignment2;

/**
 * CatHandler shows the subclass exceptionsExceptionTwo and ExceptionThree will be caught in the catch block of typeExceptionone. 
 * @author Shuai Wang
 * @version 1.0
 * @since Jul 2, 2022
 */

public class CatHandler {

    /**
     * inner class ExceptionOne extends Exception
     */
    class ExceptionOne extends Exception { }

    /**
     * inner class ExceptionTwo extends ExceptionOne
     */
    class ExceptionTwo extends ExceptionOne { }

    /**
     * inner class ExceptionThree extends ExceptionTwo
     */
    class ExceptionThree extends ExceptionTwo { }
    
    /**
     * This is the entry point for the application.
     * @param args Command line arguments are not used by this program.
     */
    public static void main(String[] args) {
        CatHandler catHandler = new CatHandler();
        /**
         * throw subclass ExceptionTwo
         */
        try {
            throw catHandler.new ExceptionTwo();
        }
        /**
         * catch the exception of type ExceptionOne
         */
        catch (ExceptionOne e) {
            e.printStackTrace();
        }

        /**
         * throw subclass ExceptionThree
         */
        try {
            throw catHandler.new ExceptionThree();
        }
        /**
         * catch the exception of type ExceptionOne
         */
        catch (ExceptionOne e) {
            e.printStackTrace();
        }
    }
}
