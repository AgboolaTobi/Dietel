package mrChibuzo.ArrayFunctions;

import java.util.ArrayList;

import java.util.List;

public class OddlyPlacedElements {

    public static int[] oddlyPlaced(int[] givenArray){
        List<Integer> listOfElements = new ArrayList<>();
        int oddlyPlacedElement = 1;

        for (int count = 0; count < givenArray.length; count++){
            oddlyPlacedElement += count;
            if (oddlyPlacedElement % 2 != 0){
                listOfElements.add(givenArray[count]);
            }
            oddlyPlacedElement = 1;
        }
        return oddlyPositioned(listOfElements);
       }

       public static int[] oddlyPositioned(List<Integer> givenList){
        int[] array = new int[givenList.size()];
        for (int count = 0; count < givenList.size(); count++){
            array[count] = givenList.get(count);
        }
        return array;
       }

}
