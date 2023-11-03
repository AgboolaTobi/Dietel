package PersonalAssessments;

import java.util.Scanner;

public class PersonalStudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items");
        int items = input.nextInt();
        System.out.println("Enter price of item: ");
        int price = input.nextInt();
        int[][] recordofItems = new int[items][price];
        for (int list = 0; list < recordofItems.length; list++){
            for (int amount = 0; amount < recordofItems[list].length; amount++){
                System.out.println("Enter the name of item bought: " + (items+ 1) + "for price " + price);
            }
        }

    }
}
