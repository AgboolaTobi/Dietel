package myBankApp;

public class InvalidAmount extends RuntimeException{
    public InvalidAmount(String message) {
        super(message);
    }
}
