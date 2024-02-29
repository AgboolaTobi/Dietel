package Streams;

import java.util.List;

public class AnotherExample {
    public static void main(String[] args) {

        //the map operations is a transformation operation that takes one thing and returns a transformed value of the element or data passed into it
        String result = List.of(10,20,30,40)
                .stream()
                .map(String::valueOf)
//                .reduce((x,y)->x.concat(y)).orElseThrow();
                .reduce("",(x,y)->x.concat(y)); // this will not need the exception because we have declared the identity type of the first element
        // that will be the first value of x each time the conct method or operation is called

        System.out.println(result);
        /*
        the stream out will be [10,20,30,40]
        the map output will be {"10","20","30","40"}
         */
    }
}
