package myPythonExercisesInJava;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);

        System.out.print("Enter am integer rating between 1 and 10: ");

        int rating = input.nextInt();
        if (rating <= 10) System.out.println(rating);

        if (rating > 10) System.out.println("Integer entered is greater than 10!");
    }
}