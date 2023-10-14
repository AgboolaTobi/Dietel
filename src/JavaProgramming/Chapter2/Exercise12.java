package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.println("Enter the acceleration: ");
        double acceleration = scanner.nextDouble();
        double runwayLength = (speed * speed)/(2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.3f",runwayLength);
    }
}

