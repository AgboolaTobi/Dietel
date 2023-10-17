package JavaProgramming.Chapter5;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter loan period in years: ");
        double period = scanner.nextInt();
        double monthlyPayment = 0 ;
        double totalPayment = 0;
        double rate;
        for (rate = 5.0; rate <= 8.0; rate= rate +0.125) {

            monthlyPayment =(int) (amount / (period/12));
            totalPayment = amount + monthlyPayment;
        }
        System.out.printf("""
                Loan Amount :%f
                Number of years:%f
                Interest Rate       Monthly Payment         Total Payment
                %f                  %f                       %f
                """,amount,period,rate,monthlyPayment,totalPayment);
    }
}
