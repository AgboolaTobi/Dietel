package PersonalAssessments;

import java.util.Arrays;

public class ArrayAverage {
    public static int average(int [] myArray) {

        int sum = 0;
        int average = 0;
        for (int index = 0; index < myArray.length; index++){
          sum += myArray[index];
        }
        average = sum/ myArray.length;
        return  average;
    }

    public static int  largestElement(int[] myArray){
        int largest = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[0] > myArray[i]){
                largest = myArray[0];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] myArray = new int[]{10, 20, 30, 40, 50};
        System.out.println(average(myArray));
        System.out.println(Arrays.toString(new int[]{largestElement(myArray)}));
    }
}
