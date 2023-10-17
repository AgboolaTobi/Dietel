package PersonalAssessments;


import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] myArray1 = new int[4];
        myArray1[0] = 3;
        myArray1[1] = 4;
        myArray1[2] = 5;
        myArray1[3] = 6;
        int sum1 = 0;
        int sum2 = 0;
        int coumt = 0;
        int[] myArray2 = new int[3];
        int[] bothArrays = new int[myArray1.length + myArray2.length];
        System.out.println(Arrays.toString(myArray1));

        myArray2[0] = 1;
        myArray2[1] = 2;
        myArray2[2] = 7;
        System.out.println(Arrays.toString(myArray2));

        for (int i = 0; i <myArray1.length ; i++) {
            sum1+= myArray1[i];
        }
        for (int j = 0; j < myArray2.length; j++) {
            sum2+= myArray2[j];
        }
        int total = sum1 + sum2;
        System.out.println(total);
        for (int i = 0; i < myArray1.length; i++) {
             bothArrays[i] = myArray1[i];
            coumt++;
        }
        for (int j = 0; j < myArray2.length; j++) {
           bothArrays[coumt] =  myArray2[j];
           coumt++;
        }

        for (int bothArray : bothArrays) {
            System.out.println(bothArray + " ");
        }


    }
}
