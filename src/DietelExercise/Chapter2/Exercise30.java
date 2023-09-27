package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five digit number:");
        int number = scanner.nextInt();
        int remainingNumber;


        int number1 = number/10000;
        remainingNumber = number%10000;
        int number2 = remainingNumber/1000;
        remainingNumber = number%1000;
        int number3 = remainingNumber/100;
        remainingNumber = number%100;
        int number4 = remainingNumber/10;
        remainingNumber = remainingNumber%10;
        int number5 = number%10;

        System.out.printf("%d   %d   %d   %d   %d", number1,number2,number3,number4,number5);

    }
}
