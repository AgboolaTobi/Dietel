package myPythonExercisesInJava;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade :");

        int grade = input.nextInt();
        grade = 0;
        if (grade < 91) {
            System.out.println
                    ("You did not get an A in this course!");

        }
    }
    }
