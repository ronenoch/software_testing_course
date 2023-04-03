import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    void divide() {

        assertEquals(1, Calculator.divide(2, 2), 1.0E-15);
        assertEquals(0, Calculator.divide(0.000001, 1000000000), 1.0E-15);
        assertNotEquals(4, Calculator.divide(2.00000000000001, 2), 1.0E-15);
    }
    @Test
    void divide_zero() {

        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(2, 0);
        });
    }

    @Test
    void raise_exception() {

        assertThrows(Exception.class, () -> {
            Calculator.raise_exception();
        });

    }
    @Test
    void returnNull() {

        Calculator calc = new Calculator();
        calc.returnNULL();
    }

    @Test
    void divide_q2() {
        Calculator calc = new Calculator();
        calc.divide(1,1);

    }


}