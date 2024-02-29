package chapter15;

import chapter15.bank.Transaction;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example7 {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(System.out)){
            objectOutputStream.writeObject(new Transaction("Tobi","Ope","400"));

        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
