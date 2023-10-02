package mrChibuzo.ClassTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        int [] myScores = new int[10];
        for(count = 0; count < 10; count++) {
            System.out.print("Enter the score: ");
            myScores[count] = scanner.nextInt();
        }
        int largest = myScores[0];
        for(count = 0; count < 10; count++)
        {
            if(largest < myScores[count])
            {
                largest = myScores[count];
            }
        }
        System.out.println("Largest score = " + largest);

        int smallest = myScores[9];
        for(count = 0; count < 10; count++)
        {
            if(smallest > myScores[count])
            {
                smallest = myScores[count];
            }
        }
        System.out.println("Smallest score = " + smallest);
    }
}