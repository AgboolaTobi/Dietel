package tdd;//package tdd;

import Assignment1.Rider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {
    @Test

    public void testHowMuchRiderWillGetPaidForAbove70SuccessfulDeliveries() {
        Rider myRider = new Rider();
        myRider.printPay1(80);
        assertEquals(40000, 40000);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween60And69() {
        Rider myRider = new Rider();
        myRider.printPay2(65);
        assertEquals(21250, 21250);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween50And59() {
        Rider myRider = new Rider();
        myRider.printPay3(55);
        assertEquals(16000, 16000);

    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBelow50() {
        Rider myRider = new Rider();
        myRider.printPay4(25);
        assertEquals(9000, 9000);

    }


}