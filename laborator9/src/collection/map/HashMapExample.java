package collection.map;

import collection.commons.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, Student> students = new HashMap<Integer, Student>();

        students.put(1,  new Student("Ionescu", "Matei",  5L));
        students.put(2, new Student("Popescu", "Andrei", 6L));
        students.put(3,  new Student("Marinescu", "Mihai",  10L));

        System.out.println(students.get(2));

        // adaugăm un element cu aceeași cheie
        System.out.println(students.put(2, new Student("", "", 0L)));
        // put(...) întoarce elementul vechi

        // si îl suprascrie
        System.out.println(students.get(2));

        // remove(...) returnează elementul șters
        System.out.println(students.remove(2));

        // afișăm structura de date
        System.out.println(students);

        //for-each
        for (Map.Entry<Integer, Student> pair : students.entrySet()) {
            if (pair.getKey() == 1) {
                pair.setValue(new Student("", "", 0L));
            }
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue());
            System.out.println();
        }

        System.out.println(students.keySet());

    }
}
