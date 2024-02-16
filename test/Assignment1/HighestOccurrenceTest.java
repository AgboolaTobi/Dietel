package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestOccurrenceTest {


    @Test
    public void test(){
        int [] inputArray = {2,1,1,2,2};
        int output = 2;
        assertEquals(output, HighestOccurrence.highestOccurrence(inputArray));
    }
    @Test
    public void secondTest(){
        int [] inputArray = {2,1,1,2,2};
        int output = 2;
        assertEquals(output, HighestOccurrence.highestOccurrence(inputArray));
    }

}