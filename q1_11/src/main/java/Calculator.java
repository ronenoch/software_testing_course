import java.util.Arrays;
import java.util.Objects;
import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static Object raise_exception() throws Exception {
        throw new Exception();
    }

    static double divide(double... operands) {
//        for (double i : Arrays.stream(operands).toArray()) {
        for (double i : Arrays.stream(operands).skip(1).toArray()) {
            if (0 == i) {
                throw new ArithmeticException();
            }
        }
        return DoubleStream.of(operands)
                .reduce((a, b) -> a / b).getAsDouble();
    }

    static Double returnNULL() {
        return null;
    }
    static double divide_and_add_2_q2(double... operands) {
        return 2 + divide(operands);
    }
}