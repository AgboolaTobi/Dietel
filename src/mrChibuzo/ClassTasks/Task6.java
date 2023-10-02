package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int count;
        for (count = 1 ; count <= 10 ; count ++){
            System.out.print("Enter score:");
            int score = scanner.nextInt();
            if (score % 2 == 0){
                sum += score;
                average = sum / count;
            }
        }
        System.out.println("The average of the even number = " + average);
    }
}
