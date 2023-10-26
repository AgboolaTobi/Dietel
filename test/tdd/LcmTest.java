package tdd;

import static org.junit.jupiter.api.Assertions.*;

import classExercises.Lcm;
import org.junit.jupiter.api.Test;
class LcmTest {
        @Test
        public void lcmOfOneNumberTest(){
            int[] result = {2, 5};
            assertArrayEquals(result, Lcm.calculateLcmOf(10));
        }

}