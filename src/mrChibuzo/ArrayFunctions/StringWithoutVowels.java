package mrChibuzo.ArrayFunctions;

public class StringWithoutVowels {

    public static String removeVowels(String givenWord){
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        for (int count = 0; count < givenWord.length(); count++){
            if (givenWord.charAt(count) == vowels.charAt(0) || givenWord.charAt(count) == vowels.charAt(1) || givenWord.charAt(count) == vowels.charAt(2) || givenWord.charAt(count) == vowels.charAt(3) || givenWord.charAt(count) == vowels.charAt(4)){
                continue;
            }
            result.append(givenWord.charAt(count));
        }
        return result.toString();
    }


//    public static void main(String[] args) {
//        String given = "authentication";
//        System.out.println(removeVowels(given));
//    }
}
