package org.fundacionjala.coding.abner;

/**
 * This class check multiples.
 * Created by Abner on 18/08/2017.
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;
    private static final int MULTIPLE_FIVE = 5;

    /**
     * @param numMax Multiplier numbers.
     * @return the sum total.
     */


    public int multiplesSum(int numMax) {
        int sum = 0;
        for (int i = 1; i < numMax; i++) {
            sum += (i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0) ? i : 0;
        }
        return sum;
    }
}
