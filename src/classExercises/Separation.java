package classExercises;

import java.util.Scanner;

public class Separation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int number = input.nextInt();
        if (number > 9999)
            System.out.println("Number is more than 5 digits");
        int number1 = 0;
        if (number < 10000)
            System.out.println("Number is less than 5 digits");
        number1 = ((number / 10000) % 10);
        int number2 = ((number / 1000) % 10);
        int number3 = ((number / 100) % 10);
        int number4 = ((number / 10) % 10);
        int number5 = ((number) % 10);
        System.out.printf("%d      %d      %d      %d      %d", number1, number2, number3, number4, number5);


    }

}
