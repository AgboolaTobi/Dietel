package Assignment1;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int largestNumber = number;
        int smallestNumber = number;

        while (number != 0) {


            if (number > largestNumber){largestNumber = number;}
            if (number < smallestNumber){smallestNumber = number;}

            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            }
        System.out.println("The largest number is  " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
        }
    }