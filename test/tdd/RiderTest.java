package tdd;//package tdd;

import Assignment1.Rider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {
    @Test

    public void testHowMuchRiderWillGetPaidForAbove70Success(){
        Rider myRider = new Rider();
        Rider.printPay1(80);
        myRider.printPay1(80);
        assertEquals(40000,myRider);
    }
}
