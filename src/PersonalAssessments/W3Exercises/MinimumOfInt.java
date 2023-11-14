package PersonalAssessments.W3Exercises;

import java.util.Scanner;

public class MinimumOfInt {
    public double smallest(double ...numbers){
        double smallest = numbers[0];
        for (double number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static double total(double ...numbers){
        double total = 0;
        for (int index = 0; index < numbers.length; index++) {
            total += numbers[index];
        }
        return total;
    }
    public static double averageOfNumbers(double ...numbers){
        int count = 0;
        double total = 0;
        double average = 0;
        for (int index = 0; index < numbers.length; index++) {
            count++;
        }
        total = total(numbers);
        return average = total / count;
    }
    public  static double max(double ...numbers){
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("Enter third number: ");
        double thirdNumber = input.nextDouble();
        MinimumOfInt minimumOfInt = new MinimumOfInt();


        System.out.println("The smallest number is: " + minimumOfInt.smallest(firstNumber,secondNumber,thirdNumber));
        System.out.println("The total sum of the numbers is: " + total(firstNumber,secondNumber,thirdNumber));
        System.out.println("The average of the numbers = " + averageOfNumbers(firstNumber,secondNumber,thirdNumber));
        System.out.println("The maximum of the numbers = " + max(firstNumber,secondNumber,thirdNumber));

    }
}
