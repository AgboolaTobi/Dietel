package tdd;
import org.junit.jupiter.api.Test;

import static mrChibuzo.ArrayFunctions.ArraySnacks.palindrome;

import static org.junit.jupiter.api.Assertions.*;

class palindromeTest {
@Test
    public void testPalindrome(){
    String str = "Abba";
    str = str.toLowerCase();
    boolean A = palindrome(str);
    assertTrue(palindrome(str));

}


}