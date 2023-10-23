package PersonalAssessments;

import java.util.Arrays;

public class ArrayPractice4 {
    public static void main(String[] args) {
        int[][] arr = {{47, 3, 12}, {51, 74, 20}};
        System.out.println(Arrays.toString(inner(arr)));

    }

    public static int[] inner(int[][] array) {
        int counter = 0;
        for (int count = 0; count < array.length; count++) {
            for (counter = 0; counter < array[count].length; counter++) {
                if (count == counter) {
                    return array[counter];
                }

            }
        }
        return array[counter];
    }
}
