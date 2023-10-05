package DietelExercise.Chapter2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");

        int weight;

        weight = scanner.nextInt();

        System.out.print("Enter height in meters: ");
        int height;
         height = scanner.nextInt();

        int bodyMassIndex = (weight / (height * height));

        System.out.printf("The BMI is : "  + bodyMassIndex + "\n");

        System.out.println("BMI VALUES");
        System.out.println("UnderWeight : If BMI is less than 18.5");
        System.out.println("Normal : If BMI is between 18.5 and 24.5");
        System.out.println("Overweight :If BMI is between 25 and 29.9");
        System.out.println("Obese: If BMI is 30 and above");
    }
}
