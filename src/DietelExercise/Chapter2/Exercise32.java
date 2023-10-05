package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        int zeros = 0;
        int positive = 0;
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        if (number1 < 0) {
            negative = negative + 1;
        } else if (number1 == 0) {
            zeros = zeros + 1;
        } else positive = positive + 1;

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        if (number2 < 0) {
            negative = negative + 1;
        } else if (number2 == 0) {
            zeros = zeros + 1;
        } else positive = positive + 1;

        System.out.println("Enter second number: ");
        int number3 = scanner.nextInt();
        if (number3 < 0) {
            negative = negative + 1;
        } else if (number3 == 0) {
            zeros = zeros + 1;
        } else positive = positive + 1;

        System.out.println("Enter second number: ");
        int number4 = scanner.nextInt();
        if (number4 < 0) {
            negative = negative + 1;
        } else if (number4 == 0) {
            zeros = zeros + 1;
        } else positive = positive + 1;

        int number5 = scanner.nextInt();
        if (number5 < 0) {
            negative = negative + 1;
        } else if (number5 == 0) {
            zeros = zeros + 1;
        } else positive = positive + 1;

        System.out.println("Number of zero integers entered = " + zeros + "\n" + "Number of positive integers entered = " + positive + " \n" + "Number of negative integers entered = " + negative );
    }
}