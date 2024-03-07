package exercise;

import java.util.Scanner;
/**
 * Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
