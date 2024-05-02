package leetcode;

import java.util.Arrays;

public class AddingTwoNumbers {

    public static int[] addTwoArrayReverseResult(int[] input, int[] input2) {
        int[] result = new int[input.length];
        for (int index = 0; index < input.length; index++) {
            for (int index2 = 0; index2 < input2.length; index2++) {
                if (input[index] + input2[index2] <= 9) {
                    result[index] = input[index] + input2[index2];
                }
                else {
                    result[index] = result[index] - 10;
                result[index - 1] = result[index - 1] + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {2,4,3};
        int[] input2 = {5,6,4};
        System.out.println(Arrays.toString(addTwoArrayReverseResult(input, input2)));
    }
}
