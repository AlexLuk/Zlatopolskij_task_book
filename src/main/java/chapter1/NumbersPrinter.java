package chapter1;

/**
 * 1.7.  Составить программу вывода на экран в одну строку трех любых чисел с двумя пробелами между ними.
 */
class NumbersPrinter {
    /** Print three numbers with two spaces between them
     * @param firstNumber
     * @param secondNumber
     * @param thirdNumber
     * @return result string
     */
    String printTreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        String result = firstNumber + "  " + secondNumber + "  " + thirdNumber;
        System.out.println(result);
        return result;
    }
}
