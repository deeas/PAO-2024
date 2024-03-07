package exercise;

import java.util.Scanner;
/**
 * Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de
 * paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        int v[] = new int[n];
        int y[] = new int[n];
        int n_v = 0, n_y = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Read element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            if (element % 2 == 0) {
                v[n_v] = element;
                n_v++;
            } else {
                y[n_y] = element;
                n_y++;
            }
        }

        System.out.println("Vectorul x: ");
        for (int i = 0; i < n_v; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();

        System.out.println("Vectorul y: ");
        for (int i = 0; i < n_y; i++) {
            System.out.print(y[i] + " ");
        }
    }
}
