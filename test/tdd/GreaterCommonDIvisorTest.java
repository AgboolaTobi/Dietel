package tdd;

import PersonalAssessments.GreatestCommonDivisor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreaterCommonDivisorTest {
    @Test
    public void testTheGreatestDivisor(){
        int firstNumber = 45;
        int secondNumber = 30;
        assertEquals(GreatestCommonDivisor.greatDivisor(firstNumber, secondNumber),15);
    }

}