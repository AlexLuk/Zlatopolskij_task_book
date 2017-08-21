package chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersPrinterTest {

    @Test
    public void printTreeNumbers() throws Exception {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        String testString = "1  2  3";
        assertEquals(numbersPrinter.printTreeNumbers(1, 2, 3), testString);

        testString = "22  0  1";
        assertEquals(numbersPrinter.printTreeNumbers(22, 0, 1), testString);

        testString = "1  2  3";
        assertEquals(numbersPrinter.printTreeNumbers(2, 2, 3), testString);

        testString = "2  4  3";
        assertEquals(numbersPrinter.printTreeNumbers(2, 4, 3), testString);
    }
}