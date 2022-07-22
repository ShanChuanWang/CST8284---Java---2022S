package cst8284_301_assignment2;

/**
 * FishHandler is to demonstrate rethrowing of an exception.
 * @author Shuai Wang
 * @version 1.0
 * @since Jul 2, 2022
 */

public class FishHandler {

	/**
	 * initially throws an exception
	 * @throws Exception throws if exception exits
	 */
    public static void easterEnding() throws Exception {
        /**
         * throw Exception
         */
        throw new Exception();
    }

    /**
     * calls easterEnding(), catches and rethrows exception
     * @throws Exception throw if exception exits
     */
    public static void easterStarting() throws Exception {
        try {
            easterEnding();
        }
        /**
         * catches exception and then rethrows it
         */
        catch (Exception e) {
            throw e;
        }
    }

    /**
     * main method to call easterStarting() method
     * and catch the rethrown exception
     * @param args Command line arguments are not used by this program.
     */
    public static void main(String[] args) {
        try {
            FishHandler fishHandler = new FishHandler();
            fishHandler.easterStarting();
        }
        /**
         * catches the rethrown exception
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
