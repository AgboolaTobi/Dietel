package Assignment1;

import java.util.Scanner;

public class Chapter4Exercise36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second integer:");
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("0");
        }
        if (number1 > number2){
            System.out.println("1");
        }
        if (number2 > number1){
            System.out.println("-1");
        }
    }
}
