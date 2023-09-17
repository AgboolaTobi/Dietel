package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number:");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println("The sum of " + number1 + "," + number2 + "," + number3 + " = " + sum);

        int average = sum / 3;
        System.out.println("The average of " + number1 + "," + number2 + "," + number3 + " = " + average);

        int product = number1 * number2 * number3;
        System.out.println("The product of " + number1 + "," + number2 + "," + number3 + " = " + product);

        if ((number1>number2) &&(number1 >number3)){
            System.out.println(number1 + " is the largest!");
        }
        if ((number2>number1) &&(number2 >number3)){
            System.out.println( number2+ " is the largest!");
        }
        if ((number3>number1) &&(number3 >number2)){
            System.out.println(number3 + " is the largest!");
        }
        if ((number1 < number2) && (number1 < number3)){
            System.out.println(number1 + " is the smalllest!");
        }
        if ((number2 < number1) && (number2 < number3)){
            System.out.println(number2 + " is the smalllest!");
        }
        if ((number3 < number1) && (number3 < number2)){
            System.out.println(number3 + " is the smalllest!");
        }


    }
}
