package classExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    public void testThatDogHasAName(){
        Dog mydog = new Dog();
        mydog.setName("hilary");
        assertEquals("hilary",mydog.getName());
    }


    @Test
    public void testThatMyDogHasAnAge(){
        Dog myDog = new Dog();
        myDog.setAge(578);
assertEquals(578,myDog.getAge());

    }

    @Test
    public void testTheHeightOfTheDog(){
        Dog myDog = new Dog();
        myDog.setHeight(46);
        assertEquals(46,myDog.getHeight());
    }

    @Test
    public void testTheColorOfTheDog(){
        Dog myDog = new Dog();
        myDog.setColor("gray");
        assertEquals("gray",myDog.getColor());

    }

}