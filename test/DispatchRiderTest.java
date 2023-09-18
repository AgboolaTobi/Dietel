import Assignment1.DispatchRider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispatchRiderTest {
    @Test
    public void testHowMuchRiderWillGetPaidForAbove70SuccessfulDeliveries() {
       int result =  DispatchRider.printPay(80);
        assertEquals(45000, result);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween60And69() {
        int result = DispatchRider.printPay(65);
        assertEquals(21250, 21250);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBetween50And59() {
        int result = DispatchRider.printPay(55);
        assertEquals(16000, 16000);
    }

    @Test
    public void testHowMuchRiderWillGetPaidForSuccessfulDeliveriesBelow50() {
        int result = DispatchRider.printPay(25);
        assertEquals(9000, 9000);
    }

}
