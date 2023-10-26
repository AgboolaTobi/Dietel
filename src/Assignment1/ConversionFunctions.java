package Assignment1;

import java.util.Arrays;

public class ConversionFunctions {

    public static String decimalToBinary(int number){
        int base = 2;
        StringBuilder result = new StringBuilder(" ");
        StringBuilder check = new StringBuilder(" ");

        do{
            check.append(number % base);
            number /= base;
        }while(number != 0);

        for(int count = (check.length() - 1); count >= 0; count--){
            result.append(check.charAt(count));
        }

        return result.toString();
    }

    public static int binaryToDecimal(int numbers) {

        int result = 0;

        int base = 1;

        int check = numbers;
        while (check > 0) {
            int lastDigit = check % 10;
            check = check / 10;

            result += lastDigit * base;

            base = base * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberPrimes(56)));
    }


    public static int[] numberPrimes(int number) {
        if (number <= 1) {
            return null;
        }
        int factorCount = 0;
        int originalNumber = number;
        for (int count = 2; number != 1; count += 1) {
            while (number % count == 0) {
                ++factorCount;
                number /= count;
            }
        }
        number = originalNumber;
        int[] factors = new int[factorCount];
        factorCount = 0;
        for (int count = 2; number != 1; count += 1) {
            while (number % count == 0) {
                factors[factorCount++] = count;
                number /= count;
            }
        }
        return factors;
    }
}
