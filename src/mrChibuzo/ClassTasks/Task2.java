package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average;
        int count;

        for (count = 1 ; count <= 10 ; count ++){

            System.out.print("Enter student's score:");
            int score = scanner.nextInt();

            sum += score;

        }
        average = sum / count;
        System.out.println("The average of the scores = " + average);
    }
}