package classExercises;

import java.util.Scanner;

public class Jonathan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power to which your want your base number raised: ");
        int number1 = scanner.nextInt();
    int power = 1;
    while (number1 > 0 ){
        power = power * number;
        number1 = number1 - 1;
    }
        System.out.println(power);
    }
}