package chapter6;


public class NumericalSequence {
    /**
     * 6.1.  Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
     * а) сумму всех чисел последовательности;
     * б) количество всех чисел последовательности.
     * <p>
     * Get sum of integer numbers in sequence
     *
     * @param sequenceAsString - input sequence of numbers in fortm of string
     * @return - sum of elements
     */
    public int sequenceSum(String sequenceAsString) {
        int sumValue = 0;
        String[] splitSequence = sequenceAsString.split(" ");
        for (int i = 0; i < splitSequence.length; i++) {
            try {
                sumValue += Integer.parseInt(splitSequence[i]);
            } catch (NumberFormatException e) {
                System.err.println("Wrong number format");
                e.printStackTrace();
            }
        }
        return sumValue;
    }

    /**
     * Count elements of sequence
     *
     * @param sequence - input sequence as array of integers
     * @return - count of elements
     */
    public int sequenceCount(int[] sequence) {
        return sequence.length;
    }

    /*
    * 6.9. Среди чисел 1, 4, 9, 16, 25, ... найти первое число, большее n.
    *
    * Get the first element of sequence that is greater numForCheck
    *
    * @param numForCheck - integer value to be compared with elements of sequence
    * @return - first greater then numForCheck element of sequence
    */
    public int getGreaterNumber(int numForCheck) {
        int targetNumber = 1;
        int currentNumber = 1;
        while (targetNumber <= numForCheck) {
            targetNumber = (int) Math.pow(currentNumber, 2);
            currentNumber += 1;
        }
        return targetNumber;
    }

    /**
     * 6.15. Дано вещественное число а. Из чисел 1,1 + 1/2  ,1 + 1/3   , ..., напечатать те, которые меньше а.
     * <p>
     * Print elements of sequence lesser then target value numForCheck.
     *
     * @param numForCheck - number for compare with elements of sequence
     */
    public void printLesserElements(double numForCheck) {
        if (numForCheck <= 1) {
            System.out.println("number is too small");
        } else {
            double currentDivider = 1;
            double currentElement = 1;
            while (currentElement <= numForCheck) {
                System.out.println(currentElement);
                currentDivider++;
                currentElement = currentElement + (1 / currentDivider);
                if (currentDivider > 1000) {
                    System.out.println("sorry, too long to calculate");
                    break;
                }
            }
        }
    }
}

