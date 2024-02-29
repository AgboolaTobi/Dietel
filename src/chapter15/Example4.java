package chapter15;

import java.io.*;
import java.util.Scanner;

//    PrintStream outputStream = System.out;
//    PrintStream printError = System.err;


public class Example4 {

    public static void main(String[] args) throws IOException {

        String location ="C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\chapter15\\bank\\Transaction.txt";
        InputStream inputStream = new FileInputStream(location);

        Scanner scanner = new Scanner(inputStream);
        System.out.println(scanner.nextLine());

    }


}
