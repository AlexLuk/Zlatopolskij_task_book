package chapter6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericalSequenceTest {
    @Test
    public void getNumberMoreThen() throws Exception {
        NumericalSequence numericalSequence = new NumericalSequence();
        assertEquals(1,numericalSequence.getNumberMoreThen(0));
        assertEquals(4,numericalSequence.getNumberMoreThen(1));
        assertEquals(4,numericalSequence.getNumberMoreThen(2));
        assertEquals(4,numericalSequence.getNumberMoreThen(3));
        assertEquals(9,numericalSequence.getNumberMoreThen(4));
    }

    @Test
    public void sequenceCount() throws Exception {
        NumericalSequence numericalSequence = new NumericalSequence();
        int[] inputSequence = new int[]{1, 2, 3, 0};
        assertEquals(4, numericalSequence.sequenceCount(inputSequence));

        inputSequence = new int[]{0};
        assertEquals(1, numericalSequence.sequenceCount(inputSequence));
    }

    @Test
    public void sequenceSum() throws Exception {
        NumericalSequence numericalSequence = new NumericalSequence();

        assertEquals(3, numericalSequence.sequenceSum("1 1 1 0"));

        assertEquals(0, numericalSequence.sequenceSum("0"));

        assertEquals(1, numericalSequence.sequenceSum("1 0"));
    }

}