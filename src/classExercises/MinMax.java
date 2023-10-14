package classExercises;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] myArray = {5,3,4,1,2,78,4,53,3};
        int maxSum = totalSum(myArray) - minElement(myArray);
        System.out.println(maxSum);

        int minMax = totalSum(myArray) - maxElement(myArray);

        int[] both = new int[]{minMax, maxSum};
        System.out.println(Arrays.toString(both));
        System.out.println(reverseElements(myArray));
        System.out.println(minElement(myArray));
    }

    public static int totalSum(int[] myArray) {
        int sum = 0;
        for (int index = 0; index < myArray.length; index++){

            sum = sum + myArray[index];
        }
        return sum;
    }

    public  static int maxElement(int[] myArray){
        int max = myArray[0];
        for (int index = 0; index < myArray.length; index++) {
            if (max < myArray[index]){
                max = myArray[index];
            }
        }
        return max;
    }
    public static int minElement(int[] myArray){
        int min = myArray[0];
        for (int index = 0; index < myArray.length; index++) if (min > myArray[index]){
            min = myArray[index];

        }
        return min;
    }

    public static String reverseElements(int[] myArray){
        String reverse = " ";
        for (int index = myArray.length-1; index >= 0 ; index--) {
            String result = String.valueOf(myArray[index]);
            reverse = result + " ";

        }
        return reverse;
    }
}