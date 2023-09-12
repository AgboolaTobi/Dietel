/*
-Collect studentScore

-Check studentScore

-if student score is between 90 and 100 print A;

-if student score is between 80 and 89, print B;

-if student score is between 70 and 79, print C;

-if student score is between 60 and 69, print D;
i
-if student score is 60 or less, print F
 */

package classExercises;


import java.util.Scanner;

// class declaration
public class PseudoStudentGrade {
    // main method declaration
    public static void main(String[] args) {
        // constructor
        Scanner toby = new Scanner(System.in);
        // collect student score from user
        System.out.print("Enter student score:");
        // object
        int studentScore = toby.nextInt();
        // set conditions
        if((studentScore>=90)&(studentScore<=100)) System.out.println("A");
        if((studentScore>=80)&(studentScore<=89)) System.out.println("B");
        if((studentScore>=70) & (studentScore<=79)) System.out.println("C");
        if((studentScore>=60) & (studentScore<=69)) System.out.println("D");
        if(studentScore <60) System.out.println("F");

    }
}
