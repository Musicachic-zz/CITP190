package Circle;

import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle
{
    private double radius;
    private static int objectCount;

    public Circle(double radius)
    {
        this.radius = radius;

        objectCount++;
    }

    //Circumference
    public double getCircumference()
    {
        return  2 * Math.PI * radius;
    }

    //Shorten the circumference to 2 decimal places.
    public String getFormattedCircumference()
    {
        NumberFormat Circumference = NumberFormat.getNumberInstance();
        DecimalFormat df = (DecimalFormat)Circumference;
        df.applyPattern("###,###.00");
        return Circumference.format(this.getCircumference());

    }

    //Area
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }

    //Shorten the area to 2 decimal places.
    public String getFormattedArea()
    {
        NumberFormat Area = NumberFormat.getNumberInstance();
        DecimalFormat df = (DecimalFormat)Area;
        df.applyPattern("###,###.00");
        return Area.format(this.getArea());
    }

    public static int getObjectCount()
    {
        return objectCount;
    }
}
