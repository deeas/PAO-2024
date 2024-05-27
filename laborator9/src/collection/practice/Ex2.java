package collection.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex2 {

    public static void main(String[] args) {
        String string = "abracadabra";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if (map.get(c) == null)  {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) +1);
            }
        }
        System.out.println(map);
    }

}
