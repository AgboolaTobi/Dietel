package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int account = scanner.nextInt();
        System.out.println("Enter balance at the beginning of the month: ");
        int balance = scanner.nextInt();
        System.out.println("Enter total of all items charged by the customer this month: ");
        int charges = scanner.nextInt();
        System.out.println("Enter the total of all credits applied to the customer's account this month: ");
        int credits = scanner.nextInt();
        System.out.println("Enter credit allowed: ");
        int creditLimit = scanner.nextInt();
        int newBalance = ( balance + charges - credits);
            if (newBalance < creditLimit){
                System.out.printf("""
                        Dear Customer,
                            You have exceeded credit limit on your account %d \s
                        """,account);
            }
    }
}