package tdd;

import mrChibuzo.ArrayFunctions.ArraySnacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySnacksTest {
    @Test
    public void testTheLargestOfTheElements(){
        int[] myArray = {2, 4, 6, 8, 10, 11, 13, 15};
        int largest = ArraySnacks.getLargest(myArray,8);
        assertEquals(15,largest);
    }
    @Test
    public  void testThatLargestOfTheElementsCanBeCollected(){
        int[] thisArray = {6,9};
        int checkLargest = ArraySnacks.getLargest(thisArray, 2);
        assertEquals(9,checkLargest);
    }
    @Test
    public void testThatNegativeNumberCanWork(){
        int[] negativeArray = {-7, -3, -1, -9};
        int checkNegative = ArraySnacks.getLargest(negativeArray,4);
        assertEquals(-1,checkNegative);
    }
}