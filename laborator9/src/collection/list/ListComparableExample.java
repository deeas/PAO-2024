package collection.list;

import collection.commons.ComparableStudent;
import collection.commons.NumberComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparableExample {
    public static void main(String[] args) {
        List<ComparableStudent> comparableStudents = new ArrayList<>();
        comparableStudents.add(new ComparableStudent("Popescu", "Mihai", 8l));
        comparableStudents.add(new ComparableStudent("Popescu", "Andrei", 8l));
        comparableStudents.add(new ComparableStudent("Ionescu", "Alex", 8L));
        comparableStudents.add(new ComparableStudent("Marinescu", "Alina", 9L));

        System.out.println(comparableStudents);
        Collections.sort(comparableStudents);
        System.out.println(comparableStudents);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(344534);
        numbers.add(13);
        numbers.add(7);

        System.out.println(numbers);
        Collections.sort(numbers, new NumberComparator());

        System.out.println(numbers);
    }
}
