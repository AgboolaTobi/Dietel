import org.junit.jupiter.api.Test;
import tdd.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootTest {
    @Test
    public void testThatSquareRootExist(){
       int result =  Function.squareRoot(25);
       assertEquals(result, 5);
    }
    @Test
    public void testForSquareRootOfANumber(){
        int result = Function.squareRoot(36);
        assertEquals(result, 6);
    }
    @Test
    public void testThatSquareRootOfANegativeNumberDoesNotExist(){
        int result = Function.squareRoot(-36);
        assertEquals(result, 0);
    }

}
