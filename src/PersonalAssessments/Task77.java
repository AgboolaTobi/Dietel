package PersonalAssessments;

import java.util.Scanner;

public class Task77 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;
        int score;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        score = input.nextInt();

        while ((score > 1) && (score < 100)) {

            System.out.print("Enter score: ");
            score = input.nextInt();
            count -= count;
            sum = sum + score;
        }
        System.out.println(sum);
    }
}
