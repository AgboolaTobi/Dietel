package Assignment1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter a number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the numbers = " + sum);

            System.out.println("Do you wish to perform this operation again(press 1 to continue): ");
            number = scanner.nextInt();

        } while (number == 1);

    }
}
