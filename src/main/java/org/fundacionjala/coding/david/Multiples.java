package org.fundacionjala.coding.david;

/**
 * This class calculate number multiple of three and five.
 */
public class Multiples {

    /**
     * This method return values sum of multiple three and five.
     * @param newNumero is a value numeric.
     * @return value numeric.
     */
    public int multipleThreeAndFive(int newNumero) {
        int result = 0;
        for (int i = 1; i < newNumero; i++) {
            result = (i % 3 == 0 || i % 5 == 0) ? result + i : result;
        }
        return result;
    }

}
