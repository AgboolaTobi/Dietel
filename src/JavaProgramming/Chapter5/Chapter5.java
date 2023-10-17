package JavaProgramming.Chapter5;

import java.util.Scanner;

public class Chapter5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an integer, the input ends if it is 0: ");
        int input = scanner.nextInt();
        int sumOfPositives = 0;
        int sumOfNegatives = 0;
        double average = 0;
        int count = 1;
        int total = 0;
        while (input != 0){
            System.out.println(" Enter an integer, the input ends if it is 0: ");
            input = scanner.nextInt();
            if (input >0){
              sumOfPositives += input;
              average = (double) sumOfPositives /count;
            }
            else sumOfNegatives += input;
            count++;
            total += input;
        }
        System.out.print("The number of positives is " + sumOfPositives + "\n" + "The number of negatives is " + sumOfNegatives + "\n" + "The total is " + total +"\n" + "The average is " +average);
    }
}
