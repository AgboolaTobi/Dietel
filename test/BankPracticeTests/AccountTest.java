package BankPracticeTests;

import BankPractice.Account;
import BankPractice.InvalidDepositAmount;
import BankPractice.InvalidPin;
import BankPractice.InvalidWithdrawalAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testThatDepositCanBeMadeIntoAccount(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        assertThrows(InvalidPin.class,()->account.checkBalance("0000"));
    }
    @Test
    public void testThatBalanceCannotBeCheckedWithAWrongPin(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(1_000);
        assertEquals(1_000,account.checkBalance("1234"));
    }
    @Test
    public void testThatDepositCanBeMadeIntoAccountMultipleTimes(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000,account.checkBalance("1234"));
    }

    @Test
    public void testThatNegativeAmountCannotBeDeposited_exceptionIsThrown(){

        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        assertThrows(InvalidDepositAmount.class,()-> account.deposit(-1000));
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("1234"));
    }
//    @Test
//    public void testThatWithdrawalCanBeMade(){
//        Account account = new Account("Agboola Tobi", "0113266567", "1234");
//        account.deposit(1000);
//        account.deposit(1000);
//        account.deposit(1000);
//        assertEquals(3000,account.checkBalance("1234"));
//        account.withdraw(1000,"1234");
//        assertEquals(2000,account.checkBalance("1234"));
//    }

    @Test
    public  void testIfWithdrawalIsAttemptedWithTheWrongPin_exceptionIsThrown(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(3000);
        assertEquals(3000,account.checkBalance("1234"));
        account.withdraw(2000,"0000");
        assertEquals(3000,account.checkBalance("1234"));
    }

    @Test
    public void testThatWithdrawalCanBeMadeMultipleTimes(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(1000);
        account.deposit(1000);
        account.deposit(1000);
        account.deposit(2000);
        assertEquals(5000,account.checkBalance("1234"));
        account.withdraw(1000,"1234");
        account.withdraw(1000,"1234");
        assertEquals(3000,account.checkBalance("1234"));
    }

    @Test

    public void testWhenNegativeWithdrawalAmount_throwsException(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(1000);
        account.deposit(2000);
        assertEquals(3000,account.checkBalance("1234"));
        assertThrows(InvalidWithdrawalAmount.class,()->account.withdraw(-1000,"1234"));
        assertEquals(3000,account.checkBalance("1234"));
    }
    @Test
    public void testThatWithdrawalAmountCannotBeMoreThanBalance(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");

        assertThrows(InvalidWithdrawalAmount.class,()->account.withdraw(5000,"1234"));
    }

    @Test
    public void testThatBalanceWillBeUnchangedIfWithdrawalIsMoreThanBalance(){
        Account account = new Account("Agboola Tobi", "0113266567", "1234");
        account.deposit(5000);
        account.withdraw(2000,"1234");
        assertEquals(3000,account.checkBalance("1234"));
    }
}