package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first variable x:");
        int x = input.nextInt();

        System.out.print("Enter your second variable y:");
        int y = input.nextInt();

        System.out.print("Enter your variable z:");
        int z = input.nextInt();

        int result = x * y * z;
        System.out.printf("product is :%d ",result);
    }
}
