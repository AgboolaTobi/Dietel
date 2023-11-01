package tdd;

import PersonalAssessments.RecursionFunction1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionFunction1Test {

    @Test
    public void testThatRecursionWorks(){
        assertEquals(55, RecursionFunction1.sum(10));
    }
    @Test
    public void testThatRecursionWorks2(){
        assertNotEquals(50, RecursionFunction1.sum(10));
    }

    @Test
    public void testHaltingInRecursion(){
        assertEquals(45,RecursionFunction1.sum2(5,10));
    }

    @Test
    public void testHaltingInRecursion2(){
        assertNotEquals(40,RecursionFunction1.sum2(5,10));
    }


}