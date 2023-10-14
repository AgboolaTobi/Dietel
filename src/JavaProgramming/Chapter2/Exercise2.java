package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        double area = radius * radius * ((double) 22 /7);
        double volume = area * length;
        System.out.printf("The area is %.4f \n" , area);
        System.out.printf("The volume is %.1f",volume);
    }
}
