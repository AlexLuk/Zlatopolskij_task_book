package chapter6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericalSequenceTest {
    @Test
    public void printLesserElements() throws Exception {
        NumericalSequence numericalSequence = new NumericalSequence();
        numericalSequence.printLesserElements(0.1);
        System.out.println("----");
        numericalSequence.printLesserElements(1);
        System.out.println("----");
        numericalSequence.printLesserElements(1.1);
        System.out.println("----");
        numericalSequence.printLesserElements(1.5);
        System.out.println("----");
        numericalSequence.printLesserElements(1.9);
        System.out.println("----");
        numericalSequence.printLesserElements(2);
        System.out.println("----");
        numericalSequence.printLesserElements(7);
        System.out.println("----");
    }

    @Test
    public void getGreaterNumber() throws Exception {
        NumericalSequence numericalSequence = new NumericalSequence();
        assertEquals(1, numericalSequence.getGreaterNumber(0));
        assertEquals(4, numericalSequence.getGreaterNumber(1));
        assertEquals(4, numericalSequence.getGreaterNumber(2));
        assertEquals(4, numericalSequence.getGreaterNumber(3));
        assertEquals(9, numericalSequence.getGreaterNumber(4));
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