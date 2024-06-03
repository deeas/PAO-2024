package stream.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream<String> colours = Stream.<String>builder()
                .add("Red")
                .add("Green")
                .add("Blue")
                .build();

        System.out.println(colours.collect(Collectors.toList()));

    }
}
