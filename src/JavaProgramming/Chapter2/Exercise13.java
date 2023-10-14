package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double saving = scanner.nextDouble();
        double rate = 0.00417;
        double total = 100 * (1 + rate);

        total = (100 + total) * (1 + saving);

        total = (100 + total) * (1 + saving);

        total = (100 + total) * (1 + saving);

        total = (100 + total) * (1 + saving);

        total = (100 + total) * (1 + saving);

    }
}
