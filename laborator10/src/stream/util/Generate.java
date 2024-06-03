package stream.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        // creates a sequence of ten strings with the value – “element”.
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

        List<String> collect = streamGenerated.collect(Collectors.toList());
        System.out.println(collect);
    }
}
