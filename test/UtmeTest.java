import Assignment1.Utme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmeTest {

    @Test
    public void testThatCopiesBetweenOneAndFourIs2000PerCopy() {
        int amount = Utme.amountPerCopy(3);
        assertEquals(6000, amount);
    }

    @Test
    public void testThatCopiesBetweenFiveAndNineIs1800PerCopy() {
        int costOfCopy = Utme.amountPerCopy(6);
        assertEquals(10800, costOfCopy);
    }

    @Test
    public void testThatCopiesBetween10And29Is1600PerCopy() {
        int amountOfTheCopies = Utme.amountPerCopy(20);
        assertEquals(32000, amountOfTheCopies);
    }

    @Test
    public void testThatCopiesBetween30And49Is1500PerCopy() {
        int amountOfTheCopies = Utme.amountPerCopy(35);
        assertEquals(45500, amountOfTheCopies);
    }

    @Test
    public void testThatCopiesBetween100And299Is1200PerCopy() {
        int amountOfANumberOfCopiesWithinThisRange = Utme.amountPerCopy(100);
        assertEquals(120000, amountOfANumberOfCopiesWithinThisRange);
    }

    @Test
    public void testThatCopiesBetween200And499Is1100PerCopy() {
        int amountOfANumberOfCopiesWithinThisRange = Utme.amountPerCopy(200);
        assertEquals(220000, amountOfANumberOfCopiesWithinThisRange);
    }

    @Test
    public void testThatCopiesAbove500Is1000PerCopy() {
        int amountOfANumberOfCopiesWithinThisRange = Utme.amountPerCopy(1000);
        assertEquals(1000000, amountOfANumberOfCopiesWithinThisRange);

    }
}