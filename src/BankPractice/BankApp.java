package BankPractice;

import java.util.Scanner;

public class BankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        bankMain();
    }

    private static void bankMain() {
        System.out.println("""
                
                ==================
                WELCOME TO  UNIFIED BANK OF NATIONS(UBN)
                1 -> Create account
                2 -> Deposit
                3 -> Transfer
                4 -> Withdrawal
                5 -> checkBalance
                6 -> close Account
                7 -> Exit
                ====================
                """);
        String response = scanner.nextLine();
        operationService(response);
    }

    private static void operationService(String response) {
        switch (response){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3"-> transfer();
            case "4" -> withdraw();
            case "5" -> balance();
            case "6" -> closeAccount();
            case "7" -> exit();
            default -> bankMain();
        }
    }

    private static void closeAccount() {
        String accountNumber = input("Enter the account number you wish to close");
        bank.closeAccount(accountNumber);
        bankMain();
    }

    private static void transfer() {
        String accountNumber1 = input("Enter your account number: ");
        String accountNumber2 = input("Enter the account number you wish to transfer to: ");
        int amount = Integer.parseInt(input("Enter the amount you wish to transfer: "));
        String pin = input("Enter your pin: ");
        try {
            bank.transfer(accountNumber1,accountNumber2,amount,pin);
            System.out.println("Transfer successful");
            bankMain();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMain();
        }

    }

    private static void exit() {
        System.exit(5);
    }

    private static void balance() {
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin");
        try {
           Account account = bank.findAccount(accountNumber);
           int amount = account.checkBalance(pin);
            System.out.println(amount);
            bankMain();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMain();
        }
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account number");
        int amount = Integer.parseInt(input("Enter your amount"));
        String pin = input("Enter your pin");
        try {
            bank.withdraw(accountNumber, amount, pin);
            System.out.printf("Successfully withdrew N%d",amount);
            bankMain();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMain();
        }
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number");
        int amount = Integer.parseInt(input("Enter your amount"));
        try {
            bank.deposit(accountNumber, amount);
            System.out.printf("Your deposit of N%d was successful",amount);
            bankMain();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMain();
        }
    }

    private static void createAccount() {
        String firstName = input("Enter your name");
        String lastName = input("Enter your name");
        String password = input("Enter your pin");
        try{
           Account createdAccount = bank.createAccountFor(firstName, lastName, password);
            System.out.println(createdAccount);
            bankMain();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMain();
        }
    }

    private static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}