package tdd;

import leetcode.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    @Test
    public void test(){

        int target = 9;
        int [] input = {2,7,11,15};
        int [] output = {0,1};
        assertArrayEquals(output, TwoSum.twoSum(input,target));
    }


    @Test
    public void test2(){
        int target = 6;
        int[] input = {3,2,4};
        int[] output = {1,2};
        assertArrayEquals(output, TwoSum.twoSum(input,target));
    }

    @Test
    public void test3(){
        int target = 6;
        int[] input = {3,3};
       int[] output = {0,1};
       assertArrayEquals(output, TwoSum.twoSum(input,target));


    }

}