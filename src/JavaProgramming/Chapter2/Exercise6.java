package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int firstNumber = number % 10;
        System.out.println("The firstNumber is " + firstNumber);
        int secondNumber = (number % 100) / 10;
        System.out.println("The secondNumber is " + secondNumber);
        int thirdNumber = number / 100;
        System.out.println("The thirdNumber is " + thirdNumber);
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the digits is " + sum);
    }
}
