/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: Rectangle.java
*            ***            # Project Name: Workbook Assignment 2-1
*             *             # Description: Here is my rectangle program.
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
package Rectangle;

import java.util.Scanner;

public class Rectangle {


    public static void main(String[] args) {

        String choice = "y";
        while (choice.equalsIgnoreCase("y"))

        {



            //Welcome statement to the user.
            System.out.println("Welcome to the Area and Perimeter Calculator");
            System.out.println();

            //Get length from the user.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            //Get width from the user.
            Scanner sd = new Scanner(System.in);
            System.out.print("Enter width: ");
            double width = sd.nextDouble();

            //Calculate the area and display it to the user.
            double area = length * width;
            System.out.println("Area: " + area);


            //Calculate the perimeter and display it to the user.
            double perimeter = 2 * width + 2 * length;
            System.out.println("Perimeter: " + perimeter);

            //See if the user wants to continue.
            System.out.print("Continue? (Y/N): ");
            choice = sc.next();
            System.out.println();

        }
    }
}
