package Assignment1;

import java.util.Scanner;

public class positiveNegativeZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negatve = 0;
        int zeros = 0;
        for (int count = 0; count <= 10; count++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            if (number < 0) {
                {
                    negatve++;
                    System.out.println("The total number of negative integers entered = " + negatve);

                }
            } else if (number == 0) {
                zeros += 1;
                System.out.println("The total number of zero integers entered = " + zeros);

            } else {

                positive += 1;
                System.out.println("The total number of positive integers entered = " + positive);
            }

        }
    }
}