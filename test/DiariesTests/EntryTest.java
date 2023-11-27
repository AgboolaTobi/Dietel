//package DiariesTests;
//
//import Diaries.*;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class EntryTest {
//   @Test
//    public void testThatHasEntryId(){
//       Entry entry = new Entry();
//       entry.entryId(1);
//       assertEquals(1,entry.checkId(1));
//    }
//    @Test
//    public void testThatForInvalidEntryId_throwsException(){
//        Entry entry = new Entry();
//        entry.entryId(1);
//        assertThrows(InvalidId.class,()-> entry.checkId(0));
//    }
//    @Test
//    public void testThatEntryHasTitle(){
//        Entry entry = new Entry();
//        entry.entryTitle("Java");
//        assertEquals("Java",entry.checkTitle("Java"));
//    }
//
//    @Test
//    public void testThatIncorrectTitle_throwsException(){
//        Entry entry = new Entry();
//        entry.entryTitle("Java");
//        assertThrows(InvalidTitle.class,()->entry.checkTitle("Jav"));
//    }
//
//    @Test
//    public void testThatEntryHasBody(){
//        Entry entry = new Entry();
//        entry.entryBody("Java is an object-oriented programming language");
//        assertEquals("Java is an object-oriented programming language",entry.checkBody("Java is an object-oriented programming language"));
//    }
//    @Test
//    public void testThatForInvalidEntryBody_exceptionIsThrown(){
//        Entry entry = new Entry();
//        entry.entryBody("Java is fully OOP");
//        assertThrows(InvalidBody.class,()->entry.checkBody("Java is not fully OOP"));
//    }
//    @Test
//    public void testThatEntryHasDateCreated(){
//        Entry entry = new Entry();
//        entry.dateCreated();
//        assertTrue(entry.dateCreated());
//    }
//
//
//}