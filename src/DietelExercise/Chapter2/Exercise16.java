package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int number = input.nextInt();
        int square = number * number;
        if (number > 100) {
            System.out.println(number + " " + " is greater than 100 !");
        }
        if (number == 100) {
            System.out.println(number + " " + "is equal to 100 !");
        }
        if (number != 100) {
            System.out.println(number + " " + "is not eqaul to 100 !");
        }
        if (number < 100) {
            System.out.println(number + " " + "is less than 100 !");
        }
        if (square > 100) {
            System.out.println("Square of" + " " + number + " " + "is greater than 100");
        }
        if (square == 100) {
            System.out.println("Square of" + " " + number + " " + "is equal to 100");
        }
        if (square != 100) {
            System.out.println("Square of" + " " + number + " " + "is not equal to 100");
        }
        if (square < 100) {
            System.out.println("Square of" + " " + number + " " + "is less than 100");
        }
    }
}