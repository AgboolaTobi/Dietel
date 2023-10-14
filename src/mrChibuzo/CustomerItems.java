package mrChibuzo;

import java.util.Scanner;

public class CustomerItems {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int[][] itemPrice = new int[4][3];
        for (int row = 0; row < itemPrice.length; row++) {
            for (int column = 0; column < itemPrice[row].length; column++) {
                System.out.printf("Enter price of items for customer%d: ", (row +1));
                 itemPrice[row][column]  = scanner.nextInt();
            }
            System.out.println();
        }
        for (int indexOfRow = 0; indexOfRow < itemPrice.length; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn <itemPrice[indexOfRow].length ; indexOfColumn++) {
                System.out.print(itemPrice[indexOfRow][indexOfColumn] + "     ");
            }
            System.out.println();
        }
    }
}
