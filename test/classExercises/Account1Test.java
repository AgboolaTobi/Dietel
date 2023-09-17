package classExercises;

import Dietelchapter3.AccountOne;

class Account1Test1{
    public static void main(String[] args) {

        AccountOne thisAccount = new AccountOne();
        thisAccount.deposit(5000);
        thisAccount.withdraw(12000);
        thisAccount.checkBalance();

        System.out.printf("Your account balance is %s", thisAccount.checkBalance());


    }
}