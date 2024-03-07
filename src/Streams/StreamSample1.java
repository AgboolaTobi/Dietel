package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = numbers.stream();
        stream.filter((number)->number % 2 == 0) // these are intermediate operation
                .map((number)-> number * number) // these are intermediate operation
                .forEach(System.out::println); // this is the terminal point


        numbers.stream()                              // you'd usually see operations in streams done this way than
                // the other way round.
                .filter((number)->number % 2 == 0)
                .map((number)-> number * number)
                .forEach(System.out::println);


        // you can also see it done this way. i.e load already predefined methods directly into the stream

        Stream.of(1,2,3,4,5,6,7,8)
                .map((number)-> number * 2)
                .forEach(System.out::println);
    }
}
