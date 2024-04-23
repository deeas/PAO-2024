package exceptions.practice;

import exceptions.practice.exceptions.NullElementException;
import exceptions.practice.exceptions.OverflowException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Calculator.add(10.4, 22.4));
            System.out.println(Calculator.add(null, null));
        } catch (NullElementException | OverflowException e) {
            System.out.println("Datele introduse nu sunt valide: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
