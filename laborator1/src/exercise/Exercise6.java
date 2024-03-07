package exercise;

import java.util.Scanner;
/**
 * Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
 * notelor se opreste si programul afiseaza media acestora.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Citeste nota: ");
            int nota = scanner.nextInt();
            if (nota == -1) {
                if (count > 0) {
                    System.out.println("Media este: " + sum / count);
                }
                break;
            } else {
                sum += nota;
                count++;
            }
        }

        if (count <= 0) {
            System.out.println("Nu am putut calcula media");
        }
    }
}
