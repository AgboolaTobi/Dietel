import Assignment1.DispatchRider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispatchRiderTest {
    @Test
    public void testHowMuchRiderWillGetPaidForAbove70SuccessfulDeliveries() {
        DispatchRider myRider = new DispatchRider();
        myRider.printPay(80);
        assertEquals(40000, 40000);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween60And69() {
        DispatchRider myRider = new DispatchRider();
        myRider.printPay(65);
        assertEquals(21250, 21250);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween50And59() {
        DispatchRider myRider = new DispatchRider();
        myRider.printPay(55);
        assertEquals(16000, 16000);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBelow50() {
        DispatchRider myRider = new DispatchRider();
        myRider.printPay(25);
        assertEquals(9000, 9000);
    }

}
