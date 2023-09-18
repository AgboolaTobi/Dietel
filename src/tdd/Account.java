 package tdd;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if (amount > 0)
            this.balance = balance + amount;
    }

    public int checkBalance() {
        return balance ;

    }

    public void withdraw(int amount) {
        if(amount < balance && amount > 0) {
            balance = balance - amount;
         }else if (amount > balance) {
            amount = balance;
        }
    }

}
