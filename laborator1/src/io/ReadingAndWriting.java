package io;

import java.util.Scanner;

public class ReadingAndWriting {
    public static void main(String[] args) {

        // The Scanner class is useful when reading values, as it has utility methods for most primitives.
        Scanner scanner;

        // It can be set to read from the System console.
        scanner = new Scanner(System.in);

        System.out.println("Input text");
        // whole lines of text
        String string = scanner.nextLine();
        System.out.println("The text is: " + string);

        System.out.println("Read boolean: ");
        // It can read booleans
        boolean b = scanner.nextBoolean();
        System.out.println("The boolean is: " + b);

        // numeric types
        System.out.println("Read int: ");
        int i = scanner.nextInt();
        System.out.println("The int is: " + i);

        System.out.println("Read double: ");
        double d = scanner.nextDouble();
        System.out.println("The double is: " + d);

        System.out.println("End of reading");

        // Error output stream. (in the IDE and command line, this will behave exactly like the "out" stream, but it can
        // be configured to be redirected separately from it in production use.
        // The standard error stream is typically used to print any errors that occur when a program is running.
        System.err.println("Something bad has happened");
        System.err.print("Same as before, with a \\n at the end");
    }
}
