package stream.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Primitives {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(i -> System.out.print(i + " "));

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(l -> System.out.print(l + " "));

        System.out.println();

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(d -> System.out.print(d + " "));

        System.out.println();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().mapToInt(i -> i).sum());
    }
}
