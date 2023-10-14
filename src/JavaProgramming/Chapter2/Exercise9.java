package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial speed v1: ");

        double intialSpeedv1 = scanner.nextDouble();
        System.out.println("Enter final speed v1: ");

        double finalSpeedv2 = scanner.nextDouble();
        System.out.println("enter time taken: ");

        double time = scanner.nextDouble();
        double acceleration = (finalSpeedv2 - intialSpeedv1)/ time;
        System.out.printf("The average acceleration is %.4f" , acceleration);
    }
}
