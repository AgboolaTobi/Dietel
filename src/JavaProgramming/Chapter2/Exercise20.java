package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance : ");
        double balance = scanner.nextDouble();
        System.out.println("Enter interest rate (e.g., 3 for 3%): ");
        double annualInterestRate = scanner.nextDouble();
        double interest = balance * (annualInterestRate /1200);
        System.out.printf("The interest is %.5f",interest);

    }
}
