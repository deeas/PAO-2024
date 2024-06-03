package stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(listOfIntegers);

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println("Max is : " + max.get());
        }

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(integer -> System.out.println("Min is :" + integer));


        System.out.println("Count: " + (long) list.size());

        Optional<String> opt = Optional.of("NonNullString");
        Optional<String> nullableOpt = Optional.ofNullable(null);

        System.out.println(opt.isPresent());
        System.out.println(nullableOpt.isPresent());
    }
}
