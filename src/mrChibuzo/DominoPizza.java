package mrChibuzo;

import java.util.Scanner;

public class DominoPizza {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int large_size = 10;
        int medium_size = 6;
        int small_size = 4;
        int price_of_large = 5000;
        int price_of_medium = 3000;
        int price_of_small = 1200;

        int super_hungry = 4;
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
                int super_hungry_guests;
                System.out.println("Enter the number of super hungry guests: ");
                super_hungry_guests = input.nextInt();
                System.out.println("Enter the number of hungry guests: ");
                int hungry_guests = input.nextInt();
                System.out.println("Enter number of classic guest: ");
                int classic_guests = input.nextInt();
                int total_number_of_slices_ordered = (super_hungry * super_hungry_guests) + (hungry * hungry_guests) + (classic * classic_guests);
                if (total_number_of_slices_ordered % large_size == 0) {
                    int total_number_of_boxes = total_number_of_slices_ordered / large_size;
                    int total_cost_of_order = total_number_of_boxes * price_of_large;
                    int number_of_left_over = 0;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
                } else {
                    int total_number_of_boxes = total_number_of_slices_ordered / large_size + 1;
                    int total_cost_of_order = (total_number_of_slices_ordered / large_size) * price_of_large + price_of_large;
                    int number_of_left_over = (total_number_of_boxes * large_size) - total_number_of_slices_ordered;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
                    break;
                }
            case 2:
                System.out.println("Enter the number of super hungry guests: ");
                super_hungry_guests = input.nextInt();
                System.out.println("Enter the number of hungry guests: ");
                hungry_guests = input.nextInt();
                System.out.println("Enter number of classic guest: ");
                classic_guests = input.nextInt();
                total_number_of_slices_ordered = (super_hungry * super_hungry_guests) + (hungry * hungry_guests) + (classic * classic_guests);
                if (total_number_of_slices_ordered % medium_size == 0) {
                    int total_number_of_boxes = total_number_of_slices_ordered / medium_size;
                    int total_cost_of_order = total_number_of_boxes * price_of_medium;
                    int number_of_left_over = 0;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
                } else {
                    int total_number_of_boxes = total_number_of_slices_ordered / medium_size + 1;
                    int total_cost_of_order = (total_number_of_slices_ordered / medium_size) * price_of_medium + price_of_medium;
                    int number_of_left_over = (total_number_of_boxes * medium_size) - total_number_of_slices_ordered;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
                    break;
                }
            case 3:
                System.out.println("Enter the number of super hungry guests: ");
                super_hungry_guests = input.nextInt();
                System.out.println("Enter the number of hungry guests: ");
                hungry_guests = input.nextInt();
                System.out.println("Enter number of classic guest: ");
                classic_guests = input.nextInt();
                total_number_of_slices_ordered = (super_hungry * super_hungry_guests) + (hungry * hungry_guests) + (classic * classic_guests);
                if (total_number_of_slices_ordered % small_size == 0) {
                    int total_number_of_boxes = total_number_of_slices_ordered / small_size;
                    int total_cost_of_order = total_number_of_boxes * price_of_small;
                    int number_of_left_over = 0;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
                } else {
                    int total_number_of_boxes = total_number_of_slices_ordered / small_size + 1;
                    int total_cost_of_order = (total_number_of_slices_ordered / small_size) * price_of_small + price_of_small;
                    int number_of_left_over = (total_number_of_boxes * small_size) - total_number_of_slices_ordered;
                    System.out.println("Total number of slices ordered: " + total_number_of_slices_ordered + "\n" + "The total number of boxes bought: " + total_number_of_boxes + "\n" + "The total cost of order: " + total_cost_of_order + "\n" + "Total number of left over: " + number_of_left_over);
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

