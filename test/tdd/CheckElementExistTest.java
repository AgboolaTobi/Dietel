package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static mrChibuzo.ArrayFunctions.ArraySnacks.check;
class CheckElementExistTest {
    @Test
    public void testThatAnElementExistInAnArray(){
        int[] myArray = {2, 3, 4};
        int checker = 4;
        assertTrue(check(myArray,checker));

    }

    @Test
    public void testThatAnElementDoesNotExistInAnArray(){
        int[] myArray = {2, 3, 4};
        int checker = 7;
        assertFalse(check(myArray,checker));
    }

}