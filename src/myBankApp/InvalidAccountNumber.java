package myBankApp;

public class InvalidAccountNumber extends RuntimeException{
    public InvalidAccountNumber(String message) {
        super(message);
    }
}
