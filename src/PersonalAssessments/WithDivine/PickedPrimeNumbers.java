package PersonalAssessments.WithDivine;

import java.util.ArrayList;

public class PickedPrimeNumbers {

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
    public static int[] arrayOfPrimeNumbers(int startPoint, int endPoint){
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

    public static int[] convertToArrayString(String elements){
        int[] result = new int[elements.length()];
        for (int index = 0; index < elements.length(); index++){
         char element = elements.charAt(index);
         result[index] = Integer.parseInt(String.valueOf(element));
        }
       return result;
    }



}
