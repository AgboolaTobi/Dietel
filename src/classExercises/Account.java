package classExercises;

public class Account {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdrawal(int cash){
        balance = balance - cash;
    }
    public int checkBalance(){
        return balance;
    }
}
