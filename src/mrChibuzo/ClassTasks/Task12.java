package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int count;
        int total = 0;
        int average = 0;
        Scanner scanner = new Scanner(System.in);
        int [] myScores = new int[10];
        for(count = 0; count < 10; count++) {
            System.out.print("Enter the score: ");
            myScores[count] = scanner.nextInt();
            total = total + myScores[count];
            average = total / myScores.length;
        }
        System.out.println("The sum total of the scores = " + total);
        System.out.println("The average = " + average);

        int minimum = myScores[9];
        for(count = 0; count < 10; count++)
        {
            if(minimum > myScores[count])
            {
                minimum = myScores[count];
            }
        }
        System.out.println("Minimum score = " + minimum);

        int maximum = myScores[0];
        for(count = 0; count < 10; count++)
        {
            if(maximum < myScores[count])
            {
                maximum = myScores[count];
            }
        }
        System.out.println("Maximum score = " + maximum);
    }

}
