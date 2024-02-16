package classExercises.Femi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonElementsTest {
    @Test public void testThatFunctionReturnsTheLowestInTheCommonValuesOfArray(){
        int [] firstArray = {2,3,5,6,7,8};
        int [] secondArray = {1,3,7,10,11,8};
        int expected = 3;
        assertEquals(expected,CommonElements.smallestCommonElement(firstArray,secondArray));
    }
    @Test public void testThatFunctionReturnsTheLowestInTheCommonValuesOfArrayWhenTherFiveElement(){
        int [] firstArray = {5,4,11,13,9};
        int [] secondArray = {9,11,15,1,14};
        int expected = 9;
        assertEquals(expected,CommonElements.smallestCommonElement(firstArray,secondArray));
    }

}