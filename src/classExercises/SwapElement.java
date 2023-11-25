package classExercises;

import java.util.Arrays;

public class SwapElement {
    public static int[] swap(int[] array){
        if (array.length % 2 == 0) {
            int count = 1;
            for (int index = 0; index < array.length; index+=2) {
                    int holder = array[count];
                    array[count] = array[index];
                    array[index] = holder;
                    count+=2;
            }
        }else {
            int count = 0;
            for (int index = 1; index < array.length - 1; index+=2){
                int holder = array[count];
                array[count] = array[index];
                array[index] = holder;
                count+=2;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(swap(myArray)));
    }
}
