package StudentScores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class StudentScoreApp
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Student Scores Application.");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = Validator.getInt(sc, "Enter number of students to enter: ");

        Student[] arrayStudents = new Student[numberOfStudents];

        for (int i=0; i < arrayStudents.length; i++)
        {

            String lastName = Validator.getRequiredString(sc, "Enter last name: ");
            String firstName = Validator.getRequiredString(sc, "Enter first name: ");
            int score = Validator.getIntWithinRange(sc, "Enter score: ", 0,100);

            Student s = new Student(lastName, firstName, score);

        }
        Arrays.sort(arrayStudents);
        System.out.println(Arrays.toString(arrayStudents));


        /*for (int i=0; i < arrayStudents.length; i++){
            {
                System.out.println(arrayStudents[i]);
            }*/
        }
    }

