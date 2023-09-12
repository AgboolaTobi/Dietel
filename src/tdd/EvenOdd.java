package tdd;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger :");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("Number is an even number");
        } else if (number%2!=0) {
            System.out.println("Number is an Odd number");

        }


    }

}
