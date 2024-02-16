package tdd;

import mrChibuzo.ArrayFunctions.StringWithoutVowels;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringWithoutVowelsTest {

    @Test

    public void testThatVowelsAreRemovedFromAGivenWord(){
        String given = "authe0ntication";
        String result = "thntctn";

        assertEquals(result, StringWithoutVowels.removeVowels(given));
    }

    @Test

    public void testThatVowelsAreRemovedFromAGivenWord2(){
        String given = "aeiou";
        String result = "";

        assertEquals(result, StringWithoutVowels.removeVowels(given));
    }

    @Test

    public void testThatVowelsAreRemovedFromAGivenWord3(){
        String given = "kzychrtz";
        String result = "kzychrtz";

        assertEquals(result, StringWithoutVowels.removeVowels(given));
    }


}