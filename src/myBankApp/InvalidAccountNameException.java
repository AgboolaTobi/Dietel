package myBankApp;

public class InvalidAccountNameException extends RuntimeException{

    public InvalidAccountNameException(String message) {
        super(message);
    }
}
