package myBankApp;


import BankPractice.InvalidWithdrawalAmount;

public class MyAccountToby {
    private  String accountName;
    private String accountNumber;
    private int balance;
    private String pin;

    public MyAccountToby(String accountName, String accountNumber, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void depositMoney(int amount) {
        validateAmount(amount);
        this.balance += amount;

    }

    private void validateAmount(int amount) {
        if (amount < 0) throw new InvalidAmount("The amount you're trying to deposit cannot be deposited. Maybe you should buy gun");
    }

    public int checkBalanceT(String pin) {
        validateThisPin(pin);
        return balance;
    }

    private void validateThisPin(String pin) {
        if (!this.pin.equals(pin)) throw new InvalidAccountPin("Provided pin is invalid.Kindly check and try again...");
    }

    public void createAccountNumber(String number) {
        this.accountNumber = accountNumber;
    }

    public String checkAccountNumber(String accountNumber) {
        validateAccountNumber(accountNumber);
        return accountNumber;
    }

    private void validateAccountNumber(String accountNumber) {
        if (!this.accountNumber.equals(accountNumber)) throw new InvalidAccountNumber("Account number cannot be found. Kindly check and try again");
    }

    public void createAccountName(String agboolaTobiSamuel) {
        this.accountName = accountName;
    }

    public String checkAccountName(String accountName) {
        validateAccountName(accountName);
        return accountName;
    }

    private void validateAccountName(String accountName) {
        if (!this.accountName.equals(accountName)) throw new InvalidAccountNameException("Account name not found. Kindly check and try again");
    }

    public void withdraw(int amount, String pin) {

        validateThisPin(pin);
        validateAmountToWithdraw(amount);
        balance-= amount;
    }

    private void validateAmountToWithdraw(int amount) {
        if (balance < amount) throw new InvalidWithdrawalAmount("Insufficient funds. Kindly fund your account and try again or withdraw a lower amount.");
    }
}
