package classExercises;

import java.util.Scanner;

public class Jonathan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double a = scanner.nextDouble();

        double x = a + 10;
        double y = a - 10;
        double z = a % 10;

        double result = a/(x*y*z);

        System.out.println(result);
    }
}
