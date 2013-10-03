/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: CoinCalculation.java
*            ***            # Project Name: Workbook Assignment 5-3
*             *             # Description: Here is my number game program.
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

package NumberGame;

import java.util.Scanner;
import java.util.Random;
import java.text.*;

public class NumberGame
{
    public static void main (String[] args)
    {

        int min = 1;
        int max = 100;
        int ACCUMULATOR = 0;
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            //Welcome statement to the user.
            System.out.println("Welcome to the Guess Number Game");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println();

            System.out.println("I'm thinking of a number from 1 to 100.");
            System.out.println("Try to guess it.");
            System.out.println();

            //Generate the computer's random guess.
            double computerGuess = Math.random();
            double cg = (computerGuess * 100) + 1;
            System.out.println((int) cg);

            //Have the user enter guesses.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int y = sc.nextInt();

            while (y != cg)
            {

                if (y > cg + 10)
                {
                    System.out.println("Way too high! Guess again.");

                }
                else if (y < cg)
                {
                    System.out.println("Too low! Guess again.");
                }

                else
                    System.out.println("Too high! Guess again.");

                ACCUMULATOR += 1;

            }
            while (y == cg) {
                if (ACCUMULATOR <= 3)
                {
                    System.out.println("Great work! You are a mathematical wizard.");
                }
                else if (ACCUMULATOR > 7)
                {
                    System.out.println("What took you so long? Maybe you should take some lessons.");
                }
                else
                    System.out.println("Not too bad! You've got some potential.");
            }

        }
    }
    public static int getIntWithinRange (Scanner sc, String prompt, int min, int max){
        int i = 0;
        boolean isValid = false;
        while (!isValid){
            i = getInt(sc, prompt);
            if (i , min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                        "Error! Number must be greater than " + max + ".");
            else isValid = true;
    }
        return i;
    }

    public static int getInt(Scanner sc, String prompt){
        int i = 0;
        boolean isValid = false;
        while (!isValid){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextInt();
                isValid = true;
        }
            else {
                System.out.println(
                        "Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
            }
        return i;
    }

}

