package Streams;

public class Note {

    /*
    these are intermediate operations of the stream
    filter()
    map()
    flat()
    sorted()
    distinct()

    these are the terminal operations of the steams(i.e operations that terminate or end stream operations)
    forEach()
    sum()
    count()
    reduce
    collect



    //any method of the stream api that is not static or default but returns a stream is an intermediate operation.
    // any many method of the api that isnt static nor default nothing returns something that isnt a stream is a terminal operation

    first creates a list to source our elements from
        Then calls the stream on the list
        Then maps the element to int from the generic type coming

        Note that it can be vice verse,the map can also be used to transform from primitive type to generic type e.g from int to obj

        Flatmap is an operation you can perform when you have a collection of collections

        NOTE
        Any operations intermediate or terminal operation that changes the state of the stream,it is a stateful operation.
         BUT those that do not alter the state of the stream are stateless operations
        Examples of intermediate operations that are stateful are filter,map
        while example of terminal operations that are stateful is the reduce method

        The collect enables us to obtain a collection from a stream while stream enables us to obtain stream from a collection
     */
}
