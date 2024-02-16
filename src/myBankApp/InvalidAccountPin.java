package myBankApp;

public class InvalidAccountPin extends RuntimeException{

    public InvalidAccountPin(String message) {
        super(message);
    }
}
