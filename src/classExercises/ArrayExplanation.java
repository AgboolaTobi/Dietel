package classExercises;

public class ArrayExplanation {

    public static int max(int... numbers){
        int max = numbers[0];
        for (int index = 0 ; index < numbers.length; index++){
            if (numbers[index] > max) max = numbers[index];
        }
        return max;
    }

}
