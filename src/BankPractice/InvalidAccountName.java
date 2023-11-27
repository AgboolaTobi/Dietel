package BankPractice;

public class InvalidAccountName extends RuntimeException{
    public InvalidAccountName(String message) {
        super(message);
    }
}
