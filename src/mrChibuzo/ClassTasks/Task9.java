package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int sum = 0;
        int count;
        int average = 0;
        Scanner scanner = new Scanner(System.in);

        for (count = 1 ; count <= 10 ; count ++){

            System.out.print("Enter score:");
            int score = scanner.nextInt();

            if (score >= 1 && score <= 100){
                sum = sum + score;
                average = sum / score;
            }
        }
        System.out.println("The average = " + average);
    }
}
