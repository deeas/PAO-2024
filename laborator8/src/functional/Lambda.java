package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        //() -> {};

        //colors.forEach((color) -> {System.out.println(color)});

        colors.forEach(color -> System.out.println(color));

        System.out.println("Sorted colors:");
        List<String> noPinkColors = colors
                .stream()
                .sorted()
                .filter(color -> !color.equals("Pink"))
                .collect(Collectors.toList());
        noPinkColors.forEach(System.out::println);
    }
}

