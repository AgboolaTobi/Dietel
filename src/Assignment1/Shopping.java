package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the customer's name: ");
        String nameOfCustomer = input.nextLine();
        ArrayList <String> items = new ArrayList<>();
        ArrayList <Integer> quantity = new ArrayList<>();
        ArrayList <Integer> unitPrice = new ArrayList<>();
        String numberOfTimes = "YES";
        int count = 0;
        while (numberOfTimes.equals("YES")){
            System.out.println("What did the user buy ?");
            String userItem = input.next();
            items.add(userItem);
            System.out.println("How many pieces bought: ");
            int numberOfItems = input.nextInt();
            quantity.add(numberOfItems);
            System.out.println("Cost per unit item: ");
            int price = input.nextInt();
            unitPrice.add(price);
            count++;
            System.out.println("Add more items: ");
            numberOfTimes = input.next();
            numberOfTimes = numberOfTimes.toUpperCase();
        }
        System.out.println("What is your name ?");
        String cashierName = input.next();
        String cashier = input.next();
        System.out.println("How much is the discount ");
        int discount = input.nextInt();
        System.out.println("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TELEPHONE: 03293828343
                DATE: 18-Dec-22 8:57:31 pm
                CASHIER: Cashier's Name
                Customer's Name: Chukwuma Adekunle Ciroma
                ========================================
                         ITEM       QTY      PRICE     TOTAL
                ----------------------------------------
                """);
        double subTotal = 0;
        for (int i = 0; i < count; i++) {
            int total = quantity.get(i) * unitPrice.get(i);
            subTotal += total;
            System.out.printf("""
                       %s          %d          %d         %d
                    """, items.get(i),quantity.get(i), unitPrice.get(i),total);
        }
        double discountRate = (subTotal * discount) / 100;
        double vat = (subTotal * 17.50) / 100;
        double billTotal = subTotal + vat - discountRate;
        System.out.println("-----------------------------------");
        System.out.printf("""
                                    Sub Total: %.2f 
                                    Discount: %.2f
                                    VAT: %.2f
                ===============================================
                                BILL TOTAL:  %.2f
                ===============================================
                THIS IS NOT A RECEIPT KINDLY PAY %.2f
                """, subTotal,discountRate,vat,billTotal,billTotal);
        System.out.println();
        System.out.println("How much did the customer give you ?:");
        double amountPaid = input.nextInt();
        System.out.println("""
      
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TELEPHONE: 03293828343
                DATE: 18-Dec-22 8:57:31 pm
                CASHIER: Cashier's Name
                Customer's Name: Chukwuma Adekunle Ciroma
                =================================================
                        ITEM        QTY       PRICE         TOTAL
                ------------------------------------------------ 
                """);

        double balance ;
        balance = amountPaid -billTotal;
        for (int i = 0; i < count; i++) {
            int total = quantity.get(i) * unitPrice.get(i);
            System.out.printf("""
                       %s           %d           %d          %d
                    """, items.get(i),quantity.get(i), unitPrice.get(i),total);
        }
        System.out.println("-----------------------------------");
        System.out.printf("""
                                    Sub Total: %.2f 
                                    Discount: %.2f
                                    VAT: %.2f
                ===============================================
                                Bill Total:  %.2f
                                Amount Paid: %.2f
                                    Balance: %.2f
                ===============================================
                THANKS FOR YOUR PATRONAGE...
                """, subTotal,discountRate,vat,billTotal,amountPaid,balance);
    }
}