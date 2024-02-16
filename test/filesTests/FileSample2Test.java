package filesTests;

import chapter14.FileSample2;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileSample2Test {


    @Test
    public void testCreateFile(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\files";
        String fileName = "example.txt";

        FileSample2.createFile(location, fileName);

        Path path = Paths.get(location, fileName); // C:a\b\c.sample.txt


        assertTrue(Files.exists(path));
    }

    @Test

    public  void testCreateFileDirectory(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\toby";

        FileSample2.createDirectory(location);

        Path path = Path.of(location);

        assertTrue(Files.exists(path));
    }

    @Test
    public void testDeleteDirectory(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\toby";

        FileSample2.deleteDirectory(location);

        Path path = Paths.get(location);

        assertFalse(Files.exists(path));


    }

    @Test
    public void testDeleteFile(){
        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\file";
        String fileName = "example.txt";
        FileSample2.deleteFile(location, fileName);

        Path path = Paths.get(location,fileName);

        assertFalse(Files.exists(path));


    }

}