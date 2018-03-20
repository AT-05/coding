package org.fundacionjala.coding.abner;

/**
 * This class check multiples.
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;

    private static final int MULTIPLE_FIVE = 5;

    /**
     * @param number Multiplier numbers.
     * @return the sum total.
     */
    public int multiplesSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0 ? i : 0;
        }
        return sum;
    }
}
