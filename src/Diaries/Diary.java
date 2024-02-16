package Diaries;

public class Diary {
    private boolean isLocked = true;
    private String password;


    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {

        this.password = password;
        validatePassword(password);
        isLocked = false;
    }

    private void validatePassword(String password) {
        if (!this.password.equals(password)) throw new InvalidPassword("Incorrect password. Kindly check and try again");
    }

    public void lockDiary(String password) {
        validatePassword(password);
        this.password = password;

    }
}
