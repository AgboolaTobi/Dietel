package PersonalAssessments;

import java.util.Arrays;

public class TuesdayTask {

    public class HighestCommonFactor {
        public static int[] numberPrimes(int number, int number2) {
            if (number <= 1 && number2 <= 1) {
                return null;
            }
            int factorCount = 0;
            int originalNumber = number;
            int originalNumber2 = number2;
            for (int count = 2; number != 1 && number2 != 1; count += 1) {
                while (number % count == 0 && number2 % count == 0) {
                    ++factorCount;
                    number /= count;
                    number2 /= count;
                }
            }
            number = originalNumber;
            number2 = originalNumber2;
            int[] factors = new int[factorCount];
            factorCount = 0;
            for (int count = 2; number != 1 && number2 != 1; count += 1) {
                while (number % count == 0 && number2 % count == 0) {
                    factors[factorCount++] = count;
                    number /= count;
                    number2 /= count;
                }
            }
            return factors;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(numberPrimes(6, 18)));
        }
    }
}