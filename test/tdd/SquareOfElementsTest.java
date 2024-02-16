package tdd;

import mrChibuzo.ArrayFunctions.SquareOfElements;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SquareOfElementsTest {

    @Test
    public void testThatTheSquareOfElementsInTheGivenArrayIsReturned(){

        int[] givenArray = {1,2,3,4,5};
        int[] result = {1,4,9,16,25};
        assertEquals(Arrays.toString(result), Arrays.toString(SquareOfElements.squareOfElements(givenArray)));
    }

}