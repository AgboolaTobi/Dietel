package tdd;
import Assignment1.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {

    @Test
    public void testForTheCreditCardType(){
        String cardNumber = "4388576018402626";
        String cardType = CreditCard.cardType(cardNumber);
        String answer = "Visa Cards";
        assertEquals(answer, cardType);
    }
    @Test
    public void testForCardCardType2(){
        String cardNumber = "3764827292729";
        String cardType = CreditCard.cardType(cardNumber);
        assertEquals(cardType, "American Express Cards");
    }
    @Test
    public void testForTheCardValidity(){
        String cardNumber = "4388576018402626";
        String validation = CreditCard.validity(cardNumber);
        assertEquals(validation, "Invalid");
    }
    @Test
    public void testForTheValidity2(){
        String cardNumber = "539831619690403";
        String cardType = CreditCard.cardType(cardNumber);
        assertEquals(cardType, "Master Card");
        String validity = CreditCard.validity(cardNumber);
        assertEquals(validity, "Valid");
    }
}
