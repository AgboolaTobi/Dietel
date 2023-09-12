package classExercises;

public class AccountOne{

    private int balance;

    public void deposit(int amount){
        if( amount > 0 ){
        balance = balance + amount;
        }
        if(amount < 0) {
            balance = balance;
        }

    }
    public void withdraw(int money) {

        if ((balance > money) & (money >= 0)) {
            balance = balance - money;
        } else if (money > balance) {
            System.out.println("Insufficient fund");
        }

    }
        public int checkBalance () {
            return balance;

        }
    }
