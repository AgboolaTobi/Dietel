package PersonalAssessments.WithDivine;

import java.util.ArrayList;

public class RemovedDuplicate {
    public static ArrayList<Integer> duplicates(int[] array){
        ArrayList<Integer> picked = new ArrayList<>();
        for (int index = 0; index < array.length; index++){
            for (int element = index + 1; element < array.length; element++){
                if (array[index]== array[element]) {
                    picked.add(array[element]);
                }
            }
        }
        return picked;
    }
    public static int primeNumbers(int number){
        int lengthOfNumbers = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0){
                lengthOfNumbers++;
            }
        }
        if (lengthOfNumbers <= 2) return number;
        else return 0;

    }
    public static int[] arrayOfDuplicates(int startPoint, int endPoint){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int index = startPoint; index <= endPoint; index++) {
            if (primeNumbers(index) != 0) {
                primes.add(primeNumbers(index));
            }
        }
        return convertToAnArray(primes) ;
    }

    public static int[] convertToAnArray(ArrayList<Integer> numbers){
        int[] result = new int[numbers.size()];
        for (int index = 0; index < numbers.size(); index++){
            result[index] = numbers.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(duplicates(myArray));
        System.out.println();


    }
}
