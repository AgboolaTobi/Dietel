package Streams;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {

        /*
        first creates a list to source our elements from
        Then calls the stream on the list
        Then maps the element to int from the generic type coming

        Note that it can be vice verse,the map can also be used to transform from primitive type to generic type e.g from int to obj
         */
        Integer result = List.of(10,20,30,40)
                .stream()
                .mapToInt((number)->number)
                .sum();
        System.out.println(result);

        Integer result2 = List.of("Mango","Orange","Banana","Guava")
                .stream()
                .mapToInt((number)->number.length())
                .sum();
        System.out.println(result2);
    }


}
