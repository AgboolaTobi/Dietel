package Streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamUsingGenerateSample {
    public static void main(String[] args) {


        //you can also use the generate method in streams. The elements in the collection that the generate method create is infinite i.e without end. unlike a predefined source that would have a definite number of elements

        Stream.generate(()-> new Random().nextInt())
                .limit(5)
                .forEach(number-> System.out.println(number)); //the suggestion to use method reference is because we.re passing the same as
    }
}
