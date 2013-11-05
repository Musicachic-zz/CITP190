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



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void bark(String name)
    {
       System.out.print(getName() + "Woof!");
    }
}
