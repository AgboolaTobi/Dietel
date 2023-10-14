package classExercises;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String... args) {
        int[][] items = {{34,23,65},{23,67,44,68},{1,2,3,4,5}};
//        for (int[] iterate:items){
//            System.out.println(" ");
//            for (int item : iterate){
//                System.out.print(item + "      ");
//            }
//        }

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "        ");
            }
            System.out.println();
        }
    }
}
