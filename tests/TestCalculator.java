import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition")
    void testAddtion(){
        assertEquals(6, calculator.addition(1,5));
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtraction(){
        assertEquals(-4, calculator.subtraction(1,5));
    }

    @Test
    @DisplayName("Test divide")
    void testDivide(){
        assertEquals(2, calculator.divide(6,3));
    }

    @Test
    @DisplayName("Test multiply")
    void testMultiply(){
        assertEquals(18, calculator.multiply(6,3));
    }

}
