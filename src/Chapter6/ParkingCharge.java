package Chapter6;

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours parked(Enter 1 to make an entry, -1 to end): ");
        int hour = scanner.nextInt();
        double total = 0;
        double charges = 0;
        while (hour != -1) {
            charges = calculateCharges(hour);
            System.out.println("Enter the number of hours parked(Enter 1 to make an entry, -1 to end): ");
            hour = scanner.nextInt();

            total += charges;
        }
        System.out.println("The parking charge of the current customer: $" + charges);
        System.out.println("The running total of yesterday's receipts = $" + total);

    }
    public static double calculateCharges(int hour){

        double baseCharge = 2;
        double charge = 0;
        if (hour > 0 && hour <= 3){
            charge = baseCharge;

        }
        else if (hour > 3 && hour < 24){
            charge = 2 + (hour - 3) * 0.5;

        }
        else if (hour == 24){
            charge = 10;

        }
        return charge;
    }
}
