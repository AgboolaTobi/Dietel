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
        if (!this.pin.equals(pin)) throw new InvalidPin("Pin provided is invalid. Kindly check and try again");
    }

    public void withdraw(int amount,String pin) {
        validateWithdrawal(amount);
        validateWithdrawalAmount(amount);
        validatePin(pin);
        balance-= amount;

    }

    private void validateWithdrawalAmount(int amount) {
        if (amount > balance) throw new InvalidWithdrawalAmount("Insufficient funds...");
    }

    private void validateWithdrawal(int amount) {
        if (amount < 0) throw  new InvalidWithdrawalAmount("Invalid Withdrawal Amount. Don't stress me ooo....");
    }

    public void checkAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String accountName(String accountName) {
        validateAccountName(accountName);
        return accountName;
    }

    private void validateAccountName(String accountName) {
        if (!this.accountName.equals(accountName)) throw  new InvalidAccountName("Incorrect account name.Kindly check and try again");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String collectAccountDetails(String accountName, String pin) {
        validatePin(pin);
        validateAccountName(accountName);
        return accountNumber;
    }
    public String toString(){
        return String.format("""
                ========================
                Account successfully created. Here are your account details
                Account name: %s
                Account Number: %s
                Account balance: %s
                Account pin: Your pin is active
                ========================
                """, accountName, accountNumber, balance);
    }


}