package mrChibuzo;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count;
        for (count = 1 ; count <= 10 ; count ++){
            System.out.print("Enter student's score:");
            int score = scanner.nextInt();
            if (score % 2 == 0){
                sum = sum + score;
            }
        }
        System.out.println("The sum of the even number = " + sum);
    }
}
