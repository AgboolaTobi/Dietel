package classExercises;

public class Exercise {
    public static String addFullStopTo(String string) {
//        to check index of last element in an array; total length- 1
//        int indexOfLastElement = string.length()-1;
//        char lastCharacter = string.length()-1;
        boolean stringContainsFullStop = (string.charAt(string.length()-1)+"").equals(".");
        if(!stringContainsFullStop) return string + ".";
        return string;
    }

    public static String capitalizeFirstLetterIn(String word) {
//        this below can also work
//        String output = "";
//        for (int i = 0; i < word.length(); i++) {
//            if(i == 0) {
//                output = output + (word.charAt(0) + "").toUpperCase();
//            }
//            else  output +=word.charAt(i);
//char does not have method
//        }
        return ((word.charAt(0)+ "").toUpperCase()) +word.substring(1);
    }

    public static String beautify(String sentence) {
        return addFullStopTo(capitalizeFirstLetterIn(sentence));
    }
}


