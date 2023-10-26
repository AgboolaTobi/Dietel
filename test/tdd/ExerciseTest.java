package tdd;

import classExercises.Exercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    public  void fullStopCanBeAddedToEndOfAStringTest(){
        String result = Exercise.addFullStopTo("Philips.");
        assertEquals("Philips." , result);
    }
    @Test
    public  void capitaliseFirstLetterIn(){
        String result = Exercise.capitalizeFirstLetterIn("philips");
        assertEquals("Philips" , result);
    }
    @Test
    public void stringsAreBeautifiedTest(){
        String result = Exercise.beautify("I am a corper");
        assertEquals("I am a corper.", result);
    }



}