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
        myDiary.unLockDiaryWithPassword("1234");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void testThatDiaryCanBeUnlockedWithPassword2(){
        Diary myDiary = new Diary();
        myDiary.unLockDiaryWithPassword("1234");
        assertEquals("1234",myDiary.checkPassword("1234"));
    }
    @Test
    public void testThatIfTheWrongPasswordIsUsed_exceptionIsThrown(){
        Diary myDiary = new Diary();
        myDiary.unLockDiaryWithPassword("1234");
        assertThrows(InvalidPassword.class,()-> myDiary.checkPassword("123"));
    }

    @Test
    public void testThatDiaryCannotBeUnlockedWithIncorrectPassword(){
        Diary myDiary = new Diary();
        myDiary.unLockDiaryWithPassword("4321");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void testThatEntryCanBeCreated(){
        Diary myDiary = new Diary();
        myDiary.createEntry("Java","Java is fully OOP");
        assertEquals("Java is fully OOP",myDiary.checkEntry());
    }


}
