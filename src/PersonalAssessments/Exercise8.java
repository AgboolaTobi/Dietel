package PersonalAssessments;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        double[] array = new double[10];
        array[0] = 1.1;
        array[1] = 1.2;
        array[2] = 1.3;
        array[3] = 1.4;
        array[4] = 1.5;
        array[5] = 1.6;
        array[6] = 1.7;
        array[7] = 1.8;
        array[8] = 1.9;
        array[9] = 2.0;
        System.out.println(Arrays.toString(array));
        array[9] = 5.5;
        System.out.println(Arrays.toString(array));
        double sum = array[0] + array[1];
        System.out.println(sum);
        double sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements += array[i];
        }
        System.out.println(sumOfElements);
        double minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum){
                array[i] = minimum;
            }
        }
        System.out.println(minimum);


    }
}
