package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedSample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,100,2,30,4,5,1);

        Comparator<Integer> comparator = (a,b)-> compareInDescendingOrder(a,b);
        var result = numbers.stream()
                    .sorted(comparator)
                    .distinct()
                            .collect(Collectors.toList());
//                            .collect(Collectors.toMap());
//                            .collect(Collectors.toSet());
                            //.collect(Collectors.toCollection(ArrayList::new));

                // using the collectionr
                // the distinct method will remove the identical element
                // NOTE that the order in which the operations are performed matters. if the distinct operation is performed before
        // the sorted it helps the operations get executed faster than if the other way round
//                    *****.toList()****;
        System.out.println(result); // arranges the elements in the natural order which is the ascending order

        // check compareTo() and compare()


    }

    private static int compareInDescendingOrder(Integer a, Integer b) {
            if (b > a) return  1;  // this order is reordering the natural order which naturally would mean that the numbers are compared lexicographically
                // and if a is greater than b then it would give a +1,if a is less than b then returns -1 but if they're equal returns 0

            else if (a > b) return  -1;
            return 0;
    }
}
