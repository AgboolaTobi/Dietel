package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ACTest {
    @Test
    public void testThatWeHaveAnAc(){
        AC myAc = new AC();
        assertNotNull(myAc);
    }
    @Test
    public void testThatICanTurnOnAnAc(){
        AC myAc = new AC();
        assertFalse(myAc.isOn());

        myAc.powerOn();
        assertTrue(myAc.isOn());
        myAc.powerOn();
        assertFalse(myAc.isOn());
    }
    @Test
    public void testThatAcCanBeIncreaseTemperature(){
        AC myAc = new AC();
        myAc.powerOn();
        assertTrue(myAc.isOn());

        myAc.increaseTemperature();
        assertEquals(17,myAc.getTemperature());
        myAc.increaseTemperature();
        assertEquals(18,myAc.getTemperature());
    }
    @Test
    public void testThatAcCanBeIncreasedMultipleTimes(){
        AC myAc = new AC();
        myAc.powerOn();
        assertTrue(myAc.isOn());

        myAc.increaseTemperature();
        assertEquals(17,myAc.getTemperature());
        myAc.increaseTemperature();
        assertEquals(18,myAc.getTemperature());
        myAc.increaseTemperature();
        assertEquals(19,myAc.getTemperature());
        myAc.increaseTemperature();
        assertEquals(20,myAc.getTemperature());

    }
    @Test
    public void testThatAcCanDecreaseTemperature(){
        AC myAc = new AC();
        myAc.powerOn();
        assertTrue(myAc.isOn());
        myAc.increaseTemperature();
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());

    }

    @Test
    public void tesThatAcCannotIncreaseBeyond30() {
     AC myAc = new AC();
     myAc.powerOn();
     assertTrue(myAc.isOn());
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.increaseTemperature();
     myAc.decreaseTemperature();
     assertEquals(29,myAc.getTemperature());
    }

}
