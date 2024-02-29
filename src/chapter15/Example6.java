package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example6 {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\chapter15\\Example6File.txt";
        String error = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\chapter15\\Error.txt";
        try (PrintStream outputStream = new PrintStream(new FileOutputStream(location))){

            System.setOut(outputStream);
            outputStream.println("""
                     [i carry your heart with me(i carry it in]
                    By E. E. Cummings
                    i carry your heart with me(i carry it in
                    my heart)i am never without it(anywhere
                    i go you go,my dear;and whatever is done
                    by only me is your doing,my darling)
                                                                          
                   i fear no fate(for you are my fate,my sweet)
                   i want no world(for beautiful you are my world,my true)
                    and it’s you are whatever a moon has always meant
                    and whatever a sun will always sing is you
                                        
                    here is the deepest secret nobody knows
                    (here is the root of the root and the bud of the bud
                    and the sky of the sky of a tree called life;which grows
                    higher than soul can hope or mind can hide)
                    and this is the wonder that's keeping the stars apart
                                        
                    i carry your heart(i carry it in my heart)
                    """);

        }
        catch (IOException exception){
            System.err.println("Error");
            PrintStream errorStream = new PrintStream(new FileOutputStream(error));
            System.setErr(errorStream);
            errorStream.println(exception.getMessage());
        }
    }
}
