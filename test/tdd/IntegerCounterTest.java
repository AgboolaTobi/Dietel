package tdd;

import classExercises.Femi.IntegerCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerCounterTest {
    @Test
    public void test_that_function_counts_the_integers_present(){
        String[] myArray = {"ABc21f", "130cpz", "A61L"};
        String[] myArray2 = {"235fht", "fer567AWE", "6-879and"};
        String[] myArray3 = {"fd0000OOOgns", "gsjyj"};
        int result = IntegerCounter.countInt(myArray);
        int result2 = IntegerCounter.countInt(myArray2);
        int result3 = IntegerCounter.countInt(myArray3);
        assertEquals(7,result);
        assertEquals(10,result2);
        assertEquals(4,result3);

    }

}