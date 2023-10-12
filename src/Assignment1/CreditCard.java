package Assignment1;

public class CreditCard {

    public static String cardType(String cardNumber) {
        String result;
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
            String firstCharacter = String.valueOf(cardNumber.charAt(0));
            String secondCharacter = String.valueOf(cardNumber.charAt(1));
            if (firstCharacter.equals("4")){
                result = "Visa Cards";
            } else if (firstCharacter.equals("5")) {
                result = "Master Card";
            } else if (firstCharacter.equals("3") && secondCharacter.equals("7")) {
                result = "American Express Cards";
            } else if (firstCharacter.equals("6")) {
                result = "Discover Card";
            }else {
                result = "Invalid Card";
            }
            return result;
        }
        else return "Invalid";
    }

    public static String validity(String cardNumber) {
        int addEven = 0;
        int sumOdd = 0;
        String result = "Invalid";
        for (int evenLength = 0; evenLength < cardNumber.length(); evenLength+= 2) {
            String number = String.valueOf(cardNumber.charAt(evenLength));
            int multiply = Integer.parseInt(number) * 2;
            if (multiply >= 10){
                int first = multiply % 10;
                int second = multiply / 10;
                multiply = first + second;
            }
            addEven += multiply;
        }
        for (int oddLen = 1; oddLen <cardNumber.length() ; oddLen+= 2) {
            String number = String.valueOf(cardNumber.charAt(oddLen));
            sumOdd += Integer.parseInt(number);
        }
        int total = addEven + sumOdd;
        if (total % 10 == 0){
            result = "Valid";
        }
        return result;
    }
}
