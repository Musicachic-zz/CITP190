/*            *             ====================================================
*            ***            # Name: Teresa Potts
*          *******          # Course Name: CITP 190
*           *****           # Java Source File: Dog.java
*            ***            # Project Name: Handout 2 extra credit
*             *             # Description: Here is my Dog program.
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

package Dog;


import java.util.Scanner;

public class Dog
{
    private String name;
    private String breed;
    private String color;
    private double weight;
    private double height;
    private double length;

    public Dog()
    {
        this.name = "";
        this.breed = "";
        this.color = "";
        this.weight = 0;
        this.height = 0;
        this.length = 0;
    }



    public String getName(Scanner sc, String s)
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreed(Scanner sc, String s)
    {
        return breed;
    }

    public void setBreed(Scanner sc, String breed)
    {
        this.breed = breed;
    }

    public String getColor(Scanner sc, String s)
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getWeight(Scanner sc, double v)
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getHeight(Scanner sc, double v)
    {
        return height;
    }

    public void setHeight(Scanner sc, double height)
    {
        this.height = height;
    }

    public double getLength(Scanner sc, double v)
    {
        return length;
    }

    public void setLength(Scanner sc, double length)
    {
        this.length = length;
    }

    public void Bark()
    {
        System.out.println(name + " says Woof!");

    }



}
