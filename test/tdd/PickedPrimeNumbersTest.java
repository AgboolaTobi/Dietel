package tdd;

import org.junit.jupiter.api.Test;
import static PersonalAssessments.WithDivine.PickedPrimeNumbers.*;

import static org.junit.jupiter.api.Assertions.*;

class PickedPrimeNumbersTest {
    @Test
    public void testThatPrimeNumbersArePicked(){
        assertEquals(2,primeNumbers(2));
        assertEquals(0,primeNumbers(9));
    }
    @Test
    public void testThatPrimeNumbersArePicked2(){
        int [] expected = {1,2,3,5,7};
        assertArrayEquals(expected,arrayOfPrimeNumbers(1,10));
    }


}