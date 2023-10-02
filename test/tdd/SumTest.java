package tdd;

import org.junit.jupiter.api.Test;
import mrChibuzo.ArrayFunctions.ArraySnacks;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    public void testThatSumOfElementCanBeObtained(){
        int[] myArray = {2, 3, 4};
        assertEquals(9,ArraySnacks.sumForLoop(myArray,3));
    }

    @Test
    public void testThatSumOfElementCanIncludeNegative(){
        int[] myArray = {-1, 2, -3, 6, 10};
        assertEquals(14,ArraySnacks.sumForLoop(myArray,5));
    }
    @Test
    public void testThatSumOfElementCanBeObtainedUsingTheWhileLoop(){
        int[] myArray = {2, 3, 4};
        assertEquals(9,ArraySnacks.sumWhileLoop(myArray,3));
    }

    @Test
    public void testThatSumOfElementCanIncludeNegativeUsingTheWhileLoop(){
        int[] myArray = {-1, 2, -3, 6, 10};
        assertEquals(14,ArraySnacks.sumWhileLoop(myArray,5));
    }
    @Test
    public void testThatSumCanBeObtainedWithTheDoWhileLoop(){
        int[] myArray = {2, 3, 4};
        assertEquals(9,ArraySnacks.sumDoWhileLoop(myArray,3));
    }
    @Test
    public void testThatSumOfElementCanIncludeNegativeUsingTheDoWhileLoop() {
        int[] myArray = {-1, 2, -3, 6, 10};
        assertEquals(14,ArraySnacks.sumDoWhileLoop(myArray,5));
    }

}