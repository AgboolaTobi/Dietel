package Dietelchapter3;

public class AccountMainTest {
    public static void main(String[] args){
        Account myAccount1 = new Account("Agboola Tobi Samuel",5000.00);
        Account myAccount2 = new Account("Mrs Agboola",70000 );
        System.out.println("Balance before deposit is made: " + myAccount1.checkBalance());
        System.out.println("Balance before deposit is made: " + myAccount2.checkBalance());
        myAccount1.deposit(5000);
        myAccount2.deposit(1000);
        System.out.println("Balance after deposit is made: " + myAccount1.checkBalance());
        System.out.println("Balance after deposit is made: " + myAccount2.checkBalance());

        myAccount1.withdraw(500);
        myAccount2.withdraw(-1000);
        System.out.println(myAccount1.getName() + "'s balance after withdrawal : " + myAccount1.checkBalance());
        System.out.println(myAccount2.getName() + "'s balance after withdrawal : "+ myAccount2.checkBalance());

    }
}
