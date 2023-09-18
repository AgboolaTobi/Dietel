package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, numberThree, numberFour, numberFive, smallest, largest;

        System.out.print("Enter integer1: ");
        numberOne = input.nextInt();

        System.out.print("Enter integer2: ");
        numberTwo = input.nextInt();

        System.out.print("Enter integer3: ");
        numberThree = input.nextInt();

        System.out.print("Enter integer4: ");
        numberFour = input.nextInt();

        System.out.print("Enter integer5: ");
        numberFive = input.nextInt();




        smallest = numberOne;
        if (numberTwo < smallest){
            smallest = numberTwo;
        }
        if (numberThree < smallest){
            smallest = numberThree;
        }
        if (numberFour < smallest){
            smallest = numberFour;
        }

        if (numberFive < smallest){
            smallest = numberFive;
        }

        largest = numberOne;
        if (numberTwo > largest){
            largest = numberTwo;
        }
        if (numberThree > largest){
            largest = numberThree;
        }

        if (numberFour > largest){
            largest = numberFour;
        }

        if (numberFive > largest){
            largest = numberFive;
        }

        System.out.println("smallest number = " + smallest);
        System.out.println("largest number = " + largest);

    }
}
