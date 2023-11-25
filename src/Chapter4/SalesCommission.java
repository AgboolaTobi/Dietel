package Chapter4;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pay;
        double basePay = 200;
        double itemPrice;

        System.out.println("Do you wish to enter items price ? Enter 1 to continue OR -1 to end: ");

        int counter = scanner.nextInt();
        double total = 0;

        while (counter != -1){
            System.out.println("Enter the price of items sold: ");
            itemPrice = scanner.nextDouble();
            System.out.println("DO you wish to enter more items? Enter 1 to continue OR -1 to end: ");
            counter = scanner.nextInt();
            total+= itemPrice;
        }
        double bonusPay = ((double) 9 /100) * total;
        pay = basePay + bonusPay;
        System.out.printf("Your commission for the just concluded week is $ %.2f ",pay);
    }


}
