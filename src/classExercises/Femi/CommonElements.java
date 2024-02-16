package classExercises.Femi;

import java.util.ArrayList;

public class CommonElements {

    public static int smallestCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> commonValue = new ArrayList<>();
        for (int index = 0; index < firstArray.length; index++) {
            for (int count = 0; count < secondArray.length; count++) {
                if (firstArray[index] == secondArray[count]) {
                    commonValue.add(firstArray[index]);
                }
            }
        }
        int smallest = commonValue.get(0);
        for (int index = 0; index < commonValue.size(); index++) {
            if (commonValue.get(index) < smallest) {
                smallest = commonValue.get(index);
            }

        }
        return smallest;
    }

}
