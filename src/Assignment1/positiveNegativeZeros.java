package Assignment1;

import java.util.Scanner;

public class positiveNegativeZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int positive = 0;
        int negatve = 0;
        int zeros = 0;
        if (negatve < 0){
            {
                negatve = negatve + 1;

            }
        } else if (number == 0) {
            zeros += 1;

        } else if (number > 0) {

            positive += 1;

        }
    }
}

