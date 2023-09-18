import Assignment1.DispatchRider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispatchRiderTest {
    @Test
    public void testHowMuchRiderWillGetPaidForAbove70SuccessfulDeliveries() {
       int riderPay =  DispatchRider.printPay(80);
        assertEquals(45000, riderPay);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween60And69() {
        int riderPay = DispatchRider.printPay(65);
        assertEquals(21250, riderPay);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween50And59() {
        int riderPay = DispatchRider.printPay(55);
        assertEquals(16000, riderPay);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBelow50() {
        int riderPay = DispatchRider.printPay(25);
        assertEquals(9000, riderPay);
    }

}
