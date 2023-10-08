package classExercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateTest {

    @Test
    public void canRemoveDuplicate(){
//        Given
        int[] numbers = {4, 9, 4, 4, 7, 9, 1, 7};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
//        When
        int[] uniqueValuesArray = removeDuplicate.remove(numbers);
//        Assert
        assertEquals(4, uniqueValuesArray[0]);
        assertEquals(9, uniqueValuesArray[1]);
        assertEquals(4, uniqueValuesArray.length);
    }
}
