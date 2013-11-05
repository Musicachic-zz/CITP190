package ConsoleTester;


import java.util.Scanner;

public interface ConsoleInput
{
    // Use this for int values
    int getInt(Scanner sc, String prompt);
    int getIntWithinRange(String prompt, int min, int max);

    // Use this for double values
    double getDouble(Scanner sc, String prompt);
    double getDoubleWithinRange(String prompt, double min, double max);

    // Use this for strings
    String getRequiredString(String prompt);
    String getChoiceString(String prompt, String s1, String s2);
}
