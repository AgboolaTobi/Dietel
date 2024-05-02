package leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] array = {3,2,4};
        int target = 6;
        int[] result = {1,2};
        assertArrayEquals(result, TwoSum.twoSum(array, target));

    }


    @Test
    public void testTwoSum2() {
        int[] array = {3, 3};
        int target = 6;
        int[] result = {0,1};
        assertArrayEquals(result, TwoSum.twoSum(array, target));

    }


}