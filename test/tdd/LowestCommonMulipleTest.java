package tdd;

import classExercises.LowestCommonMultiple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonMultipleTest {


    @Test
    public void testForLcm(){
        int[] numbers = {8,16,12};
        int result = 48;
        assertEquals(LowestCommonMultiple.findLCM(numbers),result);
    }

    @Test
    public void testForLcm2(){
        int[] numbers = {3,9,27};
        int result = 27;
        assertEquals(LowestCommonMultiple.findLCM(numbers),result);
    }

}