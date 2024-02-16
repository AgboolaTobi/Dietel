package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\chapter15\\Example.txt")){

            byte[] fileByteShortened = fileInputStream.readNBytes(5);

            System.out.println(fileInputStream.skip(-5)); // this is to return the cursor back the same number of times.


            System.out.println(new String(fileByteShortened));
            byte[] fileByte = fileInputStream.readAllBytes();

            System.out.println(new String(fileByte));
            System.out.println(fileInputStream.getFD());

        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
