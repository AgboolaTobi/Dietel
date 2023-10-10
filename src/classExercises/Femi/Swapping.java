package classExercises.Femi;

public class Swapping {

    public static int[] swap(int[]numbers, int number1, int number2){

            numbers[number1] = numbers[number1] + numbers[number2];
            numbers[number2] = numbers[number1] - numbers[number2];
            numbers[number1] = numbers[number1] - numbers[number2];

        return numbers;
    }
}
