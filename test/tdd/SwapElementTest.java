package tdd;

import classExercises.SwapElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapElementTest {
    @Test
    public void testThatElementsAreSwappedForArrayLengthOfEvenLength(){
        int[] array = {1,2,3,4,5,6};
        int[] result = {2,1,4,3,6,5};
        assertArrayEquals(SwapElement.swap(array),result);
    }
    @Test
    public void TestThatElementsAreSwappedForArrayLengthOfOddLength(){
        int[] array = {1,2,3,4,5,6,7};
        int[] result = {2,1,4,3,6,5,7};
        assertArrayEquals(SwapElement.swap(array),result);
    }

}