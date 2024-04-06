package Assignment1;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pound: ");
        double weightInPounds = scanner.nextDouble();
        System.out.println("Enter height in pound: ");
        double heightInPounds = scanner.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInmeters = heightInPounds * 0.0254;
        double BMI = (weightInKilograms/(heightInmeters * heightInmeters));

        System.out.printf("BMI is %.4f", BMI);

    }
}
