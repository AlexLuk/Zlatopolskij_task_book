package chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldOfViewCalculatorTest {

    @Test
    public void getDistanceToHorizon() throws Exception {
        FieldOfViewCalculator fieldOfViewCalculator = new FieldOfViewCalculator(6350);
        assertEquals(fieldOfViewCalculator.getDistanceToHorizon(10), 356);
        assertEquals(fieldOfViewCalculator.getDistanceToHorizon(350), 2137);
    }
}