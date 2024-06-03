package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        String[] colours = new String[] {"Red", "Green", "Blue"};

        Stream<String> stream1 = Arrays.stream(colours);

        Stream<String> stream2 = Stream.of(colours);

        Stream<String> stream3 = Stream.of("Red", "Green", "Yellow");

        List<String> coloursArray = new ArrayList<>();
        coloursArray.add("Red");
        coloursArray.add("Green");
        coloursArray.add("Blue");

        Stream<String> stream4 = coloursArray.stream();

        Set<String> coloursSet = Set.of("Red", "Green", "Blue");
        Stream<String> stream5 = coloursSet.stream();

        //Empty stream
        Stream<String> streamEmpty = Stream.empty();
    }
}
