package classExercises;

import java.util.ArrayList;

public class RemoveDuplicateElements {
    public static ArrayList<Integer> removeDuplicateElement(ArrayList<Integer> listWithDuplicates) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : listWithDuplicates) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static int[] removeDuplicatesFrom(int[] numberWithDuplicates) {
        int[] result = new int[numberWithDuplicates.length];
        int indexAtResult = 0;
        for (int i = 0; i < numberWithDuplicates.length; i++) {
            if (numberIsNotFound(result, numberWithDuplicates[i])) {
                result[indexAtResult] = numberWithDuplicates[i];
                indexAtResult++;
            }
        }
        return result;
    }
//    public static int[] convertedResult(ArrayList<Integer> result){
//        int [] convertedResult = new int[result.size()];
//        for (int i = 0; i < convertedResult.length; i++) {
//            convertedResult[i] = result.get(i);
//        }
//        return convertedResult;
//    }


    private static boolean numberIsNotFound(int[] result, int numberWithDuplicate) {
        for (int number : result) if (number == numberWithDuplicate) {
                return false;
            }
        return true;
    }


    public static int[] trimed(int[] result, int indexAtResult) {
        int[] myResult = new int[indexAtResult+1];
        for (int i = 0; i < myResult.length; i++) {
            myResult[i] = result[i];
        }
        return myResult;
    }
}