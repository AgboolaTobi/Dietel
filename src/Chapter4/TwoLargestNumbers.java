package Chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int firstLargest = 0;
        int secondLargest = 0;
        int largest = 0;
        int number;
        while (count < 10){
            System.out.println("Enter number: ");
            int userInput = input.nextInt();
            number = userInput;
            if (userInput > firstLargest){
                firstLargest = userInput;
            }

            System.out.println("The firstLargest number entered is "+ largest + "The second largest number is "+firstLargest +"\nThe last number entered is " +number);
            count++;
        }
    }
}
