package src.array;

import java.util.Arrays;
import java.util.Random;

public class Array_3 {
    public static void main(String[] args) {
        Integer[] ints = new Integer[10];

        System.out.println("Initialise array: ");
        Random random = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
            System.out.print(ints[i] + " ");
        }

        Arrays.sort(ints);
        System.out.println("Sorted array: ");

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
