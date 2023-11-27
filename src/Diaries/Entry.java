package Diaries;

public class Entry{

    private int id;
    private String title;
    private String body;

    public Entry(int id,String title,String body){

    }



    public void entryId(int id) {
        this.id = id;
    }


    public int checkId(int id) {
        validateId(id);
        return id;
    }
    private void validateId(int id) {
        if (this.id != id) throw new InvalidId("Entry ID is incorrect. Kindly check and try again");
    }

    public void entryTitle(String title) {
        this.title = title;
    }

    public String checkTitle(String title) {
        validateTitle(title);
        return title;
    }

    private void validateTitle(String title) {
        if (!this.title.equals(title)) throw new InvalidTitle("Entry title is incorrect> Kindly check and try again");
    }


    public void entryBody(String body) {
        this.body = body;
    }

    public String checkBody(String body) {
        validateBody(body);
        return body;
    }

    private void validateBody(String body) {
        if (!this.body.equals(body)) throw new InvalidBody("Entry body is incorrect> Kindly check and try again");
    }

    public boolean dateCreated() {
        return true;
    }

}
