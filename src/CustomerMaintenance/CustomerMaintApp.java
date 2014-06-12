package CustomerMaintenance;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMaintApp
{

    public static void main (String args[])
    {
        ArrayList<Customer> myCustomer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Customer Maintenance application");
        System.out.println();

        System.out.println("COMMAND MENU");
        System.out.println("list - List all customers");
        System.out.println("add - Add a customer");
        System.out.println("del - Delete a customer");
        System.out.println("help - Show this menu");
        System.out.println("exit - Exit this application");

        System.out.println("Enter a command: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("list"))
        {
           for (int i=0; i < myCustomer.size(); i++){
               System.out.print(myCustomer.toString());

           }
        }

    }
}
