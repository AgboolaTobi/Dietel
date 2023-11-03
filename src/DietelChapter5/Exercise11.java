package DietelChapter5;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive numbers(kindly enter a negative number to end your input) : ");
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;
        while (number > 0) {
            int minimum = scanner.nextInt();
            int maximum = scanner.nextInt();
            if (number > maximum) {
                number = maximum;
            }
            if (number < minimum) {
                number = minimum;
            }
            sum = minimum + maximum;
            count++;
        }

    }

}
