package Diaries;

import java.util.List;

public class Diary {
    private String username;
    private boolean isLocked;
    private String password;
    private List entry;





    public boolean isLocked() {
        if (!isLocked) {
            isLocked = true;
        }
        else
        { isLocked = false;}
            return isLocked;
    }


    public void unLockDiary(String password) {
        isLocked();
        this.password = password;

    }


    public void createEntry(String entryTitle, String message ) {

    }

    public int findEntry(int entryIndex) {
        return entryIndex;
    }
}
