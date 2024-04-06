package classExercises;

public class TheHighestCommonFactor {

    public static int sum(int[] numbers){
        int result = 0;
        for (int number = 0; number < numbers.length; number++) {
            result+= number;
        }
        return result;
    }

    public static int average(int[] numbers){
        int result = 0;
        int average = 0;
        for (int number = 0; number < numbers.length; number++) {
            result+= number;
            average = result/ numbers.length;
        }
        return average;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        System.out.println(sum(numbers));
    }
}
