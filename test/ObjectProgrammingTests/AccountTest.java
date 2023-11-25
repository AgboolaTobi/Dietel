//package ObjectProgrammingTests;
//
//import ObjectsPackage.InvalidAmount;
//import ObjectsPackage.InvalidWithdrawalAmount;
//import ObjectsPackage.Shopping.Account;
//import ObjectsPackage.Shopping.InvalidPin;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AccountTest {
//    Account account;
//    @BeforeEach
//    void setAccount(){
//        account = new Account("123456789","Agboola Tobi Samuel", "1111");
//    }
//    @Test
//    public void testThatAccountExists(){
//        assertNotNull(account);
//    }
//
//    @Test
//    public void testThatDepositCanBeMade(){
//        account.deposit(1000);
//        assertEquals(1000,account.checkBalance("1111"));
//    }
//    @Test
//    public void checkBalanceWithWrongPin_throwExceptionTest(){
//        assertThrows(InvalidPin.class, () ->account.checkBalance("0000"));
//    }
//
//    @Test
//    public void testThatWithdrawalCanBeMade(){
//        account.deposit(2000);
//        assertEquals(2000,account.checkBalance("1111"));
//        account.withdraw(1000, "1111");
//        assertEquals(1000,account.checkBalance("1111"));
//    }
//    @Test
//    public void negativeAmount_throwExceptionTest(){
//        assertThrows(InvalidAmount.class, () ->account.deposit(-1000));
//    }
//    @Test
//    public void testForWithdrawOfAmountLessThanZero(){
//        account.deposit(5000);
//       assertThrows(InvalidAmount.class, () -> account.withdraw(-1000, "1111"));
//    } @Test
//    public void testForWithdrawOfAmountGreaterThanBalance(){
//        account.deposit(5000);
//       assertThrows(InvalidWithdrawalAmount.class, () -> account.withdraw(6000, "1111"));
//    } @Test
//    public void testForWithdrawOfAmountWherePinIsAWrongPin(){
//        account.deposit(5000);
//       assertThrows(InvalidPin.class, () -> account.withdraw(1000, "0000"));
//    }
//}
