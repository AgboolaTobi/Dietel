//package PersonalAssessments;
//
//import java.util.Arrays;
//
//public class Assignment1 {
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(convertBinary(56)));
//        System.out.println(decimalToBinary(56));
//        System.out.println(binaryToDecimal(111000));
//        System.out.println(binaryToDecimal(111000));
//        System.out.println(Arrays.toString(numberPrimes(1625)));
//    }
//    public static int[] convertBinary(int number) {
//        int i = 0;
//        int[] array = new int[7];
//        int[] binary;
//        while (number > 0) {
//            array[i++] = number % 2;
//            number /= 2;
//        }
//        binary = new int[i];
//        int k = 0;
//        for (int j = i - 1; j >= 0; j--) {
//            binary[k++] = array[j];
//        }
//
//        return binary;
//    }
//
//
//    public static String decimalToBinary(int number){
//        int base = 2;
//        String result = " ";
//        String check = " ";
//
//        do{
//            check += (number % base);
//            number /= base;
//        }while(number != 0);
//
//        for(int count = (check.length() - 1); count >= 0; count--){
//            result += check.charAt(count);
//        }
//
//        return result;
//    }
//
//    public static long binaryToDecimal(long binaryNum)
//    {
//        long decimalEquivalent = 0;
//        long lastDigit ;
//        int power = 0;
//        while(binaryNum > 0)
//        {
//            lastDigit = binaryNum % 10;
//
//            decimalEquivalent += (long) (lastDigit * Math.pow(2, power));
//            power++;
//            binaryNum /= 10;
//        }
//
//        return decimalEquivalent;
//    }
//
//
//    public static int binaryToDecimal(int numbers) {
//
//        int result = 0;
//
//        int base = 1;
//
//        int check = numbers;
//        while (check > 0) {
//            int lastDigit = check % 10;
//            check = check / 10;
//
//            result += lastDigit * base;
//
//            base = base * 2;
//        }
//        return result;
//    }
//
//    public static int[] numberPrimes(int number) {
//        if (number <= 1) {
//            return null;
//        }
//        int factorCount = 0;
//        int originalN = number;
//        for (int count = 2; number != 1; count += 1 + (count &1)) {
//            while (number % count == 0) {
//                ++factorCount;
//                number /= count;
//            }
//        }
//        number = originalN;
//        int[] factors = new int[factorCount];
//        factorCount = 0;
//        for (int count = 2; number != 1; count += 1 + (count &1)) {
//            while (number % count == 0) {
//                factors[factorCount++] = count;
//                number /= count;
//            }
//        }
//        return factors;
//    }
//
//
//}
