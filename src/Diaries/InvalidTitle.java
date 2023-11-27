package Diaries;

public class InvalidTitle extends RuntimeException{
    public InvalidTitle(String message) {
        super(message);
    }
}
