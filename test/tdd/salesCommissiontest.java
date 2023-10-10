package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tdd.SalesCommission.pay;

public class salesCommissiontest {

        @Test
        public  void testTotal(){
            double amount = 900;
            assertEquals(981,pay(amount));
        }
}
