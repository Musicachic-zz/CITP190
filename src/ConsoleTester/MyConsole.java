package ConsoleTester;

import java.util.Scanner;

public class MyConsole implements ConsoleIO
{
    private static Scanner sc = null;

    public MyConsole(){
        sc = new Scanner(System.in);
    }


    @Override
    public int getInt(Scanner sc,String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (MyConsole.sc.hasNextInt())
            {
                i = MyConsole.sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            MyConsole.sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    @Override
    public int getIntWithinRange(String prompt, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                        "Error! Number must be greater than " + min);
            else if (i > max)
                System.out.println(
                        "Error! Number must be less or equal to " + max);
            else
                isValid = true;
        }
        return i;
    }

    @Override
    public double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (MyConsole.sc.hasNextDouble())
            {
                d = MyConsole.sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            MyConsole.sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    @Override
    public double getDoubleWithinRange(String prompt, double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                        "Error! Number must be greater than " + min);
            else if (d > max)
                System.out.println(
                        "Error! Number must be less than or equal to " + max);
            else
                isValid = true;
        }
        return d;
    }

    @Override
    public String getRequiredString(String prompt)
    {
        String s = "";
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s == null || s.equals(""))
            {
                System.out.println("Error! This entry is required. Try again.");
            }
            else
            {
                isValid = true;

            }

        }
        return s;
    }


    @Override
    public String getChoiceString(String prompt, String s1, String s2)
    {
        String s = " ";
        boolean isValid = false;
        s = getRequiredString(prompt);
        while (!isValid)
        {

            if (s.equalsIgnoreCase(s1)|| s.equalsIgnoreCase(s2))
                isValid = true;

            else
                System.out.println("Please enter x or y.");
                MyConsole.sc.nextLine();
        }
        return s;
    }

    @Override
    public void print(String prompt)
    {
        System.out.print(prompt + "\n");
    }

    @Override
    public void println(String prompt)
    {
        System.out.println(prompt + "\n");
    }

    @Override
    public void println()
    {
        System.out.println("\n");
    }
}
