package Diaries;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private boolean isLocked;
    private String password;
    ArrayList<Entry> entries;
    private int sizeOfEntries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        entries = new ArrayList<>();
    }



    public boolean isLocked() {
        if (!isLocked) {
            isLocked = true;
        }
        else
        { isLocked = false;}
            return isLocked;
    }


    public void unLockDiaryWithPassword(String password) {
        isLocked();
        this.password = password;
        validatePassword(password);

    }

    private void validatePassword(String password) {
        if (!this.password.equals(password)) throw new InvalidPassword("Password is incorrect>Kindly check and try again");
    }


    public String checkPassword(String password) {
        validatePassword(password);
        return password;
    }

    public void createEntry(String title, String body) {
        isLocked();
        validatePassword(password);
        unLockDiaryWithPassword(password);
        Entry entry = new Entry(generateID(), title, body);
        entries.add(entry);
    }
    public int generateID() {
        return Integer.parseInt(22 + "" +sizeOfEntries);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }
    public void deleteEntry(int id) {
        entries.remove(findEntry(id));
    }

    public Entry findEntry(int id) {
        validateLock();
        for (Entry entry: entries){
            if(entry.getIDNumber() == id) return entry;
        }
        throw new CannotBeFound("Entry cannot be found");
    }

    public void updateEntry(int id, String title, String body){
        validateLock();
        Entry entry = findEntry(id);
        entry.edit(title, body);
        entries.set(findIndexOf(id), entry);
    }

    public int findIndexOf(int id) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getIDNumber() == id) return index;
        }
        throw new CannotBeFound("Entry cannot be found");
    }

    public String getUsername() {
        return username;
    }
}
