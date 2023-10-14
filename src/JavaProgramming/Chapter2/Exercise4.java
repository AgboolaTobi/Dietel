package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double onePoundsInKilograms = 0.454;
        double poundsInKilograms = pounds * onePoundsInKilograms;
        System.out.println(pounds + " pounds is " + poundsInKilograms + " kilograms");
    }
}
