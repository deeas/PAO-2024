package arrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        float values[] = new float[3];
        float[] values2 = new float[3];

        // we use the keyword "new" and then float[3] to allocate space to store 3 float values
        // each element is accessed via an index - and indexes range from 0 to number of elements in the array minus 1
        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        // Exercise: go through the values array and add everything up
        float sum = 0.0f; // allocate some space to store the result called sum.

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("WITH FOR: " + sum);

        // SAU enhanced for
        for (float name : values) {
            sum += name;
        }
        System.out.println("WITH ENHANCED FOR: " + sum);

    }

    public static class Example4 {
        public static void main(String[] args) {
    //      int[][] wrong = new int[][]; // not OK, you must specify 1st dimension
            int[][] right = new int[2][]; // OK
            int right2[][] = new int[2][]; // OK

            String[][] myArray = new String[5][]; // OK
            String[][] yourArray = new String[5][4]; // OK

            // initializing two dimensional array as literal
            String[][] names = {{"Sam", "Smith"}, {"Robert", "Downey Jr"}, {"Ryan", "Gosling"}};
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names[i].length; j++) {
                    System.out.print(names[i][j]+ " ");
                }
                System.out.println();
            }

            String[][] names2 = {{"Sam1", "Smith"}, {"Robert", "Downey Jr"}, {"Ryan", "Gosling"}};

            System.out.println("Names and names2 are:  " + Arrays.deepEquals(names, names2));

            int[][] board = new int[3][3];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = i + j;
                }
            }
            for (int[] cols : board) {
                for (int anInt : cols) {
                    System.out.print(anInt);
                }
                System.out.println();
            }

        }
    }
}
