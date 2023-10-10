import Chapter4.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void testTaxCalculatorForBelow30000Earning(){
        TaxCalculator taxCalculator = new TaxCalculator();
        double result = taxCalculator.earning(30000);
        assertEquals(4500,result);
    }

    @Test
    public void testTaxCalculatorForAbove30000Earning(){
        TaxCalculator taxCalculator = new TaxCalculator();
        double result = taxCalculator.earning(90000);
        assertEquals(18000,result);
    }
}
