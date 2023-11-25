package mrChibuzo.DominoPizzaApp;

import java.util.Scanner;

public class NewPizza {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                ===Available on the Order List===
                1. Large size
                2. Medium size
                3. Small size
                4. Return to menu""");

        int orderList = input.nextInt();

        switch (orderList) {
            case 1:
                int totalNumberOfSlicesOrdered = numberOfSlices();
                if (totalNumberOfSlicesOrdered % 10 == 0) {

                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 10;
                    int totalCostOfOrder = totalNumberOfBoxes * 5000;
                    int numberOfLeftOver = 0;

                    System.out.println("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");
                } else {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 10 + 1;
                    int totalCostOfOrder = (totalNumberOfSlicesOrdered / 10) * 5000 + 5000;
                    int numberOfLeftOver = (totalNumberOfBoxes * 10) - totalNumberOfSlicesOrdered;
                    System.out.println("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");
                }
                break;
            case 2:
                totalNumberOfSlicesOrdered = numberOfSlices();
                if (totalNumberOfSlicesOrdered % 6 == 0) {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 6;
                    int totalCostOfOrder = totalNumberOfBoxes * 3000;
                    int numberOfLeftOver = 0;
                    System.out.println("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");
                } else {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 6 + 1;
                    int totalCostOfOrder = (totalNumberOfSlicesOrdered / 6) * 3000 + 3000;
                    int numberOfLeftOver = (totalNumberOfBoxes * 6) - totalNumberOfSlicesOrdered;
                    System.out.println("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");

                }
                break;
            case 3:
                totalNumberOfSlicesOrdered = numberOfSlices();
                small(totalNumberOfSlicesOrdered);
                break;
            default:
                main();
        }

    }
    public static StringBuilder small(int totalNumberOfSlicesOrdered){
        StringBuilder result;
        if (totalNumberOfSlicesOrdered % 4 == 0) {
            int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 4;
            int totalCostOfOrder = totalNumberOfBoxes * 1200;
            int numberOfLeftOver = 0;
            result = new StringBuilder("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");
        }
        else {
            int totalNumberOfBoxes = totalNumberOfSlicesOrdered / 4 + 1;
            int totalCostOfOrder = (totalNumberOfSlicesOrdered / 4) * 1200 + 1200;
            int numberOfLeftOver = (totalNumberOfBoxes * 4) - totalNumberOfSlicesOrdered;
             result = new StringBuilder("Total number of slices Recommended: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes to be bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of pieces that will be left: " + numberOfLeftOver + " piece(s)");

        }
        return result;
    }
    public static int numberOfSlices() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of super hungry guests: ");
        int superHungryGuests = input.nextInt();
        while (superHungryGuests < 0) {
            System.out.println("Enter the number of super hungry guests: ");
            superHungryGuests = input.nextInt();
        }
        System.out.println("Enter the number of hungry guests: ");
        int hungryGuests = input.nextInt();
        while (hungryGuests < 0) {
            System.out.println("Enter the number of hungry guests: ");
            hungryGuests = input.nextInt();
        }
        System.out.println("Enter number of classic guest: ");
        int classicGuests = input.nextInt();
        while (classicGuests < 0) {
            System.out.println("Enter number of classic guest: ");
            classicGuests = input.nextInt();
        }
        int totalNumberOfSlicesOrdered = (4 * superHungryGuests) + (2 * hungryGuests) + (1 * classicGuests);
        return totalNumberOfSlicesOrdered;
    }
}



