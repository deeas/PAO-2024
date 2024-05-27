package collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String args[]) {
        // Create a hash map
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        // Put elements to the map
        lhm.put("Zara", 3434.34);
        lhm.put("Mahnaz", 123.22);
        lhm.put("Ayan", 1378.00);
        lhm.put("Daisy", 99.22);
        lhm.put("Qadir", -19.08);

        // Get a set of the entries
        Set set = lhm.entrySet();

        // Get an iterator
        Iterator it = set.iterator();

        // Display elements
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = lhm.get("Zara");
        lhm.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " + lhm.get("Zara"));
    }
}
