package PersonalAssessments;

import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int number = scanner.nextInt();
        double[] myNumbers = new double[number];
        double sum = 0;
        System.out.println("Enter the numbers: ");
        for (int count = 0; count < number; count++){
            myNumbers[count] = scanner.nextInt();
        }
       double average = sum / number;

        int count = 0;
        for (int i = 0; i < number ; i++)
            if (myNumbers[i] > average)
                count++;

        System.out.println(average);
        System.out.println(count);

    }
}
