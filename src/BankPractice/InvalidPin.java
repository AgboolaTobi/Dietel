package BankPractice;

public class InvalidPin extends RuntimeException {
    public InvalidPin(String message){
        super(message);
    }
}
