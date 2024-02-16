package DiariesTests;

import Diaries.Diary;
import Diaries.InvalidPassword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    @Test
    public void testDiaryCanBeCreated(){
        Diary myDiary = new Diary();
        assertTrue(myDiary.isLocked());

    }

    @Test
    public void testThatDiaryCanBeUnlockedWithPassword(){
        Diary myDiary = new Diary();
        myDiary.unlockDiary("1234");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void testThatDiaryCanBeLockedWithTheCorrectPassword(){
        Diary myDiary = new Diary();
        myDiary.unlockDiary("1234");
        myDiary.lockDiary("1234");
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void testThatIfDiaryIfUnlockedWithWrongPassword_exceptionIsThrown(){
        Diary myDiary = new Diary();
        myDiary.lockDiary("1234");
        assertThrows(InvalidPassword.class,()->myDiary.unlockDiary("3421"));
    }

//    @Test
//    public void testThatEntryCanBeCreatedInDiary(){
//        Diary myDiary = new Diary();
//        myDiary.lockDiary("1234");
//        myDiary.unlockDiary("1234");
//        myDiary.createEntry("Java","Java is fully OOP");
//
//    }



}
