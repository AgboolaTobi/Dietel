package chapter15;

import chapter15.bank.Transaction;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example8 {

    public static void main(String[] args) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)){
            Transaction transaction = new Transaction("tobi", "Samuel","5000");
            objectOutputStream.writeObject(transaction);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
