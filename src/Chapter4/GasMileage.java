package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven: ");
        int milesDriven = input.nextInt();
        System.out.println("Enter the gallon used: ");
        int gallonUsed = input.nextInt();

        double milesPerGallon = (double) milesDriven / gallonUsed;
        double totalMilePerGallon = milesPerGallon;
        System.out.println("Do you wish to continue ? If yes,enter 1,if no enter -1");
        int counter = input.nextInt();
        while (counter!= -1){
            System.out.println("Enter the miles driven: ");
            milesDriven = input.nextInt();
            System.out.println("Enter the gallon used: ");
            gallonUsed = input.nextInt();
            milesPerGallon = (double) milesDriven / gallonUsed;
            totalMilePerGallon += milesPerGallon;
            System.out.println("Do you wish to continue ? If yes,enter 1,if no enter -1");
            counter = input.nextInt();
        }
        System.out.printf("The total gallon per gallon used = %.2f miles/gallons" ,totalMilePerGallon);

    }
}
