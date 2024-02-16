package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample2 {

    // Files, Path, Paths, DirectoryStreams

    public static void createFile(String location, String fileName) {
        Path path = Path.of(location,fileName);
        try {
            Files.createFile(path);

            // IOException, FileNotFoundException, SecurityException
        }catch (IOException exception){
            System.err.println(exception.getMessage());

        }


    }

    public static void createDirectory(String location) {

        Path path = Path.of(location);

        try {
            Files.createDirectory(path);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void deleteDirectory(String location) {
        Path path = Path.of(location);

        try {
            Files.delete(path);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void deleteFile(String location,String fileName) {
        Path path = Paths.get(location,fileName);

        try {
            Files.delete(path);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
