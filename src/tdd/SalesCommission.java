package tdd;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
    }

    public static double pay(double amount) {
        Scanner scanner = new Scanner(System.in);

        double valueOfItemSold;
        int basePay = 200;
        valueOfItemSold = 0;
        double grossSales = 0;
        double totalPay = 0;
        while (valueOfItemSold != -1){
            System.out.print("Enter value item sold (Press -1 to exit): ");
            valueOfItemSold = scanner.nextDouble();
            grossSales+= valueOfItemSold;
            double grossSalesPay = 0.09 * grossSales;
            totalPay = basePay + grossSalesPay;
        }
        return totalPay;
    }
}
