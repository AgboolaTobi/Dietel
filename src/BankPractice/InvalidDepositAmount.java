package BankPractice;

public class InvalidDepositAmount extends RuntimeException{
    public InvalidDepositAmount(String message) {
        super(message);
    }
}
