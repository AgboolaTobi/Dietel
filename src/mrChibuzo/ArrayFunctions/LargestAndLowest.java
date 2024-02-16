package mrChibuzo.ArrayFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndLowest {


    public static int[] arrayOfHighestAndLowest(String numbers) {
        ArrayList<String> numbersInTheString = new ArrayList<>();

        for (int count = 0; count < numbers.length(); count++) {
            if (!String.valueOf(numbers.charAt(count)).equals(" "))
                numbersInTheString.add(String.valueOf(numbers.charAt(count)));
        }
        return highestAndLowest(numbersInTheString);

    }
        private static int[] highestAndLowest(ArrayList<String> integers){
            int[] result = new int[2];
            int smallest = Integer.parseInt(integers.get(0));
            int highest = 0;

            for (String integer : integers) {
                if (Integer.parseInt(integer) < smallest) {
                    smallest = Integer.parseInt(integer);

                }
                if (Integer.parseInt(integer) > highest) {
                    highest = Integer.parseInt(integer);
                }
            }

            result[0] = highest;
            result[1] = smallest;

            return result;
        }

    public static void main(String[] args) {
        String numbers = "8 1 2 3 4 5 6";
        System.out.println(Arrays.toString(arrayOfHighestAndLowest(numbers)));
    }
    }
