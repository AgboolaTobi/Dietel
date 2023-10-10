package classExercises;

public class ArrayMathCalculator {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {

            sum += number;
        }
        return sum;
    }

    public int average(int[] numbers) {
        int sum = 0;
        int average = 0;
        for (int number : numbers) {

            sum += number;
            average = sum / numbers.length;
        }

        return average;
    }

    public int multiply(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product = product * number;
        }
        return product;
    }

    public int[] swap(int[] numbers) {
        int temp = 0;
        for (int index = 0; index < numbers.length; index++){
            if (index < numbers.length - 3) {
                temp = numbers[index];
                numbers[index] = numbers[index + 2];
                numbers[index + 2] =  temp;
            }
        }
        return numbers;
    }
}
