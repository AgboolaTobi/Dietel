package classExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeUnitTest {
    @Test
    public void testThatIHaveABike() {
        Bike mybike = new Bike();
        assertNotNull(mybike);
    }

    @Test
    public void testThatICanTurnOnMyBike() {
        Bike myBike = new Bike();
        assertFalse(myBike.isOn());

        myBike.powerOn();
        assertTrue(myBike.isOn());
        myBike.powerOn();
        assertFalse(myBike.isOn());
    }

    @Test
    public void testThatMyBikeCanAccelerateGear1() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.checkGear();
        assertEquals(3, myBike.getSpeed());
        assertEquals(1,myBike.checkGear());

    }

    @Test
    public void testThatMyBikeCanAccelerateGear2() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 20; count = count + 1) {
            myBike.accelerate();
        }
        assertEquals(21, myBike.getSpeed());
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(25, myBike.getSpeed());
        myBike.accelerate();
        myBike.checkGear();
        assertEquals(27, myBike.getSpeed());
        assertEquals(2,myBike.checkGear());
    }

    @Test
    public void testThatMyBikeCanAccelerateGear3() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 20; count = count + 1) {
            myBike.accelerate();
        }
        for (int count = 21; count <= 25; count = count + 1) {
            myBike.accelerate();
        }
        assertEquals(31, myBike.getSpeed());

        myBike.accelerate();
        myBike.checkGear();
        assertEquals(34, myBike.getSpeed());
        assertEquals(3,myBike.checkGear());

    }


    @Test
    public void testThatMyBikeCanAccelerateToGear4() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 20; count = count + 1) {
            myBike.accelerate();
        }
        for (int count = 24; count <= 32; count = count + 1) {
            myBike.accelerate();

        }
        assertEquals(43, myBike.getSpeed());
        myBike.accelerate();
        myBike.checkGear();
        assertEquals(47, myBike.getSpeed());
        assertEquals(4,myBike.checkGear());
    }

    @Test
    public void testThatMyBikeCanDecelerateInGear1() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 11; count = count + 1) {
            myBike.accelerate();
        }
        assertEquals(12, myBike.getSpeed());
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(14, myBike.getSpeed());
        myBike.decelerate();
        myBike.decelerate();
        myBike.checkGear();
        assertEquals(12, myBike.getSpeed());
        assertEquals(1,myBike.checkGear());

    }

    @Test
    public void testThatMyBikeCanDecelerateFromGear2ToGear1() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 21; count = count + 1) {
            myBike.accelerate();
        }
        assertEquals(23, myBike.getSpeed());
        myBike.accelerate();
        myBike.checkGear();
        assertEquals(25, myBike.getSpeed());
        assertEquals(2,myBike.checkGear());
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.checkGear();
        assertEquals(18, myBike.getSpeed());
        assertEquals(1,myBike.checkGear());
    }

    @Test
    public void testThatMyBikeCanDecelerateFromGear3ToGear2() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count <= 27; count = count + 1) {
            myBike.accelerate();
        }
        for (int count = 27; count <=25; count = count + 1) {
            myBike.decelerate();
            myBike.decelerate();
            myBike.decelerate();
            myBike.decelerate();
            myBike.checkGear();
            assertEquals(28, myBike.getSpeed());
            assertEquals(2,myBike.checkGear());

        }

    }

    @Test

    public void testThatMyBikeCanDecelerateFromGear4ToGear3() {
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        for (int count = 0; count < 29; count = count + 1) {
            myBike.accelerate();
            myBike.checkGear();
        }
        for (int count = 29; count <= 27; count = count + 1) {
            myBike.decelerate();
            myBike.checkGear();
        }
        assertEquals(40, myBike.getSpeed());
        myBike.decelerate();
        assertEquals(37, myBike.getSpeed());
        assertEquals(3,myBike.checkGear());

    }

}