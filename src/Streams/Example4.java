package Streams;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(List.of(10,20,30),
                List.of(100,200,300),
                List.of(1000,2000,3000));

        listOfLists.stream()    //[[10,20,30],[100,200,300],[1000,2000,3000]]
                .flatMap((list)->list.stream())
                .forEach((number)-> System.out.println(number));
    }

}
