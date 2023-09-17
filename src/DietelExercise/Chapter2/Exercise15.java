package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int numberOne = input.nextInt();

        System.out.print("Enter your second number: ");
        int numberTwo = input.nextInt();

        int numberOneSquare = numberOne * numberOne;

        int numberTwoSquare = numberTwo * numberTwo;

        int sum = numberOneSquare + numberTwoSquare;

        int difference = numberOneSquare - numberTwoSquare;

        System.out.println(numberOneSquare);

        System.out.println(numberTwoSquare);

        System.out.println(sum);

        System.out.println(difference);
    }
}
