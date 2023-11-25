package DiariesTests;

import Diaries.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    @Test
    public void testDiaryCanBeCreated(){
        Diary myDiary = new Diary();
        assertTrue(myDiary.isLocked());

    }

    @Test
    public void testThatDiaryCanBeUnlocked(){
        Diary myDiary = new Diary();
        assertTrue(myDiary.isLocked());
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeLocked(){
        Diary myDiary = new Diary();
        assertTrue(myDiary.isLocked());
        assertFalse(myDiary.isLocked());
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeUnlockedWithPassword(){
        Diary myDiary = new Diary();
        myDiary.unLockDiary("1234");
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCannotBeUnlockedWithIncorrectPassword(){
        Diary myDiary = new Diary();
        myDiary.unLockDiary("4321");
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatAnEntryCanBeCreatedInDiary(){
        Diary myDiary = new Diary();
        myDiary.createEntry("Java","Hello World !");
        assertEquals(1,myDiary.findEntry(1));
    }

    @Test
    public void testThatMultipleEntriesCanBeCreatedInDiary(){
        Diary myDiary = new Diary();
        myDiary.createEntry("Java","Java is purely an object-oriented programming language.");
        myDiary.createEntry("Python","Python is a function language.");
//        assertEquals(,myDiary.findEntry(2));
    }
}
