package PersonalAssessments;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
//        int[] myArray = new int[5];
//        boolean[] myArray2 = new boolean[3];
//        String[] myArray3 = new String[5];
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(Arrays.toString(myArray2));
//        System.out.println(Arrays.toString(myArray3));


        int[] array = {12,32,43,54,65};
        int total = 0;
        System.out.printf("%s%8s%n","Index","Element");

        for (int index = 0; index < array.length; index++) {
            System.out.printf("%d%8d%n", index,array[index]);
            total += array[index];

        }

        System.out.println(total);
    }
}
