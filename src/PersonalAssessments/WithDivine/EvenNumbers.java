package PersonalAssessments.WithDivine;

import java.util.ArrayList;

public class EvenNumbers {
    public static int even(int number){

            if (number % 2 == 0){
                return number;

        }
        return 0;
    }


    public static int[] arrayOfEvenNumbers(int start, int end){
        ArrayList<Integer> value = new ArrayList<>();
        for (int index = start; index <= end; index++){
            if (even(index) != 0){
                value.add(even(index));
            }
        }
        return convertToAnArray(value);
    }


    public static int[] convertToAnArray(ArrayList<Integer> numbers){
        int[] result = new int[numbers.size()];
        for (int index = 0; index < numbers.size(); index++){
            result[index] = numbers.get(index);
        }
        return result;
    }

    public static int[] convertToArrayString(String elements){
        int[] result = new int[elements.length()];
        for (int index = 0; index < elements.length(); index++){
            char element = elements.charAt(index);
            result[index] = Integer.parseInt(String.valueOf(element));
        }
        return result;
    }


}
