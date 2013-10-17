
/*            *             ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: Circleapp.java
*            ***            # Project Name: Workbook Assignment 7-2
*             *             # Description: Here is my circle app program.
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


package Circle;

import java.util.Scanner;


public class CircleApp
{
    public static void main (String args[])
    {
        //Display welcome message
        System.out.println("Welcome to the Circle Tester");
        System.out.println();

        //Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        //Create circles until choice isn't equal to "Y" or "y".
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            //Get radius from the user.
            double myRadius = Validator.getDoubleWithinRange(sc, "Enter radius: ", 0, 100);

            Circle myCircle = new Circle(myRadius);

            //Display message to the user.
            System.out.println("Circumference: " + myCircle.getFormattedCircumference());
            System.out.println("Area: " + myCircle.getFormattedArea());
            System.out.println();

            //See if the user wants to continue.
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

        //Display the exit message.
        System.out.println("Goodbye. You created " + Circle.getObjectCount() + " Circle object(s). \n");
    }
}
