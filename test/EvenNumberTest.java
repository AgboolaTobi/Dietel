import Assignment1.ManyFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EvenNumberTest {

   @Test
    public void testThatManyFuntionsClassExist(){
        ManyFunctions myFunction = new ManyFunctions();
        assertNotNull(myFunction);
    }
}
