package mrChibuzo.ArrayFunctions;

import java.util.Arrays;

public class ArraySnacks {

    public static int getLargest(int[] largest, int total){
        int number;
        int count;
        int element;
        for (count = 0; count < total; count++)
        {
            for (element = count + 1; element < total; element++)
            {
                if (largest[count] > largest[element])
                {
                    number = largest[count];
                    largest[count] = largest[element];
                    largest[element] = number;
                }
            }
        }
        return largest[total-1];
    }

    public static int sumForLoop(int[] myArray, int total) {
        int sum=0;
        int count;
        for(count=0; count<total; count++)
        {
            sum=sum + myArray[count];
        }
        return sum;
    }
    public static int sumWhileLoop(int[] myArray, int total) {
        int sum = 0;
        int count = 0;
        while (count < total){
            sum += myArray[count];
            count++;
        }
        return sum;
    }
    public static int sumDoWhileLoop(int[] myArray, int total) {
        int sum = 0;
        int count = 0;
        do {
            sum += myArray[count];
            count += 1;
        }while (count < total);
        return sum;
    }
    public static boolean check(int[] myArray, int toCheckValue) {
        boolean test = false;
        for (int element : myArray) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int element = array.length - 1;

        for(int count = 0; count < array.length; count++) {
            newArray[count] = array[element];
            element--;
        }
        return newArray;
    }

    public static int findPosition(int myArray[], int position)
    {
        int arrayLength = myArray.length;
        int count = 0;

        while (count < arrayLength) {
            if (myArray[count] == position) {
                return count;
            }
            else {
                count = count + 1;
            }
        }
        return -1;
    }
    public static boolean palindrome(String str) {
        String name = "";
        boolean check = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            name = name + str.charAt(i);
        }
        if (str.equals(name)) {
            check = true;
        }
        return check;
    }

}
