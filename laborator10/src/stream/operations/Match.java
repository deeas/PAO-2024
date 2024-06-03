package stream.operations;

import java.util.stream.Stream;

public class Match {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        boolean anyMatch = stream.anyMatch(s -> s.contains("rterte"));

        stream = Stream.of("one", "two", "three", "four");
        boolean noneMatch = stream.noneMatch(s -> s.contains("four"));
        System.out.println("None Match: " + noneMatch);

        stream = Stream.of("four1", "four2", "four3", "four4");
        boolean allMatch = stream.allMatch(s -> s.contains("four"));
        System.out.println("AllMatch: " + allMatch);
        System.out.println("Any MAtch: " + anyMatch);

    }
}
