import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    // test cases for sum function
    @Test
    public void sumTruePositive(){
        assertEquals("Finding sum for True Positive", 19, calculator.sum(14,5), DELTA);
        assertEquals("Finding sum for True Positive", 2, calculator.sum(1,1), DELTA);
        assertEquals("Finding sum for True Positive", 108, calculator.sum(99,9), DELTA);
        assertEquals("Finding sum for True Positive", 16, calculator.sum(16,0), DELTA);
    }
    @Test
    public void sumFalsePositive(){
        assertNotEquals("Finding maximum for False Positive", 15, calculator.sum(4,5), DELTA);
        assertNotEquals("Finding maximum for False Positive", 12, calculator.sum(1,1), DELTA);
        assertNotEquals("Finding maximum for False Positive", 9, calculator.sum(99,9), DELTA);
        assertNotEquals("Finding maximum for False Positive", 1661, calculator.sum(16,166), DELTA);
    }
    // test cases for maximum function
    @Test
    public void maximumTruePositive(){
        assertEquals("Finding maximum for True Positive", 5, calculator.maxi(4,5), DELTA);
        assertEquals("Finding maximum for True Positive", 1, calculator.maxi(1,1), DELTA);
        assertEquals("Finding maximum for True Positive", 99, calculator.maxi(99,9), DELTA);
        assertEquals("Finding maximum for True Positive", 166, calculator.maxi(16,166), DELTA);
    }
    @Test
    public void maximumFalsePositive(){
        assertNotEquals("Finding maximum for False Positive", 15, calculator.maxi(4,5), DELTA);
        assertNotEquals("Finding maximum for False Positive", 12, calculator.maxi(1,1), DELTA);
        assertNotEquals("Finding maximum for False Positive", 9, calculator.maxi(99,9), DELTA);
        assertNotEquals("Finding maximum for False Positive", 1661, calculator.maxi(16,166), DELTA);
    }

    // test cases for minimum function

    @Test
    public void minimumTruePositive(){
        assertEquals("Finding minimum for True Positive", 5, calculator.mini(14,5), DELTA);
        assertEquals("Finding minimum for True Positive", 1, calculator.mini(1,1), DELTA);
        assertEquals("Finding minimum for True Positive", 9, calculator.mini(99,9), DELTA);
        assertEquals("Finding minimum for True Positive", 16, calculator.mini(16,166), DELTA);
    }
    @Test
    public void minimumFalsePositive(){
        assertNotEquals("Finding minimum for False Positive", 5, calculator.mini(4,5), DELTA);
        assertNotEquals("Finding minimum for False Positive", 12, calculator.mini(1,1), DELTA);
        assertNotEquals("Finding minimum for False Positive", 99, calculator.mini(99,9), DELTA);
        assertNotEquals("Finding minimum for False Positive", 166, calculator.mini(16,166), DELTA);
    }

    // test cases for factorial function
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.fact(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 40320, calculator.fact(8), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 5040, calculator.fact(7), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(8), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 204, calculator.fact(7), DELTA);
    }

   // test cases for power function
    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 16, calculator.power(2, 4), DELTA);
        assertEquals("Finding power for True Positive", 16, calculator.power(4, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 8), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }


// tests for natural logrithms
    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
        assertNotEquals("Finding natural log for False Positive", 71.3, calculator.naturalLog(2.1), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(290.1), DELTA);
    }

    // test cases for square root
    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.sqroot(1), DELTA);
        assertEquals("Finding square root for True Positive", 3, calculator.sqroot(9), DELTA);
        assertEquals("Finding square root for True Positive", 4, calculator.sqroot(16), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(30), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(47), DELTA);
    }



}
