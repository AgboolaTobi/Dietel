package tdd;

import mrChibuzo.ArrayFunctions.OddlyPlacedElements;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class OddlyPlacedElementsTest {

    @Test
    public void testThatElementsInOddPositionAreReturnedIfLengthIsEven(){
        int[] array = {1,2,3,4,5,6};
        int [] result = {1,3,5};

        assertEquals(Arrays.toString(OddlyPlacedElements.oddlyPlaced(array)), Arrays.toString(result));

    }

    @Test
    public void testThatElementsInOddPositionAreReturnedIfLengthIsOdd(){
        int[] array = {1,2,3,4,5,6,7};
        int [] result = {1,3,5,7};

        assertEquals(Arrays.toString(OddlyPlacedElements.oddlyPlaced(array)), Arrays.toString(result));

    }

}