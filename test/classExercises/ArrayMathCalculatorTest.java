package classExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayMathCalculatorTest {

    @Test
    public void testCalculatorSum() {
        //given
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int[] numbers = {1, 2, 3, 4, 5, 10};
        //when
        arrayMathCalculator.sum(numbers);
        int sum = arrayMathCalculator.sum(numbers);
        //check
        assertEquals(25, sum);
    }

    @Test
    public void testCalculatorAverage(){
        //given
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int [] numbers = {1, 2, 3, 4, 5, 10};
        //when
        arrayMathCalculator.average(numbers);
        int average = arrayMathCalculator.average(numbers);
        //check

        assertEquals(4,average);
}
    @Test
    public void testCalculatorProduct(){
       //given
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int [] numbers = {1, 2, 3};
        //when
        arrayMathCalculator.multiply(numbers);
        int product = arrayMathCalculator.multiply(numbers);
        //check
        assertEquals(6,product);
    }
    @Test
    public void testSwapElements(){
        //given
        ArrayMathCalculator arrayMathCalculator = new ArrayMathCalculator();
        int [] numbers = {1, 2, 3, 4, 5};
        //when you swap the third element
        /* replace the second with the first
        replace the third with the fourth
        replace the fourth with the second
                */
       int [] result =  arrayMathCalculator.swap(numbers);
       int [] expected = {3, 4, 1, 2, 5};

        //check
        assertArrayEquals(expected,result);
    }

}