package Assignment1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CreditCardMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String cardNumber = input.nextLine();
        String cardType =  CreditCard.cardType(cardNumber);
        String validity = CreditCard.validity(cardNumber);
        System.out.printf("""
                **********************************
                **Credit Card Type: %s
                **Credit Card Number: %s
                **Credit Card Digit Length: %d
                **Credit Card Validity Status: %s
                **********************************
                """, cardType, cardNumber, cardNumber.length(),validity);
    }
}
