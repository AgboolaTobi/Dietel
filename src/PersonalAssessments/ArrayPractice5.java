package PersonalAssessments;

import java.util.Scanner;

public class ArrayPractice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores ;
        int count = 0;
        int scoresAboveAverage = 0;
        int scoresBelowAverage = 0;
        int sum = 0;
        double average;
        while (true) {
            System.out.print("Enter scores: ");
            scores = Integer.parseInt(input.next());
            if (scores > 100){
                System.out.println("Enter scores: ");
                scores = input.nextInt();
            }
            if (scores == -1)
                break;

            sum += scores;
            count++;
        }
        average = (double) sum / count;
        if (scores > average){
            scoresAboveAverage++;
        }
        if (scores < average) scoresBelowAverage++;

        System.out.println("Scores above average: " + scoresAboveAverage);
        System.out.println("Scores below average: " + scoresBelowAverage);
        System.out.println("The number of scores entered is : " + count);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

    }
}
