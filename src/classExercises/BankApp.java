package classExercises;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Enter your account number :");
        Scanner input = new Scanner(System.in);
        System.out.println("""
                1-> Deposit
                2-> Withdrawal
                3-> Checkbalance
                """);
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Deposit");
                int deposit = input.nextInt();
                switch (deposit) {
                    case 1:
                        System.out.println("""
                                Amount
                                1-> 1000-10000
                                2->50000 and above
                                """);
                    case 2:
                        System.out.println("1");
                        break;
                    case 3:
                        System.out.println("2");
                        break;

                }
            case 2:
                System.out.println("Withdrwal");
                int withdrawal = input.nextInt();
                switch (withdrawal) {
                    case 1 -> System.out.println("""
                            1-> 1000-10000
                            2-> others
                            """);
                    case 2 -> System.out.println("1");
                }
                    case 131:
                        System.out.println("Your account balance is :" );
                        break;
                }

        }
    }