package stream.operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortDistinct {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "C", "B", "D", "A", "B");

        List<String> distinctElements = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct elements: " + distinctElements);

        list = Arrays.asList("A", "C", "B", "D", "A", "B");

        List<String> distinctSortedElements = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Distinct sorted elements: " + distinctSortedElements);

    }
}
