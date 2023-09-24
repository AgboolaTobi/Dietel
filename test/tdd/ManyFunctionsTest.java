package tdd;

import Assignment1.ManyFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManyFunctionsTest {

    @Test
    public void testThatIntegerIsEven() {
       boolean myFunctions = ManyFunctions.evenNumber(8);
        assertTrue(myFunctions);

    }
    @Test
    public void testThatIntegerIsNotEven() {
        boolean myFunctions = ManyFunctions.evenNumber(9);
        assertFalse(myFunctions);

    }

    @Test
    public void testThatNumberIsAPrimeNumber() {
        boolean myFunctions = ManyFunctions.isPrimeNUmber(7);
        assertTrue(myFunctions);
    }

    @Test
    public void testThatNumberIsNotAPrimeNumber() {
        boolean myFunctions = ManyFunctions.isPrimeNUmber(15);
        assertFalse(myFunctions);
    }
    @Test
    public void testThatNumber1CanBeSubtractedFromNumber2() {
        int myFunctions = ManyFunctions.subtract(7, 4);
        assertEquals(3, myFunctions);
    }

    @Test
    public void testThatNumber2CanBeSubtractedFromNumber1() {
        int myFunctions = ManyFunctions.subtract(4, 9);
        assertEquals(5, myFunctions);
    }

    @Test
    public void testThatNumber2CanBeDividedByNumber1() {
        double myFunctions = ManyFunctions.divide(9, 3);
        assertEquals(3, myFunctions);
    }

    @Test
    public void testThatNumber1CanBeDividedByNumber2() {
        double myFunctions = ManyFunctions.divide(25, 5);
        assertEquals(5, myFunctions);
    }

    @Test
    public void testThatIntegerIsAFactor() {
        int myFunctions = ManyFunctions.factorOf(36);
        assertEquals(9, myFunctions);
    }

}