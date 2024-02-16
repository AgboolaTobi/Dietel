package chapter15.bank;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\Dell\\Documents\\StarOfTriangle.java";

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(location))){

            byte[] bytes = dataInputStream.readAllBytes();
            System.out.println(new String(bytes));
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
