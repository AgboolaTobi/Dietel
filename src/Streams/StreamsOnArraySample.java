package Streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.System.out;

public class StreamsOnArraySample {
    public static void main(String[] args) {
        //you can also perform stream operations on arrays
        Integer[] nums = {1,2,3,4,5};
        Arrays.stream(nums)
                .map((num)-> num * 2)
                .forEach(out::println); // the :: is a method reference that is used when the parameter the forEach takes is same as the parameter in the Print statement.

        // for exam this senerio below acts differently


        Stream.generate(()-> 0)
                .limit(5)
                .forEach(StreamsOnArraySample::displayNumber);

    }

    private static void displayNumber(int number){
        try {
            var writer = new BufferedWriter(new OutputStreamWriter(out));
            writer.write(number);
            writer.flush();
        }catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }
}
