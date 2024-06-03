package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a method that converts all strings in a list to their upper case.
public class Ex2 {

    public static void main(String[] args) {
        List<String> colours = Arrays.asList("red", "blue", "yellow");
        colours.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //ex4
        List<String> list = Arrays.asList("ana", "maria", "ani", "adelina", "Andreea");

        List<String> collect = list.stream()
                .filter(s -> s.length() == 3 && s.charAt(0) == 'a')
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
