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

            int greatComDom = 0;
            int newNumber = 0;

            //Welcome statement to the user.
            System.out.println("Greatest Common Divisor Finder");
            System.out.println();

            //Have the user enter the first number.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            //Have the user enter the second number.
            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            if (firstNumber == secondNumber){
                greatComDom = firstNumber;
                break;
            }
            if (firstNumber > secondNumber){
                firstNumber-secondNumber = newNumber;

                if (newNumber)
            }

             String message = "Greatest common divisor : " + greatComDom;
             System.out.println(message);

             //See if the user wants to continue.
             System.out.print("Continue? (y/n) : ");
             choice = sc.next();
             System.out.println();
            }
    }
}
}