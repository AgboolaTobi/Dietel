package Assignment1.ArraySnacks;

public class CreditCard {
    public static void main(String[] args) {

    }


    public static boolean prefixCheck(long cardNumber, int number) {
        return getPrefixDigitSize(cardNumber, cardDigitSize(number)) == number;
    }
    public static int obtainDigit(int cardNumber) {
        if (cardNumber < 9)
            return cardNumber;
        return cardNumber / 10 + cardNumber % 10;
    }

    public static int cardDigitSize(long number) {
        String nums = number + "";
        return nums.length();
    }

    public static long getPrefixDigitSize(long cardNumber, int number) {
        if (cardDigitSize(cardNumber) > number) {
            String num = cardNumber + "";
            return Long.parseLong(num.substring(0, number));
        }
        return cardNumber;
    }
}
