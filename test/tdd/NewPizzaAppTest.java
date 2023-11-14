package tdd;

import mrChibuzo.NewPizzaApp;
import org.junit.jupiter.api.Test;
import mrChibuzo.NewPizzaApp.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NewPizzaAppTest {

    @Test
    public void testPizzaBoxSize(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int result = 10;
        assertEquals(result,NewPizzaApp.pizzaSize(size));
    }

}