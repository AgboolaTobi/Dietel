package mrChibuzo;

import java.util.Scanner;

public class DominoPizza {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largeSize = 10;
        int mediumSize = 6;
        int smallSize = 4;
        int priceOfLarge = 5000;
        int priceOfMedium = 3000;
        int priceOfSmall = 1200;

        int superHungry = 4;
        int hungry = 2;
        int classic = 1;

        System.out.println("""
                ===Available on the Order List===
                1. Large size
                2. Medium size
                3. Small size
                4. Return to menu""");

        int orderList = input.nextInt();

        switch (orderList) {
            case 1:
                int superHungryGuests;
                System.out.println("Enter the number of super hungry guests: ");
                superHungryGuests = input.nextInt();

                System.out.println("Enter the number of hungry guests: ");
                int hungryGuests = input.nextInt();

                System.out.println("Enter number of classic guest: ");
                int classicGuests = input.nextInt();

                int totalNumberOfSlicesOrdered = (superHungry * superHungryGuests) + (hungry * hungryGuests) + (classic * classicGuests);
                if (totalNumberOfSlicesOrdered % largeSize == 0) {

                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / largeSize;
                    int totalCostOfOrder = totalNumberOfBoxes * priceOfLarge;
                    int numberOfLeftOver = 0;

                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver + "pieces");
                } else {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / largeSize + 1;
                    int totalCostOfOrder = (totalNumberOfSlicesOrdered / largeSize) * priceOfLarge + priceOfLarge;
                    int numberOfLeftOver = (totalNumberOfBoxes * largeSize) - totalNumberOfSlicesOrdered;
                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver+ "pieces");
                    break;
                }
            case 2:
                System.out.println("Enter the number of super hungry guests: ");
                superHungryGuests = input.nextInt();
                System.out.println("Enter the number of hungry guests: ");
                hungryGuests = input.nextInt();
                System.out.println("Enter number of classic guest: ");
                classicGuests = input.nextInt();
                totalNumberOfSlicesOrdered = (superHungry * superHungryGuests) + (hungry * hungryGuests) + (classic * classicGuests);
                if (totalNumberOfSlicesOrdered % mediumSize == 0) {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / mediumSize;
                    int totalCostOfOrder = totalNumberOfBoxes * priceOfMedium;
                    int numberOfLeftOver = 0;
                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver+ "pieces");
                } else {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / mediumSize + 1;
                    int totalCostOfOrder = (totalNumberOfSlicesOrdered / mediumSize) * priceOfMedium + priceOfMedium;
                    int numberOfLeftOver = (totalNumberOfBoxes * mediumSize) - totalNumberOfSlicesOrdered;
                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver+ "pieces");
                    break;
                }
            case 3:
                System.out.println("Enter the number of super hungry guests: ");
                superHungryGuests = input.nextInt();
                System.out.println("Enter the number of hungry guests: ");
                hungryGuests = input.nextInt();
                System.out.println("Enter number of classic guest: ");
                classicGuests = input.nextInt();
                totalNumberOfSlicesOrdered = (superHungry * superHungryGuests) + (hungry * hungryGuests) + (classic * classicGuests);
                if (totalNumberOfSlicesOrdered % smallSize == 0) {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / smallSize;
                    int totalCostOfOrder = totalNumberOfBoxes * priceOfSmall;
                    int numberOfLeftOver = 0;
                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver+ "pieces");
                } else {
                    int totalNumberOfBoxes = totalNumberOfSlicesOrdered / smallSize + 1;
                    int totalCostOfOrder = (totalNumberOfSlicesOrdered / smallSize) * priceOfSmall + priceOfSmall;
                    int numberOfLeftOver = (totalNumberOfBoxes * smallSize) - totalNumberOfSlicesOrdered;
                    System.out.println("Total number of slices ordered: " + totalNumberOfSlicesOrdered + "\n" + "The total number of boxes bought: " + totalNumberOfBoxes + "\n" + "The total cost of order: " + totalCostOfOrder + "\n" + "Total number of left over: " + numberOfLeftOver+ "pieces");
                    break;
                }
            default:
                System.out.println("""
                        ===Available on the Order List===
                        1. Large size
                        2. Medium size
                        3. Small size
                        4. Return to menu""");

        }

    }

}