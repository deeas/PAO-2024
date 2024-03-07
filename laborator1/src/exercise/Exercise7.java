package exercise;

import java.util.Scanner;
/**
 * Sa se afiseze al n-lea termen din seria Fibonacci, unde n este citit de la tastatura.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        // https://en.wikipedia.org/wiki/Fibonacci_number
/**     In mathematics, the Fibonacci numbers, form a sequence, the Fibonacci sequence, in which each number
 *      is the sum of the two preceding ones. The sequence commonly starts from 0 and 1, although some authors
 *      start the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2. Starting from 0 and 1,
 *      the first few values in the sequence are:
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.*/
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n <= 2) {
            System.out.println(1);
            return;
        }

        int fibo_1 = 0, fibo_n = 1, i = 2, temp;
        while (i < n) {
            temp = fibo_n;
            fibo_n += fibo_1;
            fibo_1 = temp;
            i++;
        }

        System.out.println("Al " + n + "-lea termen din seria Fibonacci: " + fibo_n);
    }
}
