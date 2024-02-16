package BankPracticeTests;

import BankPractice.Account;
import BankPractice.AccountNotFoundException;
import BankPractice.Bank;
import BankPractice.InvalidWithdrawalAmount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    public void testThatBankHasAName() {
        Bank bank = new Bank();
        bank.bankName("Semicolon Bank");
        assertEquals("Semicolon Bank",bank.checkBankName());
    }
    @Test
    public void testThatBankHaveAccounts(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("Agboola","Tobi","pin");
        assertEquals(1,bank.getNumberOfAccounts());
        assertEquals(account1.getAccountNumber(),"1");
    }
    @Test
    public void  testThatMultipleAccountCanExistInBankAndCanBeFoundBtAccountNumber(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("Agboola","Tobi","pin");
        Account account2 = bank.createAccountFor("accountName","accountNumber","pin");
        assertEquals(account1,bank.findAccount("1"));
        assertEquals(account2,bank.findAccount("2"));

    }

    @Test
    public void testThatBankCanDepositIntoAccount(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("firstName","lastName","pin");
        bank.deposit("1",2000);
        assertEquals(account1.checkBalance("pin"),2000);
    }

    @Test
    public void testThatBankCanDepositIntoMultipleAccounts(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("firstName","lastName","pin");
        Account account2 = bank.createAccountFor("accountName","accountNumber","pin");
        bank.deposit("1",2000);
        bank.deposit("2",3000);
        assertEquals(account1.checkBalance("pin"),2000);
        assertEquals(account2.checkBalance("pin"),3000);
    }

    @Test
    public void testThatWithdrawalCanBeMadeFromAccount(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("agboola","tobi","pin");
        //Account account2 = bank.createAccountFor("agboola","tobi","pin");
        bank.deposit("1",5000);
        bank.withdraw(String.valueOf(Integer.parseInt("1")),3000,"pin");
        assertEquals(2000,account1.checkBalance("pin"));
    }

    @Test
    public void testThatWithdrawalCanBeMadeFromMultipleAccounts(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("tobi","samuel","pin");
        Account account2 = bank.createAccountFor("agboola","tobi","pin");
        bank.deposit("1",2000);
        bank.deposit("2",5000);
        bank.withdraw(("1"),1000,"pin");
        bank.withdraw(("2"),3000,"pin");
        assertEquals(1000,account1.checkBalance("pin"));
        assertEquals(2000,account2.checkBalance("pin"));
    }
    @Test
    public void testThatWhenAmountToBeWithdrawnIsGreaterThanBalance_exceptionIsThrown(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("agboola","tobi","pin");
        bank.deposit("1",5000);
        assertThrows(InvalidWithdrawalAmount.class,()->bank.withdraw(("1"),7000,"pin"));
        assertEquals(5000,account1.checkBalance("pin"));
    }

    @Test
    public void testThatTransferCanBeMadeFromAccount1ToAccount2(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("tobi","samuel","pin");
        Account account2 = bank.createAccountFor("agboola","tobi","pin");
        bank.deposit("1",7000);
        bank.deposit("2",1000);
        assertEquals(7000,account1.checkBalance("pin"));
        assertEquals(1000,account2.checkBalance("pin"));
        bank.transfer("1","2",2000,"pin");
        assertEquals(5000,account1.checkBalance("pin"));
        assertEquals(3000,account2.checkBalance("pin"));
    }

    @Test
    public void testThatTransferCanBeMadeFromAccount2ToAccount1(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("firstName","lastName","pin");
        Account account2 = bank.createAccountFor("firstName","lastName","pin");
        bank.deposit("1",2000);
        bank.deposit("2",9000);
        assertEquals(2000,account1.checkBalance("pin"));
        assertEquals(9000,account2.checkBalance("pin"));
        bank.transfer("2","1",5000,"pin");
        assertEquals(7000,account1.checkBalance("pin"));
        assertEquals(4000,account2.checkBalance("pin"));
    }

    @Test
    public void testThatForATransferAmountThatIsLessThanBalance_exceptionIsThrown(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("firstName","lastName","pin");
        Account account2 = bank.createAccountFor("firstName","lastName","pin");
        bank.deposit("1",2000);
        bank.deposit("2",5000);
        assertEquals(2000,account1.checkBalance("pin"));
        assertEquals(5000,account2.checkBalance("pin"));

        assertThrows(InvalidWithdrawalAmount.class,()->bank.transfer("1","2",4000,"pin"));
        assertEquals(2000,account1.checkBalance("pin"));
    }

    @Test
    public void testThatBankCanCloseAccount(){
        Bank bank = new Bank();
        Account account1 = bank.createAccountFor("firstName","lastName","pin");
        Account account2 = bank.createAccountFor("firstName","lastName","pin");
        Account account3 = bank.createAccountFor("firstName","lastName","pin");
        bank.closeAccount(String.valueOf(account1));
        bank.closeAccount(String.valueOf(account3));
        assertEquals(account2,bank.findAccount("2"));

        assertThrows(AccountNotFoundException.class,()-> bank.findAccount("1"));
        assertThrows(AccountNotFoundException.class,()-> bank.findAccount("3"));
        bank.deposit("2",5000);
        assertEquals(5000,account2.checkBalance("pin"));

    }
}