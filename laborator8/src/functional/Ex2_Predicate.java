package functional;

import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Ex2_Predicate {

    public boolean whichIsBiggerBiPredicate(int n1, int n2) {
        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        return isBigger.test(n1, n2);
    }
    public boolean isPositiveDoublePredicate(double n) {
        DoublePredicate isPositive = x -> x > 0;
        return isPositive.test(n);
    }
    public boolean isNegativeIntPredicate(int n1) {
        IntPredicate isNegative = x -> x < 0;
        return isNegative.test(n1);
    }
    public boolean isDivisibleByThreeLongPredicate() {
        LongPredicate isDivisibleBy3 = x -> x % 3 == 0;
        return isDivisibleBy3.test(12);
    }
    public boolean isEvenPredicate(int nr) {
        Predicate<Integer> isEven = s -> s % 2 == 0;
        return isEven.test(nr);
    }

    public Predicate<Integer> getIsEven() {
        Predicate<Integer> isEven = s -> s % 2 == 0;

        return isEven;
    }

    public void filterEvens(List<Integer> numbers) {
        numbers.stream()
                .filter(getIsEven())
                .forEach(number -> System.out.println("Even number: " + number));
    }
}
