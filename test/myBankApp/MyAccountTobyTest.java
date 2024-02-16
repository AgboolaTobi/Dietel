package myBankApp;


import BankPractice.InvalidWithdrawalAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyAccountTobyTest {
    @Test
    public void testThatNameExists(){
        MyAccountToby myAccountToby = new MyAccountToby("Agboola Tobi Samuel","0113266576","pin");
        myAccountToby.createAccountName("Agboola Tobi Samuel");
        assertEquals("Agboola Tobi Samuel",myAccountToby.checkAccountName("Agboola Tobi Samuel"));
    }
    @Test
    public void testThatWithWrongAccountName_exceptionIsThrown(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.createAccountName("Agboola Tobi Samuel");
        assertThrows(InvalidAccountNameException.class,()->myAccountToby.checkAccountName("Agboola Tobi Samuel"));
    }
    @Test
    public void testForCorrectAccountName(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.createAccountNumber("0113266576");
        assertEquals("0113266576",myAccountToby.checkAccountNumber("0113266576"));
    }
    @Test
    public void testThatWithTheWrongAccountNumber_exceptionIsThrown(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.createAccountNumber("0113266576");
        assertThrows(InvalidAccountNumber.class,()->myAccountToby.checkAccountNumber("011326687"));
    }


    @Test
    public void testThatAccountCanBeDepositedInto(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.depositMoney(2000);
        assertEquals(2000,myAccountToby.checkBalanceT("pin"));
    }

    @Test
    public void testThatForNegativeDepositAmount_exceptionIsThrown(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        assertThrows(InvalidAmount.class,()->myAccountToby.depositMoney(-2000));
    }

    @Test
    public void testThatIfAccountBalanceIsToBeCheckedWithAWrongPin_exceptionIsThrown(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        assertThrows(InvalidAccountPin.class,()->myAccountToby.checkBalanceT("pins"));
    }
    @Test
    public void testThatIfAccountBalanceIsToBeCheckedWithTheWrongPin_exceptionIsThrown(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.depositMoney(2000);
        assertEquals(2000,myAccountToby.checkBalanceT("pin"));
    }

    @Test
    public void testThatAccountCanBeWithdrawnFrom(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.depositMoney(2000);
        myAccountToby.withdraw(1000,"pin");
        assertEquals(1000,myAccountToby.checkBalanceT("pin"));
    }

    @Test
    public void testThatAccountCannotBeWithdrawnFromWithTheWrongPin(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.depositMoney(2000);
        myAccountToby.withdraw(1000,"pin");
        assertThrows(InvalidAccountPin.class,()->myAccountToby.checkBalanceT("pins"));
    }

    @Test
    public void testThatAWithdrawalAmountGreaterThanBalance_throwsException(){
        MyAccountToby myAccountToby = new MyAccountToby("account name","0113266576","pin");
        myAccountToby.depositMoney(4000);
        assertThrows(InvalidWithdrawalAmount.class,()->myAccountToby.withdraw(5000,"pin"));
    }

}
