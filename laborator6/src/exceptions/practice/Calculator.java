package exceptions.practice;

import exceptions.practice.exceptions.DivisionByZeroException;
import exceptions.practice.exceptions.NullElementException;
import exceptions.practice.exceptions.OverflowException;

public class Calculator {
    public static Double add(Double a, Double b) throws NullElementException, OverflowException {
        validateForNulls(a, b);

        if (Double.MAX_VALUE - a < b) {
            throw new OverflowException("a + b exceed double max value");
        }

        return a + b;
    }

    public static Double divide(Double a, Double b) throws NullElementException, DivisionByZeroException {
        validateForNulls(a, b);

        if (b == 0) {
            throw new DivisionByZeroException("b cannot zero");
        }

        return a / b;
    }

    private static void validateForNulls(Double a, Double b) throws NullElementException {
        if (a == null || b == null) {
            throw new NullElementException("a or b cannot be null");
        }
    }
}
