package tolu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scores =  new Scanner(System.in);

        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter score: ");
            array[index] = scores.nextInt();

        }

        System.out.print(Arrays.toString(array));
    }
}
