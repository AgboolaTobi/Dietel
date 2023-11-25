//package ObjectProgrammingTests;
//
//import ObjectsPackage.Bank;
//import ObjectsPackage.InvalidAccount;
//import ObjectsPackage.Shopping.Account;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class BankTest {
//
//    @Test
//    public void testThatBankCanCreateAccountForOnePerson(){
//        Bank semicolonBank = new Bank();
//        Account account1 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        assertEquals(1, semicolonBank.getTotalAccount());
//        assertEquals("1", account1.getAccountNumber());
//    }
//    @Test
//    public void testThatCreateTwoAccountAndTheirAccountNumberIsOneAndTwo(){
//        Bank semicolonBank = new Bank();
//        Account account1 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        Account account2 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        assertEquals(2, semicolonBank.getTotalAccount());
//        assertEquals("1", account1.getAccountNumber());
//        assertEquals("2", account2.getAccountNumber());
//    }
//    @Test
//    public void testThatCreateTwoAccountAndFindTheirAccountWithThereAccountNumbers(){
//        Bank semicolonBank = new Bank();
//        Account account1 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        Account account2 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        assertEquals(2, semicolonBank.getTotalAccount());
//        assertEquals(account1, semicolonBank.findAccount("1"));
//        assertEquals(account2, semicolonBank.findAccount("2"));
//    }
//    @Test
//    public void testThatCreateTwoAccountAndFindTheirAccountIfAccountNumberWrongThrowException(){
//        Bank semicolonBank = new Bank();
//        Account account1 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        Account account2 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        assertEquals(2, semicolonBank.getTotalAccount());
//        assertThrows(InvalidAccount.class, () -> semicolonBank.findAccount("5"));
//        assertEquals(account2, semicolonBank.findAccount("2"));
//        assertEquals(account1, semicolonBank.findAccount("1"));
//    }
//    @Test
//    public void testThatBankCanMakeDepositIntoAccountOne(){
//      Bank  semicolonBank = new Bank();
//        Account account1 = semicolonBank.createAccountFor("FirstName", "SecondName", "pin");
//        assertEquals(1, semicolonBank.getTotalAccount());
//        account1.deposit(1_000);
//        assertEquals(1_000,semicolonBank.checkBalance("1111"));
//    }
//
//
//
//}
