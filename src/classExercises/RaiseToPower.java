package classExercises;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner toby = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = toby.nextInt();
        System.out.println("Enter number2:");
        int number2 = toby.nextInt();
        int power = 1;
        while (number2 > 0) {
            power = power*number1;
            number2 = number2 - 1;

        }
        System.out.println("number1 raised number2 =" + power);
    }
}