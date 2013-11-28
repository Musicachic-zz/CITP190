/*            *             ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: PersonApp.java
*            ***            # Project Name: Workbook Assignment 14-1
*             *             # Description: Here is my File Checker App.
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

package FileChecker;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;

public class FileCheckerApp
{
    public static void main(String args[]) throws FileNotFoundException
    {

        System.out.println("Welcome to the File Checker Application.");
        String choice = "y";

        while (choice.equalsIgnoreCase("y")){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a file path and name: ");
            String pathName = sc.next();
            File f = new File(pathName);

            if (f.exists())
            {
                System.out.println("That file exists.");
            }

            else
            {
                System.out.println("That file does not exist.");
            }

/*            try
            {
                FileInputStream f = new FileInputStream(pathName);
                System.out.println("That file exists.");
            }
            catch (FileNotFoundException e)
            {
                System.out.println("That file does not exist.");
                return null;
            }*/
            System.out.println("Check another file? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
    }
}
