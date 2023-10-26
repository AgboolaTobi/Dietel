package tdd;

import classExercises.HighestCommonFactor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestCommonFactorTest {

    @Test
    public void testHighestCommonFactor(){

        int[] result = {2, 3};
       assertArrayEquals(HighestCommonFactor.Lcm(new int[]{6, 12}),result);
    }
}