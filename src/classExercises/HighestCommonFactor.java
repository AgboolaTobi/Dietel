package classExercises;


import java.util.ArrayList;
import java.util.Arrays;

public class HighestCommonFactor {
    public static int[] Lcm(int[] number) {
            ArrayList<Integer> results = new ArrayList<>();
            int divisor = 2;
            for (int count = 0; count < number.length; count++) {
                while (number[count] >1){
                    if (number[count] % divisor == 0) {
                        results.add(divisor);
                        number[count] = number[count] / divisor;
                        divisor = 2;
                    } else {
                        ++divisor;
                    }
                }
            }
            return convertToArray(results);
    }

    private static int[] convertToArray(ArrayList<Integer> results) {
        int [] result = new int[results.size()];
        for (int i = 0; i < result.length ;i++) {
            result[i] = results.get(i);

        }
        return result;
    }


    public static void main(String[] args) {
        int[] myArray = {25,50};
        System.out.println(Arrays.toString(Lcm(myArray)));
    }
}
