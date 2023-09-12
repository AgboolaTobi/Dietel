package classExercises;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner toby = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(count < 10){
            System.out.println("Enter score :");
            int userInput = toby.nextInt();
            sum = sum + userInput;
            count = count +2;

        }
        System.out.println(sum);
    }
}
