package tdd;

import Assignment1.ConversionFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionFunctionsTest {

    @Test
    public void testThatDecimalCanBeConvertedToBinary(){
        int numbers = 47;
        String result2 = "101111";
        String result = ConversionFunctions.decimalToBinary(numbers);
        assertEquals(ConversionFunctions.decimalToBinary(numbers), result2);
    }

    @Test
    public void testThatBinaryCanBeConvertedToDecimal(){
        assertEquals(ConversionFunctions.binaryToDecimal(111000),56);
    }

    @Test
    public void testThatANumberReturnsItsPrimeAnArrayOfItsPrimeFactors(){
        int[] number = ConversionFunctions.numberPrimes(6);
        int[] result = {2,3};
        assertEquals(number,result);
    }

}