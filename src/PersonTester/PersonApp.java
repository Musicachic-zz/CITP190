/*            *             ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: PersonApp.java
*            ***            # Project Name: Workbook Assignment 8-2
*             *             # Description: Here is my Person Tester program.
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

package PersonTester;

import java.util.Scanner;

public class PersonApp
{
    public static void main(String args[])
    {
        //Display a welcome message.

        System.out.println("Welcome to the Person Tester Application");
        System.out.println();

        //Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        //Continue until choice isn't equal to "Y" or "y".
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            String personType = Validator.getRequiredString(sc, "Create customer or employee? (c/e): ");
            System.out.println();

            if (personType.equalsIgnoreCase("c") || personType.equalsIgnoreCase("e"))
            {
                String firstName = Validator.getRequiredString(sc,"Enter first name: ");
                String lastName = Validator.getRequiredString(sc, "Enter last name: ");
                String email = Validator.getRequiredString(sc, "Enter email address: ");

                if(personType.equalsIgnoreCase("c"))
                {
                    String custNum = Validator.getRequiredString(sc, "Enter customer number: ");
                    System.out.println();

                    Customer customer = new Customer(firstName, lastName, email);
                    customer.setFirstName(firstName);
                    customer.setLastName(lastName);
                    customer.setEmail(email);
                    customer.setCustNum(custNum);

                    print(customer);
                }
                else if(personType.equalsIgnoreCase("e"))
                {
                    String ssn = Validator.getRequiredString(sc, "Enter employee Social Security Number: ");
                    System.out.println();

                    Employee employee = new Employee(firstName, lastName, email);
                    employee.setFirstName(firstName);
                    employee.setLastName(lastName);
                    employee.setEmail(email);
                    employee.setSsn(ssn);

                    print(employee);
                }

            }
            else
            {
                System.out.println("Error! Invalid selection. Try again. \n");
                continue;
            }

            //See if the user wants to continue.
            choice = Validator.getRequiredString(sc, "Continue? (y/n): ");
            System.out.println();
        }
    }

    private static void print(Person person)
    {
        System.out.println("You entered: ");
        System.out.println(person.getDisplayText());
    }
}
