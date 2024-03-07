package arrays;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        // sort
        float[] values = new float[3];
        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        Arrays.sort(values);

        System.out.println("The values sorted in ascending order: ");

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // equals
        long[] array1 = {12L, 56L, 9999L};
        long[] array2 = {1L, 2L, 3L};

        boolean equals = Arrays.equals(array1, array2);
        System.out.println("The arrays are equal? " + equals);
        System.out.println("The arrays are equal? " + Arrays.equals(array1, array1));

        /* binary search
        //Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
        //In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method. */
        int valSearched1 = Arrays.binarySearch(values, 10.0f);
        int valSearched2 = Arrays.binarySearch(values, 11.0f);

        System.out.println("First value searched is at index: " + valSearched1);
        System.out.println("Second value searched: " + valSearched2);
    }
}
