package classExercises;

import java.util.Scanner;

public class Interest{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the balance : ");
                double balance = input.nextDouble();

        System.out.println("Enter the annualRate :");
                double annualRate = input.nextDouble();

                double interest = balance*(annualRate/1200);
        System.out.printf("The interest is :" + " " + "%.3f",interest);


    }

}
