package tolu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenlyPositionedElementsTest {


    @Test
    public void testThatElementsInTheEvenPositionArePicked() {
       int[] example = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
       int[] answer = {1,3,5,7,9,11,13};
       assertArrayEquals(answer,EvenlyPositionedElements.evenPosition(example));
    }

}