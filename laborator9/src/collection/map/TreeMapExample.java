package collection.map;

import collection.commons.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Student> treeMap = new TreeMap<>();   //we can pass a comparator as parameter

        treeMap.put(1, new Student("Popescu", "Mihai", 8L));
        treeMap.put(3, new Student("Ionescu", "Alex", 8L));
        treeMap.put(2, new Student("Marinescu", "Alina", 9L));

        for (Map.Entry<Integer, Student> pair : treeMap.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }
    }
}
