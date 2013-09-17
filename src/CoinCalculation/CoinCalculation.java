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

import java.lang.Math;
import java.math.BigDecimal;
import java.util.Scanner;
import java.text.NumberFormat;

public class CoinCalculation
{
    public static void main(String[] args)
    {

        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        final int PENNIES = 1;
        int remainderAfterQuarters;
        int remainderAfterDimes;
        int remainderAfterNickels

        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {

            //Welcome statement to the user.
            System.out.println("Welcome to the Change Calculator");
            System.out.println();

            //Have the user enter the number of cents.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();

            //Calculate the results.
            if (cents >= 25)
            {
                int totalQuarters = cents/QUARTERS;
                remainderAfterQuarters = cents%QUARTERS;
            }
            if (remainderAfterQuarters >= 10 )
            {
                int totalDimes = remainderAfterQuarters/DIMES;
                remainderAfterDimes = cents%DIMES;
            }
            if (remainderAfterDimes >=5)
            {
                int totalNickels = remainderAfterDimes/NICKELS;
                remainderAfterNickels = cents%NICKELS;
            }

        }

    }
}
