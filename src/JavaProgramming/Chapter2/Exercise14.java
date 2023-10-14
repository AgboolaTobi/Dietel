package JavaProgramming.Chapter2;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilogramPerPound = 0.45359237;
        double meterPerInch = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        weight = weight * kilogramPerPound;
        height = height * meterPerInch;
        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.printf("BMI is  %.4f" , bodyMassIndex);
    }
}
