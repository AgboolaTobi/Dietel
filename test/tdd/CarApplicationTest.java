package tdd;

import Dietelchapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarApplicationTest {



    @Test
    public void testThatCarHasAYearOfMake(){
        Car myCar = new Car();
        myCar.setYear("1998");
        assertEquals("1998",myCar.getYear());
    }
    @Test
    public void testThatCarHasAModel(){
        Car theModel = new Car();
        theModel.setModel("Lexus Rx350");
        assertEquals("Lexus Rx350",theModel.getModel());
    }

    @Test
    public void testThatCarHasAPriceToIt(){
        Car thePrice = new Car();
        thePrice.setPrice(2500000.00);
        assertEquals(2500000, thePrice.getPrice());
    }
    @Test
    public void testThatPriceCannotBeNegative(){
        Car negativePrice = new Car();
        negativePrice.setPrice(-4500.00);
        assertEquals(0,negativePrice.getPrice());
    }
}
