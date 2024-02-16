package tdd;

import mrChibuzo.ArrayFunctions.LargestAndLowest;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LargestAndLowestTest {

    @Test
    public void testThatTheHighestAndSmallestAreReturnedInAnArray(){
        String numbers = "1 2 3 4 5";
        int[] result = {5,1};
        assertEquals(Arrays.toString(result), Arrays.toString(LargestAndLowest.arrayOfHighestAndLowest(numbers)));
    }
}