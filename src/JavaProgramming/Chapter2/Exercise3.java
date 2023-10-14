package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = scanner.nextDouble();
        double oneFeet = 0.305;
        double feetInMeter = oneFeet * feet;
        System.out.println(feet + " feet is " + feetInMeter + " meters");

    }
}
