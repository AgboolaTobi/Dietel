package PersonalAssessments;

import java.util.Scanner;

public class FiveStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter scores of each student in Math: ");
        int mathScore = scanner.nextInt();
        int sum = 0;
        int count = 1;
        while (count < 5){
            sum += mathScore;
            System.out.println("Enter scores of each student in math: ");
            mathScore = scanner.nextInt();
            count++;
        }
        System.out.println("Enter scores of each student in English: ");
        int englishScore = scanner.nextInt();
        int sumOfEnlishScore = 0;
        int counterForEnglish = 0;
        while (counterForEnglish < 5){
            sumOfEnlishScore += englishScore;
            counterForEnglish++;
        }
        System.out.printf("""
                                    Total MathScore      Total EnglishScore
                      Student%d          %d                   %d
                      
                """,count,sum,sumOfEnlishScore);
        System.out.println();
    }
}
