package chapter15.bank;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example9 {
    public static void main(String[] args) {
        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)){
            User user = new User("tobi", "5000");
            objectOutputStream.writeObject(user);
        }
        catch (
                IOException exception){
            exception.printStackTrace();
//            System.err.println(exception.getMessage());
        }
    }

}
