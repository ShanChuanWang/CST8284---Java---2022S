/**
 * The Lab 2 program is to demonstrate the required pattern of the number of the trades for each month of the year
 * for each city by using the nested for loop and printf to format the output.
 * This program is completed based on the original Java codes provided by the professor.
 *
 * @author - Shuai Wang
 * @version - 1.0
 * @since - May 20, 2022
 */

public class Spice
{
    /**
     * This is the main method that gives the details of the codes.
     * @param args unused.
     */
    public static void main(String[] args)
    {
        final int ROWS = 9;
        final int COLUMNS = 12;

        int[][] traders =
                {
                        { 150, 140, 225, 130, 220, 110, 120, 100, 115, 200, 192, 224 },
                        { 220, 137, 26, 82, 502, 615, 209, 947, 116, 214, 278, 238 },
                        { 103, 203, 276, 308, 172, 246, 354, 118, 123, 310, 146, 152 },
                        { 210, 260, 234, 108, 149, 202, 216, 58, 244, 155, 167, 221 },
                        { 203, 274, 226, 182, 152, 107, 192, 265, 123, 110, 146, 152 },
                        { 223, 184, 236, 234, 167, 121, 208, 201, 186, 109, 141, 176 },
                        { 136, 219, 131, 191, 187, 201, 278, 106, 153, 172, 109, 146 },
                        { 201, 104, 121, 13, 121, 69, 246, 100, 123, 161, 69, 175 },
                        { 100, 235, 106, 222, 175, 143, 208, 157, 163, 141, 208, 189 }
                };

        String[] cities =
                {
                        "Ottawa",
                        "Perth",
                        "Pembroke",
                        "Kingston",
                        "Toronto",
                        "Niagara",
                        "London",
                        "Waterloo",
                        "Guelph"
                };

//        System.out.println("              Month      Jan     Feb    March    April   May   June   July    Aug
//        Sept      Oct      Nov    Dec");
//        System.out.println();

        /**
         * convert each month to a 1-D String array and then use printf to format the output
         */
        String[] months = {"Month", "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept",
                "Oct", "Nov", "Dec"};
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%10s", months[i]);
        }
        System.out.println();

        /**
         * a nested for loop is used to list the cities and traders and then the printf is used to format the output
         */
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%10s", cities[i]);
            for (int j = 0; j < traders[i].length; j++) {
                System.out.printf("%10d", traders[i][j]);
            }
            System.out.println();
        }

        System.out.println();


        /**
         * a nested for loop is used to computer the sum column for each city and then the printf is used
         * to format the output.
         */

        System.out.printf("%10s", "Traders");
        for (int i = 0; i < COLUMNS; i++) {
            int sum = 0;
            for (int j = 0; j < ROWS; j++) {
                sum += traders[j][i];
            }
            System.out.printf("%10d", sum);

        }
        System.out.println();

        System.out.println("\n\tFood spice trading is very lucrative!" );
    }
}