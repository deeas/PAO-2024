package src.practice;

/**
 * Write a Java program to remove the duplicates from a given array
 * and return the new length of the array
 */
public class Ex_1 {
    public static void main(String[] args) {
        int[] array = {10, 7, 67, 67, 78, 34, 45, 34, 11, 12, 11, 34, 10};

        int len = array.length;
        int[] app = new int[101];

        for (int value : array) {
            if (app[value] == 0) {
                System.out.print(value + " ");
                app[value]++;

            } else {
                len--;
            }
        }
        System.out.println("Length: " + len);
    }
}
