package PersonalAssessments;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
public class ListExercise {

    public static int smallestElement(ArrayList<Integer> myList){
        int smallest = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) < smallest){
                smallest = myList.get(index);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();


    }
}
