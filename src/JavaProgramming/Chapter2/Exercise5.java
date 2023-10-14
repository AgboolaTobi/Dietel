package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();
        System.out.println("enter the gratuity rate: ");
        double gratuityRate = scanner.nextDouble();
        double gratuity = (gratuityRate/100) * subtotal;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is $" + gratuity + " and the subtotal is $" + total);
    }
}
