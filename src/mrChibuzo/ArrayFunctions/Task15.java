package mrChibuzo.ArrayFunctions;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        int element;
        Scanner scanner = new Scanner(System.in);
        for (element = 1 ; element <= 5 ; element++) {
            System.out.println("Enter 5 elements into the array: ");
            numbers[element] = scanner.nextInt();
        }
        largest(numbers);

    }
    public static int largest(int numbers[]) {
        int element;
        int largest = 0;
        for (element = 0; element < 5; element++) {
            largest = numbers[0];
            largest(numbers);
            if (largest < numbers[element]) {
                largest = numbers[element];
            }
        }
        return largest;
    }
}
