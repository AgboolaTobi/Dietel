package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class SelfExample {
    public static void main(String[] args) {


        String location = "C:\\Users\\Dell\\Desktop\\MyExample.txt";

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(location)) {
            String data = "Semicolon Africa is a tech school.";
            byte[] bytesFormOFTheData = data.getBytes();  // the reason we needed to convert the data to byte is because the write method takes bytes and not a string.
            fileOutputStream.write(bytesFormOFTheData);

        } catch (
                IOException exception) {
            exception.printStackTrace();
        }

    }
}
