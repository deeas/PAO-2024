package functional;

import java.util.Arrays;
import java.util.function.*;
public class Ex4_Consumer {

    public void printBiConsumer() {
        BiConsumer<String, String> echo = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        echo.accept("This is first line.", "Here is another line");
    }
    public void convertToLowercase() {
        Consumer<String> convertToLowercase = s -> System.out.println(s.toLowerCase());
        convertToLowercase.accept("convert to ALL lowercase");
    }
    public void printPrefix() {
        Consumer<String> sayHello = name -> System.out.println("Hello, " + name);
        for (String name : Arrays.asList("Silvia", "John", "Doe")) {
            sayHello.accept(name);
        }
    }
    public void printDoubleConsumer() {
        DoubleConsumer echo = System.out::println;
        //echo = d -> System.out.println(d);
        echo.accept(3.3);
    }
    public void printIntConsumer() {
        IntConsumer echo = System.out::println;
        echo.accept(3);
    }
    public void printLongConsumer() {
        LongConsumer echo = System.out::println;
        echo.accept(34L);
    }

}
