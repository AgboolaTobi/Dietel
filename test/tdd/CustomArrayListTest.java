package tdd;
import mrChibuzo.CustomArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    private CustomArrayList<String> customArrayList;

    @BeforeEach
    public void create(){

        customArrayList = new CustomArrayList<>();

    }

    @Test
    public void testThatArrayListIsEmpty(){

        assertTrue(customArrayList.emptyCheck());
    }

    @Test
    public void testThatMyCustomArrayListIsNotEmpty(){

        customArrayList.addElement("agboola");
        assertFalse(customArrayList.emptyCheck());
    }

    @Test
    public void testMyCustomArrayListEmptySize(){
        assertEquals(0,customArrayList.size());
    }

    @Test
    public void testArrayListSize(){

        customArrayList.addElement("Agboola Tobi");
        customArrayList.addElement("Agboola Tobi");
        customArrayList.addElement("Agboola Tobi");
        customArrayList.addElement("Agboola Tobi");

        assertEquals(4, customArrayList.size());
    }

    @Test
    public void testThatMyCustomArrayListCanTakeAsManyElements(){
        customArrayList.addElement("Agboola");
        customArrayList.addElement("Ojo Tobi");
        customArrayList.addElement("Vera");
        customArrayList.addElement("Dike");
        customArrayList.addElement("Arua");
        customArrayList.addElement("Sammy");
        customArrayList.addElement("Melody");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Joy");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Awoso");
        customArrayList.addElement("Dave");
        customArrayList.addElement("Divine");
        customArrayList.addElement("Oyinyechuku");
        customArrayList.addElement("Qudus");
        customArrayList.addElement("Phillip");
        customArrayList.addElement("Ismail");
        customArrayList.addElement("Israel");
        customArrayList.addElement("Nehemiah");
        customArrayList.addElement("Muyiwa");
        assertEquals(20,customArrayList.size());
    }

    @Test
    public void testRemoveMethod(){
        customArrayList.addElement("Dave");
        customArrayList.addElement("Agboola");
        customArrayList.addElement("Oyinyechuku");
        customArrayList.addElement("Qudus");
        customArrayList.addElement("Nehemiah");
        customArrayList.addElement("Muyiwa");

        assertEquals(5,customArrayList.remove("Muyiwa"));
        assertEquals(4,customArrayList.remove("Nehemiah"));
        assertEquals(4,customArrayList.size());
        assertEquals(3,customArrayList.remove("Oyinyechuku"));
        assertEquals(2,customArrayList.remove("Agboola"));
        assertEquals(1,customArrayList.remove("Dave"));
        assertEquals(0,customArrayList.remove("Qudus"));
        assertTrue(customArrayList.emptyCheck());

    }

    @Test
    public void testMyCustomArrayListMethods(){
        assertTrue(customArrayList.emptyCheck());
        assertEquals(0,customArrayList.size());
        customArrayList.addElement("Mr Chibuzo");
        assertEquals(1,customArrayList.size());
        customArrayList.addElement("Mr Evans");
        assertEquals(2,customArrayList.size());
        assertFalse(customArrayList.emptyCheck());
        customArrayList.remove("Mr Chibuzo");
        assertEquals(1,customArrayList.size());
        assertFalse(customArrayList.emptyCheck());
        customArrayList.remove("Mr Evans");
        assertTrue(customArrayList.emptyCheck());
    }

    @Test
    public void testGetMethod(){
        customArrayList.addElement("Mr Chibuzo");
        customArrayList.addElement("77");
        customArrayList.addElement("Mr Evans");
        customArrayList.addElement("Laraba");
        assertEquals("Mr Chibuzo",customArrayList.get(0));
        assertEquals("77",customArrayList.get(1));

    }

    @Test
    public void testCountOf(){
        customArrayList.addElement("Agboola");
        customArrayList.addElement("Ojo Tobi");
        customArrayList.addElement("Vera");
        customArrayList.addElement("Dike");
        customArrayList.addElement("Arua");
        customArrayList.addElement("Sammy");
        customArrayList.addElement("Melody");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Joy");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Awoso");
        customArrayList.addElement("Dave");
        customArrayList.addElement("Divine");
        customArrayList.addElement("Oyinyechuku");
        customArrayList.addElement("Qudus");
        customArrayList.addElement("Phillip");
        customArrayList.addElement("Ismail");

        assertEquals(2,customArrayList.countOf("Vera"));
        assertEquals(10,customArrayList.countOf("Awoso"));
        assertEquals(14,customArrayList.countOf("Qudus"));
        assertEquals(16,customArrayList.countOf("Ismail"));
        assertEquals(17,customArrayList.size());

    }

    @Test
    public void testToPickTheLastCount(){
        customArrayList.addElement("Divine");
        customArrayList.addElement("Oyinyechuku");
        customArrayList.addElement("Qudus");
        customArrayList.addElement("Phillip");
        customArrayList.addElement("Ismail");
        assertEquals(4,customArrayList.lastCountOf("Ismail"));
    }

    @Test
    public void testThatElementIsFoundIn(){
        customArrayList.addElement("Agboola");
        customArrayList.addElement("SemiColonAfrica");
        assertTrue(customArrayList.isFoundIn("SemiColonAfrica"));

    }

    @Test

    public void testConvertToArray(){
        CustomArrayList<Integer> converted = new CustomArrayList<>();
        converted.addElement(1);
        converted.addElement(2);
        converted.addElement(-3);
        converted.addElement(4);
        Object[] result = {1,2,-3,4};
        assertArrayEquals(result,converted.toArray());
    }


    @Test
    public void testTheClearMethod(){
        assertTrue(customArrayList.emptyCheck());
        customArrayList.addElement("Vera");
        customArrayList.addElement("Dike");
        customArrayList.addElement("Arua");
        customArrayList.addElement("Sammy");
        customArrayList.addElement("Melody");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Joy");
        customArrayList.addElement("Delighted");
        customArrayList.addElement("Awoso");
        customArrayList.addElement("Dave");
        customArrayList.addElement("Divine");
        assertFalse(customArrayList.emptyCheck());
        customArrayList.clear();
        assertEquals(0,customArrayList.size());

    }

}