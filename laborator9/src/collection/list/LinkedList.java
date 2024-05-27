package collection.list;

import collection.commons.Student;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<Student> students = new java.util.LinkedList<>();

        students.add(new Student("Popescu", "Mihai", 8L));
        students.add(new Student("Ionescu", "Alex", 8L));
        students.add(new Student("Marinescu", "Andreea", 9L));

        Iterator<Student> descIterator = students.descendingIterator();

        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        System.out.println();

        System.out.println("First element: " + students.getFirst());
        System.out.println("Last element: " + students.getLast());

        List<Integer> ints = new java.util.LinkedList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);

        Integer[] intsArray = (Integer[]) ints.toArray();

        ints = Arrays.asList(intsArray);
    }
}
