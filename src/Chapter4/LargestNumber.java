package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int largest = 0;
        int store;
        int keep = 0;
        while(count <= 10){
            System.out.println("Enter number " + count + ":");
            int number = input.nextInt();
            store = number;
            if (store > keep){largest = store;}
            keep = number;
            System.out.println("The integer most recently inputted is: " + number);
            System.out.println("The largest integer inputted so far: " + largest);
            count++;
        }
    }

}