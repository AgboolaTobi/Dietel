package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {
    public static void main(String[] args) {

        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\classExercises";

        Path path = Path.of(location);
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.close();
        }
        catch (IOException exception){

        }



    }
}
