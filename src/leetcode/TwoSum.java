package leetcode;

public class TwoSum {


    public static int[] twoSum(int[] array, int target) {

        int[] result = new int[2];
            for (int index = 0; index < array.length; index++) {
                for (int index2 = index + 1; index2 < array.length; index2++) {
                    if (array[index] + array[index2] == target) {
                        result[0] = index;
                        result[1] = index2;
                    }
                }
            }
            return result;
        }

}
