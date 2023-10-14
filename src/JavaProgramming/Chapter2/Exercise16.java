package JavaProgramming.Chapter2;


import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.printf("The area of the hexagon is %.4f" , area);
    }
}
