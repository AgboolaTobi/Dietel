package Streams;

import java.util.List;


public class StreamsFlatMapSample {


    public static void main(String[] args) {
        // a list of strings is also a collection because a string is a collection of characters

        List<String> phrases = List.of(
                "1asq","qewr90","bsmfhj56","hhffhfhf7hreyss"
        );

        var result =
        phrases.stream()
                .flatMap((phrase)-> phrase.chars().boxed())
                .filter(c-> c >= 48 && c <= 57)
                .count();

        // the flatMap line of code converts the characters into their ascii code and puts them in an int stream
        System.out.println(result);
    }
}
