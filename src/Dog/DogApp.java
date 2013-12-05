package Dog;

import java.util.Scanner;

public class DogApp
{
    public static void main (String args[])
    {
        System.out.println("Tell us information about your dog!");
        System.out.println();

        Scanner sc = new Scanner(System.in);


        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {

            Dog dog = new Dog();

            //String name = dog.getName(sc, "Enter your dog's name: ");
            System.out.print("Enter your dog's name: ");
            String getName = sc.next();
            dog.setName(getName);

            System.out.print("Enter your dog's breed: ");
            String getBreed = sc.next();

            System.out.print("Enter your dog's color: ");
            String getColor = sc.next();



            System.out.print("Enter your dog's weight: ");
            double setWeight = sc.nextDouble();


            System.out.print("Enter your dog's height: ");
            double getHeight = sc.nextDouble();


            System.out.print("Enter your dog's length: ");
            double getLength = sc.nextDouble();

            dog.Bark();

            System.out.print("Continue?: (y/n)");
            choice = sc.next();
            System.out.println();
        }
    }


}
