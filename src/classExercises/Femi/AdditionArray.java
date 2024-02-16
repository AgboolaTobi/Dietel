package classExercises.Femi;

import java.util.ArrayList;
import java.util.List;

public class AdditionArray {
    public static void main(String[] args) {
        System.out.println(addTheElements(new int[]{3, 4, 5, 1, 5}));
        System.out.println(addTheElements(new int[]{2,3,5,6,7,2}));
    }

    public static List<Integer> addTheElements(int[] numbers){
        List<Integer> result = new ArrayList<>();
        int counter = 1;
        int first;
        int second;
        if (numbers.length % 2 == 0){
            for (int element = 0; element < numbers.length; element+=2){
                first = numbers[element];
                second = numbers[counter];
                counter+= 2;
                result.add(first + second);
            }
        }else {
            for (int element = 0; element < numbers.length - 1; element+=2){
                first = numbers[element];
                second = numbers[counter];
                counter+=2;
                result.add(first + second);
            }
            result.add(numbers[numbers.length - 1]);
        }
        return result;
    }
}
