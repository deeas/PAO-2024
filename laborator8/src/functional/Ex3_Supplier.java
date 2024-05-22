package functional;

import java.util.function.*;

public class Ex3_Supplier {

    public boolean getAsBoolean() {
        BooleanSupplier booleanSupplier = () -> true;
        return booleanSupplier.getAsBoolean();
    }
    public double getAsDouble() {
        DoubleSupplier pi = () -> Math.PI;
        return pi.getAsDouble();
    }
    public int getAsInt() {
        IntSupplier maxInteger = () -> Integer.MAX_VALUE;
        return maxInteger.getAsInt();
    }
    public long getAsLong() {
        LongSupplier maxLongValue = () -> Long.MAX_VALUE;
        return maxLongValue.getAsLong();
    }
    public String asString(boolean empty) {
        Supplier<String> message = () -> {
            if (empty) {
                return "";
            } else {
                return "Get a string";
            }
        };
        return message.get();
    }
}
