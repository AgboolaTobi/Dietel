package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter balance at the beginning of the month: ");
        int initialBalance = scanner.nextInt();
        System.out.println("Enter total number of items charged for the month: ");
        int itemsCharged = scanner.nextInt();
        System.out.println("Enter total of all credits applied to the customer's account for the month: ");
        int creditApplied = scanner.nextInt();
        System.out.println("Enter allowed credit: ");
        int allowedCredit = scanner.nextInt();

        int newBalance;
        newBalance = initialBalance  + itemsCharged - creditApplied;
        if (newBalance <= allowedCredit){
            System.out.println("Credit limit exceeded");
        }

        System.out.println("==Customer's Details===");
        System.out.println("Customer's account number= " + accountNumber + "\n" +"total number of items charged for the month: " + itemsCharged + "\n" + "total of all credits applied to the customer's account for the month: " + creditApplied + "\n" + "Allowed credit: " + "New balance: " + newBalance);

    }
}
