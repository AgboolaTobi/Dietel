package tdd;

import Dietelchapter3.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    @Test
    public void testThatClockExist(){
        Clock myClock = new Clock();
        assertNotNull(myClock);
    }

    @Test
    public void testHour(){
        Clock hourClock = new Clock();
        hourClock.setHour(22);
        assertEquals(22,hourClock.getHour());
    }
    @Test
    public void testThatHourCannotBeMoreThan23(){
        Clock limitedHour = new Clock();
        limitedHour.setHour(24);
        assertEquals(0,limitedHour.getHour());
    }

    @Test
    public void testMinute(){
        Clock minuteChecker = new Clock();
        minuteChecker.setMinute(50);
        assertEquals(50,minuteChecker.getMinute());
    }

    @Test
    public void testThatMinuteCannotGoBeyond59(){
        Clock limitedMinute = new Clock();
        limitedMinute.setMinute(60);
        assertEquals(0,limitedMinute.getMinute());
    }
    @Test
    public void testSecond(){
        Clock checkSecond = new Clock();
        checkSecond.setSecond(45);
        assertEquals(45,checkSecond.getSecond());
    }
    @Test
    public void testThatSecondCannotGoBeyond59(){
        Clock limitedSecond = new Clock();
        limitedSecond.setSecond(60);
        assertEquals(0,limitedSecond.getSecond());
    }

}