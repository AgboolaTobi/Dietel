package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    public void testThatDogHasAName(){
        Dog myDog = new Dog();
        myDog.setName("doglas");
        assertEquals("doglas",myDog);
    }

}