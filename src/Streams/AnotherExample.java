package Streams;

import java.util.List;

public class AnotherExample {
    public static void main(String[] args) {

        //the map operations is a transformation operation that takes one thing and returns a transformed value of the element or data passed into it
        String result = List.of(10,20,30,40)
                .stream()
                .map(String::valueOf)
                .reduce((x,y)->x.concat(y)).orElseThrow();


        System.out.println(result);
        /*
        the stream out will be [10,20,30,40]
        the map output will be {"10","20","30","40"}
         */
    }
}
