package JavaProgramming.Chapter2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius = scanner.nextInt();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit +" fahrenheit");
    }
}
