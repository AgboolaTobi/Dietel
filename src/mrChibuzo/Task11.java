package mrChibuzo;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        int count;

        Scanner scanner = new Scanner(System.in);
        int [] myScores = new int[10];
        for(count = 0; count < 10; count++) {
            System.out.print("Enter the scores: ");
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
        System.out.println("Largest score = "+ largest);
    }
}