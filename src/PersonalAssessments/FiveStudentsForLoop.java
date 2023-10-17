package PersonalAssessments;

import java.util.Scanner;

public class FiveStudentsForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scores of each student in english: ");
        int scoresInEnglish =scanner.nextInt();
        int count;
        int sumOfScoreInEnglish = 0;
        int sumOfScoreInMath = 0;
        double averageScoreInEnglish = 0;
        for (count = 1; count < 5; count++) {
            System.out.print("Enter scores of each student in english: ");
            scoresInEnglish = scanner.nextInt();
            sumOfScoreInEnglish += scoresInEnglish;
            averageScoreInEnglish = (double) sumOfScoreInEnglish / 5;
        }
        System.out.print("Enter scores of each student in mathematics: ");
        int scoresInMaths = scanner.nextInt();
        double averageScoreInMath = 0;

        for (count = 1; count < 5; count++) {
            System.out.print("Enter scores of each student in mathematics: ");
            scoresInMaths = scanner.nextInt();
            sumOfScoreInMath += scoresInMaths;
            averageScoreInMath = (double) sumOfScoreInMath /count;
        }
        double totalAverage = sumOfScoreInMath + sumOfScoreInEnglish;
        System.out.printf("""
                                    Sum of scores(Maths)           sum of scores(English)        Total scores in both subjects
           Number of student(%d)              %d                                   %d                          %d
           AverageScore                      %.2f                                 %.2f                        %.2f   \s
                """,count,scoresInMaths,scoresInEnglish,scoresInMaths+scoresInEnglish,averageScoreInMath,averageScoreInEnglish,totalAverage);
        System.out.println();
    }
}
