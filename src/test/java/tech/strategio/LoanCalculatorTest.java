package tech.strategio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanCalculatorTest {

    @BeforeEach
    void setup() {
        new LoanCalculator();
    }

    @Test
    void test20000() {
        assertEquals(14580, LoanCalculator.getRemainingAmountIn3Months(20000));
    }

    @Test
    void test100000() {
        assertEquals(72900, LoanCalculator.getRemainingAmountIn3Months(100000));
    }

    @Test
    void test500000() {
        assertEquals(364500, LoanCalculator.getRemainingAmountIn3Months(500000));
    }

    @Test
    public void test0() {
        assertEquals(0, LoanCalculator.getRemainingAmountIn3Months(0));
    }

    @Test
    public void test27() {
        assertEquals(21, LoanCalculator.getRemainingAmountIn3Months(27));
    }

}