package tdd;

import PersonalAssessments.RecursionFunction1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionFunction1Test {

    @Test
    public void testThatRecursionWorks(){
        assertEquals(55, RecursionFunction1.sum(10));
    }

}