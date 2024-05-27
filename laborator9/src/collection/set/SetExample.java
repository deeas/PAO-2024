package collection.set;

import collection.commons.NumberComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("C");
        hs.add("F");
        System.out.println("HashSet " + hs);

        Set<String> lhs = new LinkedHashSet<>();

        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("C");
        lhs.add("F");
        System.out.println("LinkedHashSet " + lhs);

        Set<String> ts = new TreeSet<>();

        ts.add("X");
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");
        ts.add("E");
        ts.add("F");

        System.out.println("TreeSet " +  ts);

        Set<Integer> hsInts = new TreeSet<>(new NumberComparator());
        hsInts.add(10);
        hsInts.add(2);
        hsInts.add(5);

        System.out.println("TreeSet with comparator: " + hsInts);
     }
}
