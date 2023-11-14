package tdd;

import mrChibuzo.PizzaFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFunctionsTest {
    @Test
    public void testPizzaSize(){
        assertEquals("large", PizzaFunctions.pizzaSize());
    }


}