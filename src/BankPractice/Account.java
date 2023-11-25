package BankPractice;

public class Account {
    private final String pin;
    String accountName;
    String accountNumber;
    private int balance;

    public Account(String accountName, String accountNumber, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;

    }

    public void deposit(int amount) {
        validateDeposit(amount);
        balance = balance + amount;

    }
    private void validateDeposit(int amount) {
        if (amount < 0) throw new InvalidDepositAmount("Invalid Amount");
    }

    public int checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    private void validatePin(String pin){
        if (pin != this.pin) throw new InvalidPin("Pin provided is invalid. Kindly check and try again");
    }

    public void withdraw(int amount,String pin) {
        validateWithdrawal(amount);
        validateWithdrawalAmount(amount);
        balance-= amount;

    }

    private void validateWithdrawalAmount(int amount) {
        if (amount > balance) throw new InvalidWithdrawalAmount("Insufficient funds...");
    }

    private void validateWithdrawal(int amount) {
        if (amount < 0) throw  new InvalidWithdrawalAmount("Invalid Withdrawal Amount. Don't stress me ooo....");
    }
}
