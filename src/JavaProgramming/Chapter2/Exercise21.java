package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter monthly interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate = monthlyInterestRate / 1200;
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),numberOfYears * 12);
        System.out.printf("Accumulated value is $ %.2f",futureInvestmentValue);
    }
}
