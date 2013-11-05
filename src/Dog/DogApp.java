package Dog;

import java.util.Scanner;

public class DogApp
{
    public static void main (String args[])
    {
        System.out.println("Tell us information about your dog!");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();

        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter your dog's name: ");
            String name = sc.next();

            System.out.print("Enter your dog's breed: ");
            String breed = sc.next();

            System.out.print("Enter your dog's color: ");
            String color = sc.next();

            System.out.print("Enter your dog's weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your dog's height: ");
            double height = sc.nextDouble();

            System.out.print("Enter your dog's length: ");
            double length = sc.nextDouble();

            System.out.print("Continue?: (y/n)");
            choice = sc.next();
            System.out.println();
        }
    }
}
