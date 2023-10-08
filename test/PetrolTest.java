import Dietelchapter3.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolTest {

    @Test
    public void testThatPetrolHasLocation(){
        PetrolPurchase myPetrol = new PetrolPurchase();
        myPetrol.setLocation("Sabo");
        assertEquals("Sabo",myPetrol.getLocation());
    }
    @Test
    public void testPriceOfPetrol(){
        PetrolPurchase myPetrol = new PetrolPurchase();
        myPetrol.setPrice(-3000);
        assertEquals(0,myPetrol.getPrice());
    }
    @Test
    public void testDiscount(){
        PetrolPurchase myPetrolDiscount = new PetrolPurchase();
        myPetrolDiscount.setDiscount(3500);
        assertEquals(3500,myPetrolDiscount.getDiscount());
    }

    @Test
    public void testNegativeDiscount(){
        PetrolPurchase checkDiscount = new PetrolPurchase();
        checkDiscount.setDiscount(-500);
        assertEquals(0,checkDiscount.getDiscount());
    }

    @Test
    public void testThatDiscountCannotBeMoreThanPrice(){
        PetrolPurchase checkDiscount = new PetrolPurchase();
        checkDiscount.setPrice(2500);
        checkDiscount.setDiscount(2000);
        assertEquals(0,checkDiscount.getDiscount());
    }
    @Test
    public void testPetrolType(){
        PetrolPurchase petrolType = new PetrolPurchase();
        petrolType.setType_of_petrol("Kerosene");
        assertEquals("Kerosene",petrolType.getType_of_petrol());
    }


}
