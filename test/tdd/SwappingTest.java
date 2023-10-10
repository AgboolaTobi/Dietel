package tdd;

import classExercises.Femi.Swapping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingTest {
    @Test
    public void testSwapping() {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] result = {1, 4, 3, 2, 5};
        int[] result1 = {1, 2, 5, 4, 3};
        assertArrayEquals(result, Swapping.swap(myArray, 1, 3));
    }

}