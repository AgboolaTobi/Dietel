package Assignment1;

public class ManyFunctions {

    public static boolean evenNumber(int integer) {
        return integer % 2 == 0;
    }

    public static boolean isPrimeNUmber(int number) {
        int noOfFactor = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                noOfFactor++;
            }
        }
        return noOfFactor == 2;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }

    }

    public static double divide(int firstNumber, int secondNUmber) {
        double result = (double) firstNumber / secondNUmber;
        double quotient = Math.round(result * 100.0) / 100.0;

        if (secondNUmber != 0) {
            return quotient;
        } else {
            return 0;
        }

    }

    public static int factorOf(int integer) {

        int factor = 0;
        int count = 1;
        while (count <= integer) {
            if (integer % count == 0) {
                factor = factor + 1;
            }
            count += 1;
        }
        if (factor > 0) {
            return factor;
        }
        return factor;
    }

    public static boolean isSquare(int integer){
        for (int count = 1; count <= integer ; count++){
            if (integer / count == count){
                return true;
            }
        }
        return false;

    }

    public static  boolean isPalindrome(int integer){
        int first = integer/10000;
        int last = integer % 10;
        if (first == last) {
            return true;
        }
        return false;
    }

    public  static int factorialOf(int integer){
        int factorial = 1;
        int count = 1;
        while (count <= integer){
            integer*= count;
            count++;

        }
        return factorial;
    }
}