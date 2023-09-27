package mrChibuzo;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count;

        for (count = 1 ; count <= 10; ){

            System.out.print("Enter score:");
            int score = scanner.nextInt();

            if (score >= 1 && score <= 100){
                sum += score;
                count ++;
            }
        }
        System.out.println("The sum = " + sum);
    }
}
