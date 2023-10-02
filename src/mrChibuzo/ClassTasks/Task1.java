package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count;
        for (count = 1 ; count <= 10 ; count ++){

            System.out.print("Enter student's score:");

            int score = scanner.nextInt();

            sum += score;
        }
        System.out.println("The sum of the scores = " + sum);
    }
}
