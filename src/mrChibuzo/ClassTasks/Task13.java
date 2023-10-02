package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int total = 0;
        int average= 0;
        int count;
        Scanner scanner = new Scanner(System.in);
        int myScores = 0;
        for (count = 1; count <= 10; count++) {
            System.out.print("Enter the score: ");
            myScores = scanner.nextInt();
            total = total + myScores;
            average = total / count;
        }
        System.out.println("The sum total= " + total);
        System.out.println("The average= " + average);


        int maximum = myScores;
        for(count = 1; count <= 10; count++)
        {
            if(myScores > maximum)
            {
                maximum = myScores+count;
            }
        }
        System.out.println("Maximum score = " + maximum);

    }

}

