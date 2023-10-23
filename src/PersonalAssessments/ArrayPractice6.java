package PersonalAssessments;

import java.util.Objects;

public class ArrayPractice6 {
    public static void main(String[] args) {
        String[] first = {"dfg", "hhr"};
        String[] second = {"dfghh","hr"};
        System.out.println(check(first,second));
    }

    public  static boolean check(String[] myString1,String[] myString2){

        for (int counter = 0; counter < myString1.length; counter++) {
            for (int element = 0; element < myString1[element].length(); counter++) {
                for (int counter2 = 0; counter2 < myString2.length; counter2++){
                    for (int element2 = 0; element2 < myString2[element2].length(); element2++){
                        if (Objects.equals(myString1[element].length(), myString2[element2].length())) {
                            continue;
                        }

                    }
                }

            }

        }
        return  true;
    }
}
