package PersonalAssessments;

import java.util.Arrays;

public class ArrayPractice8 {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];

        }
        return result;

    }
    public static void main (String[]args){
        int[] array = {1, 2, 3, 6, 5, 4};
        System.out.println();Arrays.sort(array);
        System.out.println(Arrays.toString(reverse(array)));
    }
}

