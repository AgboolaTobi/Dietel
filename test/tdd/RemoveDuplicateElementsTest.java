package tdd;

import classExercises.RemoveDuplicateElements;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateElementsTest {
    @Test
    public void testThatDuplicateElementsCanBeRemoved(){
        int[] check = {1,2,3,2,4,5,6,4,3,5};
        int[] result = {1,2,3,4,5,6};
        assertEquals(result, RemoveDuplicateElements.trimed(check, 6));
    }
}
