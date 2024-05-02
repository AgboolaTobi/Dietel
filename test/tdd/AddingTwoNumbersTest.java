package tdd;

import leetcode.AddingTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingTwoNumbersTest {

    @Test
    public void testAddingTwoNumbers() {
       int[] input = {2,4,3};
        int[] input2 = {5,6,4};
        int[] output = {7,0,8};
        // Explanation: 342 + 465 = 807.

        assertArrayEquals(output, AddingTwoNumbers.addTwoArrayReverseResult(input,input2));
    }

}