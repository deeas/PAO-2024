package collection.list;


import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> vegetables =new ArrayList<>();


        List<String> plants =new ArrayList<>(60);

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Grape", "Pear", "Pear"));

        fruits.add("Apple");

        //fruits.add(0,"Pear");

        System.out.println(fruits.get(4));

        fruits.set(1, "Cherry");

        //fruits.remove(2);
        System.out.println("Before remove pear" + fruits);
        fruits.remove("Pear");

        System.out.println("After remove pear" + fruits);

        System.out.println("\nFor-each iteration: ");

        for (String fruit: fruits) {
            System.out.println(fruit + " ");
        }

        System.out.println("\n Iterator iteration");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
//fruits.remove(1);
            if (fruit.equals("Apple")) {
                iterator.remove();
            }

            System.out.println(fruits);
       }

        System.out.println("Iterate backward: ");

        ListIterator<String> backwardIterator = fruits.listIterator();

        while(backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous() + " ");

        }

        fruits.add("Blackberry");

        Collections.sort(fruits);
        System.out.println(fruits);

        int grapeIndex = Collections.binarySearch(fruits, "Grape");

        if (grapeIndex >= 0) {
            System.out.println("GRape was found at index: " + grapeIndex);

        } else {
            System.out.println("Grape not found");
        }

    }
}
