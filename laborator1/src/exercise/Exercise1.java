package exercise;

import java.util.Scanner;

public class Exercise1 {
    /**
     * Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la
     * tastatura.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}