import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EvenIntegerTest {
    @Test
    public void testThatClassExist(){
        EvenIntegerTest thisEven = new EvenIntegerTest();
        assertNotNull(thisEven);
    }

    @Test
    public void testThatMyIntegerIsEven(){
        EvenIntegerTest numberIsEven = new EvenIntegerTest();
        assertEquals(0,numberIsEven);
    }
}
