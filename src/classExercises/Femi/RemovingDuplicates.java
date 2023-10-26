package classExercises.Femi;

public class RemovingDuplicates {

    public static int[] duplicate(int[] array) {
        int element = 0;
        for (int length = 0; length < array.length; length++) {
            for (int check = length + 1; check < array.length; check++) {
                if (array[check] == array[length]) {
                    element++;
                }
            }
        }
        int[] number = new int[element];
        int counter = 0;
        for (int length = 0; length < array.length; length++) {
            for (int check = length + 1; check < array.length; check++) {
                int nums = array[check];
                if (nums == array[length]) {
                    number[counter] = nums;
                    counter++;
                }
            }
        }

        return number;

    }
    public static boolean isPalindrome(String myString) {
        String reverse = "";
        String result = myString.toLowerCase();

        for (int index = myString.length() - 1; index >= 0; index--) {
            reverse = reverse + result.charAt(index);
        }

        if (reverse.equals(result)) {
            return true;
        }
        return false;
    }

    public static String reverseString(String myString){
        String result = "";
        for (int count = myString.length() - 1; count >= 0; count--){
            result += myString.charAt(count);
        }
        return result;
    }


    public  static int[] dominant(int[] array) {

        for (int count = 0; count < array.length; count++) {
          int  currentElement = array[count];
            System.out.println(currentElement);
            for (int count2 = count + 1; count2 < array.length; count2++) {
                if (currentElement > array[count]) break;

            }
        }
        return null;
    }
    public static int countDigits(int number){
        int count = 0;
        while (number != 0){
            number = number / 10;
            count = count + 1;
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(5430));
    }

    public static boolean targetAnElement(int number, int index1, int index2, int target){
        int value = countDigits(number);
        int[] array= new int[countDigits(number)];

        for (int counter = 0; counter < value; counter++){
            System.out.println(number);
            array[counter] = (int) ((number) / Math.pow(10, (countDigits(number) - 1)));
            System.out.println(number);
            if (array[counter] < 0) number *= -1;
            number = (int) ((number) % Math.pow(10, (countDigits(number) - 1)));
        }
        System.out.println(number);
        if (target > array[index1] && target < array[index2]) return true;
        return false;
    }

    public static int power(int first,int second){
        int result = 1;
        for (int count = 0; count < second; count++){
            result *= first;
        }
        return result;
    }

    public static int digits(int number) {
        String output = String.valueOf(number);
        int lengthNumber = output.length();

        int count = 0;
        int digit = 0;

        while (count < lengthNumber){
            int result = number / (power(10,count)) % 10;
            count ++;
            digit += result;
        }
        return digit;
    }



}
