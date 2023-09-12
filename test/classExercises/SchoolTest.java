package classExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class School2Test {
    @Test
    public void testThatSchool2HasAName(){
        School2 mySchool2 = new School2();
        mySchool2.setName("doctor");
        assertEquals("doctor",mySchool2.getName());
    }
@Test
    public void testThatASchoolHasAddress(){
        School2 mySchool2 = new School2();
        mySchool2.setAddress("312 Sabo Yaba");
        assertEquals("312 Sabo Yaba",mySchool2.getAddress());

}

@Test
    public void testThatASchoolHasStudents(){
        School2 mySchool2 = new School2();
        mySchool2.getNumberOfStudents(300);
        assertEquals(300,mySchool2.getNumberOfStudents());
    }
}