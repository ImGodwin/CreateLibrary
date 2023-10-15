package GodwinE.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        //How Streams work

        /*List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream().filter(el -> el.startsWith("c")).map(el -> el.toUpperCase())
                .sorted().forEach(s -> System.out.println(s));*/

        //Arrays.asList("a1", "a2", "b1", "c2", "c1").stream().findFirst().ifPresent(s -> System.out.println(s));

        //Stream.of("a1", "a2", "b1", "c2", "c1").findFirst().ifPresent(s -> System.out.println(s));
        //Stream.of is used to create a stream from a bunch of object references

        //A stream of Int Long and Double can be created too (primitive streams)

        //IntStream.range(1, 7).forEach(el-> System.out.println(el));

        //Arrays.stream(new int[] {1, 2, 3, 4, 5}).map(n -> (2 * n) + 1)
        // .average().ifPresent(el -> System.out.println(el));

        //processing order
        //Every stream must have a terminal for it to execute appropriately
        //forEach is an example of a terminal



        //sorting is also called "Stateful"
        //streams cannot be used as long as u call any terminal operation.
        //calling noneMatch after anyMatch in the same stream throws an exception

        //to solve this problem of creating a new stream for every terminal operation,
        // we could execute a stream supplier to construct a new stream

       /* Supplier<Stream<String>> streamSupplier = () -> Stream.of("a1", "a2", "b1", "c2", "c1")
                .filter(s -> s.startsWith("a"));

        streamSupplier.get().anyMatch(s -> true); //each call to get() constructs a new stream
        streamSupplier.get().noneMatch(s -> true);*/

        //Collect is an extremely useful terminal operation to transform the elements of the stream into
        //a different kind of result e.g list, set, map

        /*List<Book> filtered = books.stream().filter(b-> b.startsWith("p")).collect(Collectors.toList());
        System.out.println(filtered);*/

        //In the above case, if you do not want a set, use a to.Set();


       // 1. Write a Java program to calculate the average of a list of integers using streams.
    }
}
