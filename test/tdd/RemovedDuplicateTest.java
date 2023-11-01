package tdd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static PersonalAssessments.WithDivine.RemovedDuplicate.*;
class RemovedDuplicateTest {

    @Test
    public void testThatDuplicatesAreRemoved(){
        int[] myArray = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
    }

}