//package ObjectsPackage.Shopping;
//
//import ObjectsPackage.InvalidAmount;
//import ObjectsPackage.InvalidWithdrawalAmount;
//
//public class Account {
//    private final String pin;
//    private  int balance;
//    private String accountNumber;
//    private int deposit;
//
//    public Account(String number, String name, String pin) {
//        this.pin =  pin;
//        this.accountNumber = number;
//    }
//    public void deposit(int amount) {
//        validateAmount(amount);
//        balance = balance + amount;
//    }
//    public int checkBalance(String pin){
//        validatePin(pin);
//        return balance;
//    }
//    private void validatePin(String pin){
//        if (pin != this.pin) throw new InvalidPin("Incorrect Pin");
//    }
//    public void withdraw(int amount, String pin) {
//        validatePin(pin);
//        validateAmount(amount);
//        validateInsufficientFund(amount);
//        balance = balance - amount;
//    }
//    private void validateInsufficientFund(int amount) {
//        if (amount > balance) throw new InvalidWithdrawalAmount("insufficient balance");
//    }
//    private void validateAmount(int amount){
//        if (amount < 0) throw new InvalidAmount("Invalid Amount");
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//}
