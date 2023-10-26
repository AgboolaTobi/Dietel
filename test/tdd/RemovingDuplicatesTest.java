package tdd;

import classExercises.Femi.RemovingDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingDuplicatesTest {

    @Test
    public  void testDuplicates(){
        int[] array = {1,2,3,3,2,4,5,6};
        int[] result = {2,3};
        assertArrayEquals(result, RemovingDuplicates.duplicate(array));
    }

    @Test
    public void testForPalindrome(){
        String stringOne = "Anna";
        assertTrue(RemovingDuplicates.isPalindrome(stringOne), "Anna");

    }
    @Test
    public void testForNotPalindrome(){
        String stringTwo = "Grace";
        assertFalse(RemovingDuplicates.isPalindrome(stringTwo), "Grace");

    }

    @Test
    public  void testTargetIsNotWithinTheIndices(){
        int number = 13579;
        assertFalse(RemovingDuplicates.targetAnElement(number,1,2,6));
    }
    @Test
    public  void testTargetIsWithinTheIndices(){
        int number = 13579;
        assertTrue(RemovingDuplicates.targetAnElement(number,3,4,8));
    }
}