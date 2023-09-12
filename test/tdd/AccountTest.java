package tdd;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    public void depositTest(){
        // given
        Account tobyAccount = new Account();
        //when
        tobyAccount.deposit(5000);
        //check
        int balance = tobyAccount.checkBalance();
        assertEquals( 5000, balance);

    }
@Test

    public void depositTwice(){
        //given
        Account tobyAccount = new Account();
        //when
       tobyAccount.deposit(5000);
       //check
       int balance = tobyAccount.checkBalance();
       assertEquals(5000, balance);
       //when

       tobyAccount.deposit(2000);
       //check

       int newBalance = tobyAccount.checkBalance();
       assertEquals(7000, newBalance);

        tobyAccount.deposit(3000);

        int newBalance2 = tobyAccount.checkBalance();
        assertEquals(10000, newBalance2);

        tobyAccount.withdraw(1000);
        int balance3 = tobyAccount.checkBalance();
        assertEquals(9000,balance3);
    }


    @Test
    public void depositAgain(){



    }



}