package tdd;

import org.junit.jupiter.api.Test;
import static PersonalAssessments.WithDivine.EvenNumbers.*;
import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {
    @Test
    public void testThatEvenNumbersArePicked(){
        int[] expected = {2, 4, 6,8,10};
        assertArrayEquals(expected,arrayOfEvenNumbers(1,10));
    }

}