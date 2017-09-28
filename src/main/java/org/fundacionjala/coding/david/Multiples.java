package org.fundacionjala.coding.david;

/**
 * This class calculate number multiple of three and five.
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;

    private static final int MULTIPLE_FIVE = 5;

    /**
     * This method return values sum of multiple three and five.
     *
     * @param number is a value numeric.
     * @return value numeric.
     */
    public int multipleThreeAndFive(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            result = (i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0) ? result + i : result;
        }
        return result;
    }

}
