package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();
        double energyNeeded = weight * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("The energy needed is %.1f",energyNeeded);
    }
}