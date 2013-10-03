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

        int MIN = 1;
        int MAX = 101;
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
            double comGuess = ((computerGuess * 100) + 1)%100;
            int cg = (int) comGuess;
            System.out.println(cg);

            //Have the user enter guesses.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int y = sc.nextInt();

            while (y != cg)

            {
                y = getIntWithinRange(sc, y, MIN, MAX);
                y = getInt(sc, y);
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

                y = sc.nextInt();

            }
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

            System.out.println("Would you like to play again? (y/n): ");
            choice = sc.next();
        }

        System.out.println();
        System.out.println("Thanks for playing!");
    }
    public static int getIntWithinRange (Scanner sc, int y, int min, int max){
        boolean isValid = false;
        while (!isValid)
        {
            if (y < min)
            {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
                System.out.println("Enter another number: ");
                y = sc.nextInt();
            }
            else if (y >= max)
            {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
                System.out.println("Enter another number: ");
                y = sc.nextInt();
            }
            else isValid = true;


        }
        return y;
    }

    public static int getInt(Scanner sc, int y){
        y = sc.nextInt();
        boolean isValid = false;
        while (!isValid)
        {
            if (sc.hasNextInt())
            {
//                y = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println(
                        "Error! Invalid integer value. Try again.");
            }
            y = sc.nextInt();
        }
        return y;
    }

}

