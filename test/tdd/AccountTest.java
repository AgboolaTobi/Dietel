package tdd;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    public void depositTestThatANegativeAmountCannotBeDeposited(){
        // given
        Account tobyAccount = new Account();
        //when
        tobyAccount.deposit(-5000);
        //check
        int balance = tobyAccount.checkBalance();
        assertEquals( 0, balance);

    }
@Test

    public void depositThatAPositiveAmountCanBeDeposited(){
        //given
        Account tobyAccount = new Account();
        //when
       tobyAccount.deposit(5000);
       //check
       int balance = tobyAccount.checkBalance();
       assertEquals(5000, balance);
    }


    @Test
    public void testThatAWithdrawalCanBeMAde(){
        Account thisAccount = new Account();
        thisAccount.deposit(9500);
        thisAccount.withdraw(-10000);
        int balance = thisAccount.checkBalance();
        assertEquals(9500, balance);
    }



}