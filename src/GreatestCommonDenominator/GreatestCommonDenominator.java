/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: CoinCalculation.java
*            ***            # Project Name: Workbook Assignment 4-3
*             *             # Description: Here is my greatest common denominator program.
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

package GreatestCommonDenominator;

import java.util.Scanner;

public class GreatestCommonDenominator {
    public static void main(String[] args) {

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            //Welcome statement to the user.
            System.out.println("Greatest Common Divisor Finder");
            System.out.println();

            //Have the user enter the first number.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            //Have the user enter the second number.
            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            while (y > 0) {

                if (x > y) {

                    int temp = x;
                    x = y;
                    y = temp;
                } else
                    y = y - x;
            }


            String message = "Greatest common divisor : " + x;
            System.out.println(message);

            //See if the user wants to continue.
            System.out.print("Continue? (y/n) : ");
            choice = sc.next();
            System.out.println();
        }
    }
}
