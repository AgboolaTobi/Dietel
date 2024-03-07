package classExercises;
import  java.util.ArrayList;
public class Lcm {
    public static int [] calculateLcmOf(int number){
        ArrayList<Integer> results = new ArrayList<>();
        int divisor = 2;
        while (number > 1){
            if (number % divisor == 0){
                results.add(divisor);
                number = number/ divisor;
                divisor = 2;
            }
            else {
                ++divisor;
            }
        }
        return convertToArray(results);

    }

    public static int[] convertToArray(ArrayList<Integer> results) {
        int [] result = new int[results.size()];
        for (int i = 0; i < result.length ;i++) {
            result[i] = results.get(i);

        }
        return result;
    }
}
