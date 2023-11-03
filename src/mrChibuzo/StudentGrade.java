package mrChibuzo;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int numberOfStudent = input.nextInt();
        System.out.println("Enter the number of subject: ");
        int subject = input.nextInt();
        int [][] grade = new int[numberOfStudent][subject];
        int[] totalTotal = new int[numberOfStudent];
        int totalOfScores = 0;
        int average = 0;

        for (int student = 0; student < grade.length; student++){
            for (int scoreOfSubject = 0; scoreOfSubject <grade[student].length; scoreOfSubject++){
                System.out.println("Enter the score for student "+ (student + 1) + " for subject " + (scoreOfSubject + 1));
                int score = input.nextInt();
                while (score < 1 || score > 100){
                    System.out.println("Enter the score for student "+ (student + 1) + " for subject " + (scoreOfSubject + 1));
                    score = input.nextInt();
                }
                grade[student][scoreOfSubject] = score;
            }
            System.out.println(Arrays.deepToString(grade));
        }
//        System.out.println("""
//                =======================================================================
//                STUDENT       SUB       SUB      SUB3         SUB4      TOT     AVE
//                =======================================================================
//                """);
//        for (int student = 0; student < grade.length; student++){
//            System.out.print("Student "+ (student + 1) + "\t\t");
//            for (int scoreSubject = 0; scoreSubject < grade[student].length; scoreSubject++){
//                totalOfScores += grade[student][scoreSubject];
//                System.out.print(grade[student][scoreSubject] + "\t\t");
//            }
//            totalTotal[student] = totalOfScores;
//            average = totalOfScores / grade[student].length;
//            System.out.print(totalOfScores + "\t\t" +average);
//            totalOfScores = 0;
//            average = 0;
//            System.out.println();
//        }
//        System.out.println("""
//                   =======================================================================
//
//                   =======================================================================\s
//                    """);
    }
}
