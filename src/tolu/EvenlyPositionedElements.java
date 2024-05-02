package tolu;

import java.util.Arrays;

public class EvenlyPositionedElements {


    public static int[] evenPosition(int[] tolu) {

        int[] result = new int[(tolu.length)];

        for (int index = 0; index < tolu.length; index = index + 2) {

            result[index] = tolu[index];

        }
        return result;
    }


    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(evenPosition(example)));
    }
}
