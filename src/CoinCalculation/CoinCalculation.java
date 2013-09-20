/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: CoinCalculation.java
*            ***            # Project Name: Workbook Assignment 3-4
*             *             # Description: Here is my coin calculation program.
*                           ====================================================
*      *              *
*     ***            ***
*   *******        *******
*    *****          *****
*     ***            ***
*      *              *
*
*
*/

package CoinCalculation;

import java.util.Scanner;

public class CoinCalculation {
    public static void main(String[] args) {

        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            int totalQuarters = 0;
            int totalDimes = 0;
            int totalNickels = 0;
            int totalPennies = 0;

            //Welcome statement to the user.
            System.out.println("Welcome to the Change Calculator");
            System.out.println();

            //Have the user enter the number of cents.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();

            //Calculate the results.
            if (cents >= 25) {
                totalQuarters = cents / QUARTERS;
                cents = cents % QUARTERS;
            }
            if (cents >= 10) {
                totalDimes = cents / DIMES;
                cents = cents % DIMES;
            }
            if (cents >= 5) {
                totalNickels = cents / NICKELS;
                cents = cents % NICKELS;
            }
            if (cents >= 1) {
                totalPennies = cents;

            }

            //Format and display the results.
            String message =
                    "Quarters: " + totalQuarters + "\n"
                            + "Dimes: " + totalDimes + "\n"
                            + "Nickels: " + totalNickels + "\n"
                            + "Pennies: " + totalPennies;
            System.out.println(message);

            //See if the user wants to continue.
            System.out.print("Continue? (y/n) : ");
            choice = sc.next();
            System.out.println();
        }
    }
}

